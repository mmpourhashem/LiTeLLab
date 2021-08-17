/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class App {
	public static void main(String[] args) {
		//		<RunningExample>
		//		String runningExample = "Bound: 2 " + "Formula:"
		//				+ "(!! (&& (-P- a) (next (-p- b))))"
		//				+ "SoftFormulae:"
		//				+ "(soft (@ (-p- b) 1) 2.6) (soft (-P- a) 2.5)";
		//		App.run(runningExample);
		//		</RunningExample>
		//		String s = "Bound: 4" + "Formula:"
		//				+ "(&& (&& (-p- a) (!! (next (alwf (-p- a))))) (next (alwf (-p- c))))" + "SoftFormulae:"
		//				+ "(soft (-p- a) 11)" + "(soft (@ (-p- b) 3) 22)";
		//		App.run(s);
		if (args.length == 0)
			System.out.println("The jar file can be executed by the command \"java -jar litellab.jar Path_to_the_OLTL_script.txt\". This runs the OLTL specification written in the file.\n\nAlternatively, any of two case studies (\"exam\" and \"or\") can be executed by giving the case study name instead of file path.\n\nZ3 should be installed on the machine and the file runZ3.sh should be modified according to the Z3 installation.\n\nLitellab will prodcues the following files:\n	oltl.output.txt: The main output that can be UNSAT or a trace with the total amount of cost in the end.\n	z3.input.smt2: The smt2 script prodcued to be solved by Z3.\n	z3.output.smt2: The model prodcued by Z3.");
		else if (args[0].equals("exam")) {
//			<Run Examination timetabling problem case study>
			Exam5F1 exam = new Exam5F1();
			App.run(exam.getOLTLScript(), "exam5F1");
//			</Run Examination timetabling problem case study>
		}
		else if (args[0].equals("or")) {
//		<Run Operation room case study>
			OperatingRoom or = new OperatingRoom();
			App.run(or.getOLTLScript(), "or");
//		</Run Operation room case study>
		}
		else {
			String oltlScript = "";
			try
	        {
	            oltlScript = new String (Files.readAllBytes(Paths.get(args[0])));
	            App.run(oltlScript);
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
		}
		
			
		//		

		//		parseOutput("or");
		// parseOutput();
		// runFromFile();
	}

	public static void run(String script) {
		run(script, "");
	}

	public static void run(String script, String testCase) {
		SMT2Builder sb = new SMT2Builder(script);
		writeSMT2(sb.getSMT2Model());
		parseOutput(testCase);
		// System.out.println(sb.getSMT2Model());
	}

	public static void runFromFile() {
		String line = null;
		StringBuilder script = new StringBuilder();
		String ls = System.getProperty("line.separator");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("./oltl.input.txt")));
			while ((line = reader.readLine()) != null) {
				script.append(line);
				script.append(ls);
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		run(script.toString());
	}

	public static void writeSMT2(String smt2Model) {
		String fileName = "z3.input.smt2";
		try {
			FileWriter smt2 = new FileWriter(fileName);
			BufferedWriter out = new BufferedWriter(smt2);
			out.write(smt2Model);
			out.close();
			try {
				ProcessBuilder processBuilder = new ProcessBuilder("./runZ3.sh");
				processBuilder.inheritIO();
				Process process = processBuilder.start();
				int exitValue = process.waitFor();
				//				if (exitValue != 0) {
				//					new BufferedInputStream(process.getErrorStream());
				//					throw new RuntimeException("execution of script failed!");
				//				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean parseOutput(String testCase) {
		int bound = Model.getBound();
		int loop = 0;
		String penalty = "Since there is no soft-formuala, there is no penalty.";
		boolean unsat = false;
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream("./z3.output.txt"), "Cp1252"));
			String line;

			ArrayList<Bitvector> rows = new ArrayList<Bitvector>();
			while ((line = br.readLine()) != null) {
				if (line.equals("unsat")) {
					unsat = true;
					break;
				}
				if (line.contains("(define-fun oltl") || line.contains("(define-fun in_loop"))
					continue;
				if (line.contains("(define-fun i_loop")) {
					line = br.readLine();
					String value = line.substring(line.indexOf('#') + 2, line.length() - 1);
					if (line.contains("#b"))
						loop = Integer.parseInt(value, 2);
					else if (line.contains("#x"))
						loop = Integer.parseInt(value, 16);
				}
				if (line.contains("(define-fun ")) {
					String[] ss = line.trim().split(" ");
					String name = ss[1];
					line = br.readLine();
					String value = line.substring(line.indexOf('#') + 2, line.length() - 1);
					if (line.contains("#x"))
						rows.add(new Bitvector(name, new BigInteger(value, 16).toString(2)));
					else
						rows.add(new Bitvector(name, value));
				}
				if (line.contains("(objectives")) {
					line = br.readLine();
					line = line.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(" ", "");
					if (line.length() > 0)
						penalty = line;
					break;
				}

			}
			br.close();
//			if (testCase.length() > 0)
//				writeToExcel(testCase, "./conf.xlsx", bound, rows);
			try {
				PrintWriter writer = new PrintWriter("oltl.output.txt", "UTF-8");
				if (unsat)
					writer.println("UNSAT");
				else {
					for (int time = 0; time <= bound; time++) {
						writer.println("--- time " + time + " ---");
						if (time == loop)
							writer.println("*LOOP*");
						for (Bitvector bv : rows)
							if (bv.getAtTime(time))
								writer.println(bv.getName());
					}
					writer.println("\nCost: " + penalty);
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return unsat;
	}

	private static void writeToExcel(String testCase, String excelFilePath, int bound, ArrayList<Bitvector> rows) {
		try {
			if (testCase.equals("conf")) {
				FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
				Workbook workbook = WorkbookFactory.create(inputStream);

				Sheet sheet = workbook.getSheetAt(0);
				clearConfTable(sheet);
				int row = 0;
				for (int time = 0; time <= (bound - 1); time++) {
					for (Bitvector bv : rows)
						if (bv.getAtTime(time)) {
							if (bv.getName().startsWith("HL")) {
								if (bv.getName().startsWith("HL1"))
									row = 2;
								else if (bv.getName().startsWith("HL2"))
									row = 4;
								else if (bv.getName().startsWith("HL3"))
									row = 6;

								if (bv.getName().substring(3, 5).equals("SC"))
									setCellValue(sheet, row, time + 1, getSCTitle(
											Integer.parseInt(bv.getName().substring(5, bv.getName().length()))));
								else if (bv.getName().substring(3, 5).equals("AT"))
									appendCellValue(sheet, row + 1, time + 1,
											Integer.parseInt(bv.getName().substring(5, bv.getName().length())));
							}
						}
				}

				inputStream.close();
				FileOutputStream outputStream = new FileOutputStream(excelFilePath);
				workbook.write(outputStream);
				workbook.close();
				outputStream.close();
			}
			if (testCase.equals("or")) {
				FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
				Workbook workbook = WorkbookFactory.create(inputStream);

				Sheet sheet = workbook.getSheetAt(7);
				clearORTable(sheet);
				int row = 0;
				for (int time = 0; time <= (bound - 1); time++) {
					for (Bitvector bv : rows)
						if (bv.getAtTime(time)) {
							if (bv.getName().startsWith("OR")) {
								if (bv.getName().startsWith("OR1"))
									row = 2;
								else if (bv.getName().startsWith("OR2"))
									row = 3;
								else if (bv.getName().startsWith("OR3"))
									row = 4;
								else if (bv.getName().startsWith("OR4"))
									row = 5;

								if (bv.getName().substring(3, 5).equals("SN") || (bv.getName().length() >= 7 && (bv.getName().substring(6, 7).equals("P") || bv.getName().substring(6, 7).equals("C"))))
									appendCellValue(sheet, row, time + 1,
											bv.getName().substring(3, bv.getName().length()));
							}
						}
				}

				inputStream.close();
				FileOutputStream outputStream = new FileOutputStream(excelFilePath);
				workbook.write(outputStream);
				workbook.close();
				outputStream.close();
			}
			if (testCase.startsWith("exam")) {
				FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
				Workbook workbook = WorkbookFactory.create(inputStream);
				int sheetNo = 1;
				if (testCase.equals("exam2"))
					sheetNo = 2;
				if (testCase.equals("exam3"))
					sheetNo = 3;
				if (testCase.equals("exam4"))
					sheetNo = 4;
				if (testCase.equals("exam5"))
					sheetNo = 5;
				if (testCase.equals("exam5F1"))
					sheetNo = 6;

				Sheet sheet = workbook.getSheetAt(sheetNo);
				clearExamTable(sheet);
				int rowOffset = 4;
				int columnOffset = 2;
				int numberOfColumns = 5;
				for (int time = 0; time <= (bound - 1); time++) {
					for (Bitvector bv : rows)
						if (bv.getAtTime(time)) {
							if (bv.getName().startsWith("CR")) {
								appendCellValue(sheet, time / 5 + rowOffset, time % numberOfColumns + columnOffset,
										Integer.parseInt(bv.getName().substring(2, bv.getName().length())));
							}
						}
				}

				inputStream.close();
				FileOutputStream outputStream = new FileOutputStream(excelFilePath);
				workbook.write(outputStream);
				workbook.close();
				outputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getSCTitle(int scIndex) {
		switch (scIndex) {
		case 1:
			return "SE1";
		case 2:
			return "SE2";
		case 3:
			return "FM1";
		case 4:
			return "FM2";
		case 5:
			return "ALG";
		case 6:
			return "IOT";
		case 7:
			return "SEM";
		case 8:
			return "SEC";

		default:
			return Integer.toString(scIndex);
		}
	}

	private static void clearConfTable(Sheet sheet) {
		for (int row = 2; row <= 7; row++)
			for (int col = 1; col <= 17; col++)
				setCellValue(sheet, row, col, "");
	}

	private static void clearORTable(Sheet sheet) {
		for (int row = 2; row <= 5; row++)
			for (int col = 1; col <= 17; col++)
				setCellValue(sheet, row, col, "");
	}

	private static void clearExamTable(Sheet sheet) {
		for (int row = 4; row <= 15; row++)
			for (int col = 2; col <= 6; col++)
				setCellValue(sheet, row, col, "");
	}

	private static void setCellValue(Sheet sheet, int row, int col, int value) {
		try {
			Cell cell2Update = sheet.getRow(row).getCell(col);
			cell2Update.setCellValue(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void setCellValue(Sheet sheet, int row, int col, String value) {
		Cell cell2Update = sheet.getRow(row).getCell(col);
		try {
			cell2Update.setCellValue(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void appendCellValue(Sheet sheet, int row, int col, int value) {
		Cell cell2Update = sheet.getRow(row).getCell(col);
		cell2Update.setCellValue(cell2Update.getStringCellValue()
				+ ((cell2Update.getStringCellValue().length() == 0) ? "" : " ") + value);
	}

	private static void appendCellValue(Sheet sheet, int row, int col, String value) {
		try {
			Cell cell2Update = sheet.getRow(row).getCell(col);
			cell2Update.setCellValue(cell2Update.getStringCellValue()
					+ ((cell2Update.getStringCellValue().length() == 0) ? "" : " ") + value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("row"+row+"col"+col+"value"+value);
		}
	}

	private static String getConferenceScript() {
		Conf conf = new Conf();
		return conf.getOLTLScript();
	}
}