/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

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
import java.util.HashSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class App {
	public static void main(String[] args) {
		/*
		 * 1: Produce Jar file
		 * 2: Run all experiments OR, Exams, and AL
		 */
		short mode = 1; 

		String help = "The jar file can be executed by the command \"java -jar litellab.jar Path_to_the_OLTL_script.txt -k valueOfK\". This runs the OLTL specification written in the file.\n\nAlternatively, any of three case studies (\"exam\", \"or\", and  \"al\") can be executed by giving the case study name instead of file path.\n\nZ3 should be installed on the machine and the file runZ3.sh should be modified according to the Z3 installation.\n\nLitellab will prodcues the following files:\n	oltl.output.txt: The main output that can be UNSAT or a trace with the total amount of cost in the end.\n	z3.input.smt2: The smt2 script prodcued to be solved by Z3.\n	z3.output.smt2: The model prodcued by Z3.";
		if (mode == 1) {
			//				<jar>
			if (args.length == 0 || (args.length == 1 && args[0].equals("-h")))
				System.out.println(help);
			else if (args[0].equals("exam")) {
				//			<Run Examination timetabling problem case study>
				Exam exam1 = new Exam(4);
				App.run(exam1.getOLTLScript(), "Exam4", exam1.getBound());
				//			</Run Examination timetabling problem case study>
			}
			else if (args[0].equals("or")) {
				//		<Run Operation room case study>
				OperatingRoom or3 = new OperatingRoom(4, 9);
				App.run(or3.getOLTLScript(), "OR4SR9", or3.getBound());
				//		</Run Operation room case study>
			}
			else if (args[0].equals("al")) {
				//		<Run Assembly line case study>
				AssemblyLine al = new AssemblyLine(7);
				App.run(al.getOLTLScript(), "AL7", 10);
				//		</Run Assembly line case study>
			}
			else {
				String oltlScript = "";
				try
				{
					int k = 10;
					if (args.length == 3 && args[1].equals("-k"))
						k = Integer.parseInt(args[2]);
					oltlScript = new String (Files.readAllBytes(Paths.get(args[0])));
					App.run(oltlScript, k);
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			//			//				</jar>
		}
		else if (mode == 2) {
			String runningExample;
			runningExample = "(&& (alwf (w (-p- a) 1)) (alwf (somf (!! (-p- a)))))";
			App.run(runningExample, "ex1", 4);
			runningExample = "(&& (!! (&& (-p- a) (next (-p- b)))) (w (-p- a) 2.5) (next (w (-p- b) 2.6)))";
			App.run(runningExample, "ex2", 2);

			OperatingRoom or = new OperatingRoom(4, 7);
			App.run(or.getOLTLScript(), "OR4SR7", or.getBound());
			OperatingRoom or1 = new OperatingRoom(4, 8);
			App.run(or1.getOLTLScript(), "OR4SR8", or1.getBound());
			OperatingRoom or2 = new OperatingRoom(3, 7);
			App.run(or2.getOLTLScript(), "OR3SR7", or2.getBound());
			OperatingRoom or3 = new OperatingRoom(4, 9);
			App.run(or3.getOLTLScript(), "OR4SR9", or3.getBound());
			OperatingRoom or4 = new OperatingRoom(3, 8);
			App.run(or4.getOLTLScript(), "OR3SR8", or4.getBound());
			OperatingRoom or5 = new OperatingRoom(3, 9);
			App.run(or5.getOLTLScript(), "OR3SR9", or5.getBound());

			Exam exam = new Exam(3);
			App.run(exam.getOLTLScript(), "Exam3", exam.getBound());
			Exam exam1 = new Exam(4);
			App.run(exam1.getOLTLScript(), "Exam4", exam1.getBound());

			for (int setupDeadline = 1; setupDeadline <= 7; setupDeadline++) {
				AssemblyLine al = new AssemblyLine(setupDeadline);
				App.run(al.getOLTLScript(), "AL" + setupDeadline, 10);
			}
		}

	}

	public static void run(String script, int bound) {
		run(script, "", bound);
	}

	public static void run(String script, String testCase, int bound) {
		SMT2Builder sb = new SMT2Builder(script, bound);
		writeSMT2(sb.getSMT2Model());
		parseOutput(sb.getModel(), testCase, false);
		OLTLFormula.ltlInstances = new ArrayList<OLTLFormula>();
		Predicate.instances = new HashSet<Predicate>();
		Predicate.ltlInstances = new ArrayList<OLTLFormula>();
		WAP.instances = new HashSet<WAP>();
		WAP.ltlInstances = new ArrayList<OLTLFormula>();
		// System.out.println(sb.getSMT2Model());
		if (testCase.length() > 0) {
			File z3Input = new File("./z3.input.smt2");
			File z3InputNew = new File("./" + testCase + "-z3.input.smt2");
			z3Input.renameTo(z3InputNew);
			File z3Output = new File("./z3.output.txt");
			File z3OutputNew = new File("./" + testCase + "-z3.output.txt");
			z3Output.renameTo(z3OutputNew);
			File oltlOutput = new File("./oltl.output.txt");
			File oltlOutputNew = new File("./" + testCase + "-oltl.output.txt");
			oltlOutput.renameTo(oltlOutputNew);
		}
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

		int bound=1000;//TODO get it from parameter
		run(script.toString(), bound);
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
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean parseOutput(Model model, String testCase, boolean excel) {
		int bound = 0;
		int loop = 0;
		String penalty = "Since there is no soft-formula, there is no penalty.";
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
					String [] tmp = line.split(" ");
					bound = Integer.parseInt(tmp[tmp.length-1].substring(0, tmp[tmp.length-1].length() - 1)) - 2;
					line = br.readLine();
					String value = line.substring(line.indexOf('#') + 2, line.length() - 1);
					if (line.contains("#b"))
						loop = Integer.parseInt(value, 2);
					else if (line.contains("#x"))
						loop = Integer.parseInt(value, 16);
				}
				if (line.contains("(define-fun bvimpl ") || line.contains("(define-fun bviff ") || line.contains("(define-fun somf ") || line.contains("(define-fun somp ") || line.contains("(define-fun alwp ") || line.contains("(define-fun alwf ") || line.contains("(define-fun som ") || line.contains("(define-fun alw ") || line.contains("(define-fun trigger ") || line.contains("(define-fun since ") || line.contains("(define-fun release ") || line.contains("(define-fun until ") || line.contains("(define-fun until ") || line.contains("(define-fun zeta ") || line.contains("(define-fun yesterday ") || line.contains("(define-fun next ") || line.contains("(define-fun loopConF ") || line.contains("(define-fun getbit ") )
					continue;
				if (line.contains("(define-fun ") && !line.endsWith("Real")) {
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
					line = line.replaceAll("\\(", "").replaceAll("\\)", "");//.replaceAll(" ", "");
					if (line.length() > 0)
						penalty = '\n' + line;
					line = br.readLine();
					line = line.replaceAll("\\(", "").replaceAll("\\)", "");//.replaceAll(" ", "");
					if (line.length() > 0 && !line.startsWith(":"))
						penalty += '\n' + line;
					break;
				}

			}
			br.close();
			if (testCase.length() > 0 && excel)
				writeToExcel(testCase, "./output.xlsx", bound, rows);
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
					writer.println(penalty + '\n');
					//					if (! penalty.startsWith("S"))
					//						writer.println("\nViolated soft constraints:\n");
					//					for (Bitvector wapBv : rows) {//This loop is only to show which soft constraints are violated and when.
					//						if (WAP.instances.size() > 0)
					//							for (WAP wap : WAP.instances) {
					//								boolean isViolated = false;
					//								if (wap.getName().equalsIgnoreCase(wapBv.getName())) {
					//									for (Bitvector apBv : rows) {
					//										if (wap.getAp().getName().equalsIgnoreCase(apBv.getName())) {
					//											String lowViolated = "";
					//											float totalLowCost = 0;
					//											String highViolated = "";
					//											float totalHighCost = 0;
					//											for (int time = 0; time <= bound; time++)
					//												if (wapBv.getAtTime(time) && ! apBv.getAtTime(time)) {
					//													isViolated = true;
					//													if (wap.getAssertedTimeInstants().contains(time))
					//														if (time < loop) {
					//															lowViolated += time + ", ";
					//															totalLowCost += wap.getWeight();
					//														}
					//														else {
					//															highViolated += time + ", ";
					//															totalHighCost += wap.getWeight();
					//														}
					//
					//												}
					//											if (isViolated){
					//												if (lowViolated.endsWith(", "))
					//													lowViolated = lowViolated.substring(0, lowViolated.length() - 2);
					//												if (highViolated.endsWith(", "))
					//													highViolated = highViolated.substring(0, highViolated.length() - 2);
					//												if (totalLowCost > 0) {
					//													writer.print("\n\"" + apBv.getName() + "\" is violated in the prefix part at the time instant(s) ");
					//													writer.println(lowViolated + " with the total cost of [" + totalLowCost + "].");
					//												}
					//												if (totalHighCost > 0) {
					//													writer.print("\n\"" + apBv.getName() + "\" is violated in the periodic part at the time instant(s) ");
					//													writer.println(highViolated + " with the total cost of [" + totalHighCost + "].");
					//												}
					//											}
					//										}
					//									}
					//								}
					//							}
					//					}
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String line = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("./oltl.output.txt")));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return unsat;
	}

	private static void writeToExcel(String testCase, String excelFilePath, int bound, ArrayList<Bitvector> rows) {
		try {
			boolean rightToLeft = true;
			if (testCase.startsWith("or")) {
				FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
				Workbook workbook = WorkbookFactory.create(inputStream);

				Sheet sheet = workbook.getSheetAt(1);
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
			else if (testCase.startsWith("exam")) {
				FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
				Workbook workbook = WorkbookFactory.create(inputStream);
				Sheet sheet = workbook.getSheetAt(0);
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

	private static void setCellValue(Sheet sheet, int row, int col, String value) {
		try {
			Cell cell2Update = sheet.getRow(row).getCell(col);
			cell2Update.setCellValue(value);
		} catch (Exception e) {
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
			e.printStackTrace();
			System.out.print("row"+row+"col"+col+"value"+value);
		}
	}

}