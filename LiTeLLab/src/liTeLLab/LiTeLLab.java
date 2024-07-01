/**
 * @author Mohammad Mhdi Pourhashem Kallehbasti
 */

package liTeLLab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiTeLLab {

	private static boolean hideWAPs = true;

	public static void main(String[] args) {
		/*
		 * 1: Produce Jar file
		 * 2: Run all experiments OR, Exams, and AL
		 */
		short mode = 2;
		int boundInMode2 = 2;

		String help = "The jar file can be executed by the command \"java -jar litellab.jar Path_to_the_OLTL_script.txt -k valueOfK -m valueOfM\"."
				+ " This runs the OLTL/OCLTLoc specification written in the file.\n\nAlternatively, any of three case studies (\"exam\", \"or\", and  \"al\") "
				+ "can be executed by giving the case study name instead of file path.\n\nZ3 should be installed on the machine and the file runZ3.sh or runZ3.bat "
				+ "should be modified according to the Z3 installation.\n\nLitellab will prodcues the following files:\n	litellab.output.txt: "
				+ "The main output that can be UNSAT or a trace with the total amount of cost in the end.\n	z3.input.smt2: The smt2 script prodcued "
				+ "to be solved by Z3.\n	z3.output.smt2: The model prodcued by Z3.";
		if (mode == 1) {
			//				<jar>
			if (args.length == 0 || (args.length == 1 && args[0].equals("-h")))
				System.out.println(help);
			else if (args[0].equals("exam")) {
				//			<Run Examination timetabling problem case study>
				Exam exam1 = new Exam(4);
				LiTeLLab.run(exam1.getOLTLScript(), "Exam4", exam1.getBound(), -1);
				//			</Run Examination timetabling problem case study>
			}
			else if (args[0].equals("or")) {
				//		<Run Operation room case study>
				OperatingRoom or3 = new OperatingRoom(4, 9);
				LiTeLLab.run(or3.getOLTLScript(), "OR4SR9", or3.getBound(), -1);
				//		</Run Operation room case study>
			}
			//			else if (args[0].equals("al")) {
			//				//		<Run Assembly line case study>
			//				AssemblyLine al = new AssemblyLine(7);
			//				LiTeLLab.run(al.getOLTLScript(), "AL7", 10, -1);
			//				//		</Run Assembly line case study>
			//			}
			else {
				String oltlScript = "";
				try	{
					int k = 10, m = -1;
					if (args.length >= 3)
						for (int i = 0; i < args.length - 1; i++) {
							if (args[i].equals("-k"))
								k = Integer.parseInt(args[i + 1]);
							if (args[i].equals("-m"))
								m = Integer.parseInt(args[i + 1]);
						}
					oltlScript = new String (Files.readAllBytes(Paths.get(args[0])));
					LiTeLLab.run(oltlScript, k, m);
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			//			//				</jar>
		}
		else if (mode == 2) {

			//			String runningExample;
			//			runningExample = "(&& (next ([<] (-v- c1) (-v- c2))) (next  (next ([>] (-v- c1) (-v- c2))) ))";
			//			LiTeLLab.run(runningExample, "ex1", 4);
			//			String runningExample;
			//			runningExample = "(&& (alwf (w (-p- a) 1)) (alwf (somf (!! (-p- a)))))";
			//			LiTeLLab.run(runningExample, "ex1", 4);
			//			runningExample = "(&& (!! (&& (-p- a) (next (-p- b)))) (w (-p- a) 2.5) (next (w (-p- b) 2.6)))";
			//			LiTeLLab.run(runningExample, "ex2", 2);

			//			runningExample = "(&& (somf (&& (-P- turnoff) (!! (-P- off)) (!!(somf([>] (-V- c) 5))) (next (next (somf (-P- light))))"
			//					+ "(alwf (&& (!!(&& (-P- on) (-P- off)))"
			//					//					+ " (-> (-P- on) (!! (-P- lamp)))"
			//					//					+ "	 (-> (-P- off) (-P- lamp))"
			//					+ "(<-> (-P- on) ([=] (-V- c) 0))"
			//					+ "(-> (yesterday (-P- light)) ([<] (-V- c) 5)) "
			//					+ "(<-> (-P- turnoff) (&& (yesterday (-P- light)) (|| (-P- off) ([=] (-V- c) 5))))"
			//					+ "(<-> (-P- light) (since (!! (-P- turnoff)) (-P- on)))  )))";
			//			LiTeLLab.run(runningExample, "lamp", 10);

			//			String oltlScript;
			//			try {
			//				oltlScript = new String (Files.readAllBytes(Paths.get("litellab.input.txt")));
			//				LiTeLLab.run(oltlScript, boundInMode2, -1);
			//			} catch (IOException e) {e.printStackTrace();}
			//			AssemblyLine al = new AssemblyLine();
			//			LiTeLLab.run(al.getOLTLScript(), "AL", 1, -1);



			//			List<String>[][] table = parseFile("OR_SN6_SR15_OR5.output.txt");
			//	        printTable(table);
			
			writeToCSV(parseFile("output.txt"), "result.csv");
			
			boolean orScalability = false;
//			boolean orScalability = true;
			if (orScalability) {
				for (int nSN = 4; nSN <= 15; nSN++) {
//					OperatingRoomScAn or = new OperatingRoomScAn(nSN, (3 * nSN) - 3, nSN);
					OperatingRoomScAn or = new OperatingRoomScAn(nSN, (3 * nSN) - 3, nSN + 1);
					or = new OperatingRoomScAn(nSN, (3 * nSN) - 3, nSN + 2);
					or = new OperatingRoomScAn(nSN, (3 * nSN) - 3, nSN + 3);					or = new OperatingRoomScAn(nSN, (3 * nSN) - 3, nSN + 4);
				}
			}
			//
			//			OperatingRoom or = new OperatingRoom(4, 7);
			//			LiTeLLab.run(or.getOLTLScript(), "OR4SR7", or.getBound());	
			//			OperatingRoom or1 = new OperatingRoom(4, 8);
			//			LiTeLLab.run(or1.getOLTLScript(), "OR4SR8", or1.getBound());
			//			OperatingRoom or2 = new OperatingRoom(3, 7);
			//			LiTeLLab.run(or2.getOLTLScript(), "OR3SR7", or2.getBound());
			//			OperatingRoom or3 = new OperatingRoom(4, 9);
			//			LiTeLLab.run(or3.getOLTLScript(), "OR4SR9", or3.getBound());
			//			OperatingRoom or4 = new OperatingRoom(3, 8);
			//			LiTeLLab.run(or4.getOLTLScript(), "OR3SR8", or4.getBound());
			//			OperatingRoom or5 = new OperatingRoom(3, 9);
			//			LiTeLLab.run(or5.getOLTLScript(), "OR3SR9", or5.getBound());
			//
			//			Exam exam = new Exam(3);
			//			LiTeLLab.run(exam.getOLTLScript(), "Exam3", exam.getBound());
			//			Exam exam1 = new Exam(4);
			//			LiTeLLab.run(exam1.getOLTLScript(), "Exam4", exam1.getBound());
			//
			//			for (int setupDeadline = 1; setupDeadline <= 7; setupDeadline++) {
			//				AssemblyLine al = new AssemblyLine(setupDeadline);
			//				LiTeLLab.run(al.getOLTLScript(), "AL" + setupDeadline, 10);
			//			}
		}

	}

	public static void run(String script, int bound, int m) {
		run(script, "", bound, m);
	}

	public static void run(String script, String testCase, int bound, int m) {
		writeToFile(script, "");
		//		SMT2Builder sb = new SMT2Builder(script, bound, m);
		//		writeSMT2(sb.getSMT2Model());
		//		parseOutput(sb.getModel(), testCase, false);
		//		OLTLFormula.ltlInstances = new ArrayList<OLTLFormula>();
		//		Predicate.instances = new HashSet<Predicate>();
		//		Predicate.ltlInstances = new ArrayList<OLTLFormula>();
		//		WAP.instances = new HashSet<WAP>();
		//		WAP.ltlInstances = new ArrayList<OLTLFormula>();
		//		// System.out.println(sb.getSMT2Model());
		//		if (testCase.length() > 0) {
		//			File z3Input = new File("./z3.input.smt2");
		//			File z3InputNew = new File("./" + testCase + "-z3.input.smt2");
		//			z3Input.renameTo(z3InputNew);
		//			File z3Output = new File("./z3.output.txt");
		//			File z3OutputNew = new File("./" + testCase + "-z3.output.txt");
		//			z3Output.renameTo(z3OutputNew);
		//			File file = new File("./" + testCase + "-litellab.output.txt");
		//			file.delete();
		//			File oltlOutput = new File("./litellab.output.txt");
		//			File oltlOutputNew = new File("./" + testCase + "-litellab.output.txt");
		//			oltlOutput.renameTo(oltlOutputNew);
		//		}
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
	}

	public static void writeToFile(String text, String fileName) {
		if (fileName.length() == 0)
			fileName = "generatedlitellab.input.txt";
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter out = new BufferedWriter(fw);
			out.write(text);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeSMT2(String smt2Model) {
		String fileName = "z3.input.smt2";
		try {
			FileWriter smt2 = new FileWriter(fileName);
			BufferedWriter out = new BufferedWriter(smt2);
			out.write(smt2Model);
			out.close();
			try {
				ProcessBuilder processBuilder;
				if (System.getProperty("os.name").contains("Win"))
					processBuilder = new ProcessBuilder("runZ3.bat");
				else
					processBuilder = new ProcessBuilder("runZ3.sh");
				processBuilder.inheritIO();
				Process process = processBuilder.start();
				process.waitFor();
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
		String penalty = "";//"Since there is no soft-formula, there is no penalty.";
		boolean unsat = false;
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream("./z3.output.txt"), "Cp1252"));
			String line;

			ArrayList<Bitvector> rows = new ArrayList<Bitvector>();
			ArrayList<RealVar> realVars = new ArrayList<RealVar>();
			ArrayList<IntVar> intVars = new ArrayList<IntVar>();
			while ((line = br.readLine()) != null) {
				if (line.equals("unsat")) {
					unsat = true;
					break;
				}
				if (line.contains("(define-fun oltl") || line.contains("(define-fun in_loop"))
					continue;
				if (hideWAPs  && line.contains("(_ BitVec") && line.contains("(define-fun w")) {//Ignore WAPS
					String tmp = line.substring(line.indexOf("(define-fun w") + 12, line.indexOf("(define-fun w") + 14);
					if (tmp.charAt(1) >= '0' && tmp.charAt(1) <= '9')
						continue;
				}
				if (hideWAPs  && line.contains("(_ BitVec") && line.contains("(define-fun iw")) {//Ignore WAPS
					String tmp = line.substring(line.indexOf("(define-fun iw") + 13, line.indexOf("(define-fun iw") + 15);
					if (tmp.charAt(1) >= '0' && tmp.charAt(1) <= '9')
						continue;
				}
				if (line.contains("(define-fun i_loop (")) {
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
				if (line.contains("(define-fun ") && line.contains("(_ BitVec") && !line.contains("(x!0 Int)") && !line.endsWith("Real")) {
					String[] ss = line.trim().split(" ");
					String name = ss[1];
					line = br.readLine();
					String value = line.substring(line.indexOf('#') + 2, line.length() - 1);
					if (line.contains("#x"))
						rows.add(new Bitvector(name, new BigInteger(value, 16).toString(2)));
					else
						rows.add(new Bitvector(name, value));
				}
				if (line.contains("(define-fun ") && line.contains("((x!0 Int)) ")) {
					line = line.replaceAll("\\?", "");
					if (line.contains("((x!0 Int)) Real"))
						if (!line.contains("(ite ")) {
							String[] tmp = line.split(" ");
							double valueForAllIndexes = Double.parseDouble(tmp[tmp.length - 1].substring(0, tmp[tmp.length - 1].length() - 1));
							double [] tmpv = new double [bound + 3];
							Arrays.fill(tmpv, valueForAllIndexes);
							LiTeLLab.RealVar tmpRV = new LiTeLLab.RealVar(tmp[3], tmpv);
							realVars.add(tmpRV);
						}
						else {
							String s = line.substring(line.indexOf("(ite"));
							s = s.replaceAll("\\(\\- ", "-");
							ParserIte pIte = new ParserIte(s);
							double [] tmpv = pIte.getRealArray(bound + 3);
							String [] splitedLine = line.split(" ");
							String name = splitedLine[3];
							LiTeLLab.RealVar tmpRV = new LiTeLLab.RealVar(name, tmpv);
							realVars.add(tmpRV);
						}
					if (line.contains("((x!0 Int)) Int"))
						if (!line.contains("(ite ")) {
							String[] tmp = line.split(" ");
							int valueForAllIndexes = Integer.parseInt(tmp[tmp.length - 1].substring(0, tmp[tmp.length - 1].length() - 1));
							int [] tmpv = new int [bound + 3];
							Arrays.fill(tmpv, valueForAllIndexes);
							LiTeLLab.IntVar tmpIV = new LiTeLLab.IntVar(tmp[3], tmpv);
							intVars.add(tmpIV);
						}
						else {
							String s = line.substring(line.indexOf("(ite"));
							s = s.replaceAll("\\(\\- ", "-");
							ParserIte pIte = new ParserIte(s);
							double [] tmpv = pIte.getRealArray(bound + 3);
							String [] splitedLine = line.split(" ");
							String name = splitedLine[3];
							LiTeLLab.RealVar tmpRV = new LiTeLLab.RealVar(name, tmpv);
							realVars.add(tmpRV);
						}
					if (line.contains("((x!0 Int)) (_ BitVec "))
					{
						String s = line.substring(line.indexOf("(ite"));
						s = s.replaceAll("\\(\\- ", "-");
						ParserIte pIte = new ParserIte(s);
						int [] tmpv = pIte.getIntArrayFromBV(bound + 3);
						String [] splitedLine = line.split(" ");
						String name = splitedLine[3];
						LiTeLLab.IntVar tmpRV = new LiTeLLab.IntVar(name, tmpv);
						intVars.add(tmpRV);
					}
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
			//			if (testCase.length() > 0 && excel)
			//				writeToExcel(testCase, "./output.xlsx", bound, rows);
			try {
				PrintWriter writer = new PrintWriter("litellab.output.txt", "UTF-8");
				if (unsat)
					writer.println("UNSAT");
				else {
					for (int time = 0; time <= bound; time++) {
						if (time == (bound + 1))
							writer.println("--- time k+1=LOOP ---");
						else
							writer.println("--- time " + time + " ---");
						if (time == loop)
							writer.println("*LOOP*");
						for (Bitvector bv : rows)
							if (bv.getAtTime(time) && ! bv.getName().startsWith(Model.prefix))
								writer.println(bv.getName());
						for (IntVar intVar : intVars) {
							DecimalFormat df = new DecimalFormat("0.####");
							writer.println(intVar.name + " = " + df.format(intVar.values[time]));
						}
						for (RealVar realVar : realVars) {
							DecimalFormat df = new DecimalFormat("0.####");
							writer.println(realVar.name + " = " + df.format(realVar.values[time]));
						}
					}
					writer.println(penalty + '\n');
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
			BufferedReader reader = new BufferedReader(new FileReader(new File("./litellab.output.txt")));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return unsat;
	}

	static class RealVar {
		String name;
		double[] values;
		RealVar(String name, double[] values) {
			this.name = name;
			this.values = values;
		}
	}

	static class IntVar {
		String name;
		int[] values;
		IntVar(String name, int[] values) {
			this.name = name;
			this.values = values;
		}
	}


	@SuppressWarnings("unchecked")
	public static List<String>[][] parseFile(String filename) {
		List<String>[][] table = new ArrayList[20][20];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = new ArrayList<>();
			}
		}

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			Pattern timePattern = Pattern.compile("--- time (\\d+) ---");
			Pattern orPattern = Pattern.compile("OR(\\d+)(SR\\d+|SR\\d+C|SR\\d+P|SN\\d+)");
			int currentTime = -1;

			while ((line = br.readLine()) != null) {
				Matcher timeMatcher = timePattern.matcher(line);
				if (timeMatcher.find()) {
					currentTime = Integer.parseInt(timeMatcher.group(1));
				} else if (!line.startsWith("Soft") && currentTime != -1) {
					Matcher orMatcher = orPattern.matcher(line);
					if (orMatcher.find()) {
						int orIndex = Integer.parseInt(orMatcher.group(1));
						String value = orMatcher.group(2);
						table[orIndex][currentTime].add(value);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return table;
	}

	public static void printTable(List<String>[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print((table[i][j].isEmpty() ? "null" : table[i][j].toString()) + "\t");
			}
			System.out.println();
		}
	}

	public static void writeToCSV(List<String>[][] table, String filename) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					List<String> cellValues = table[i][j];
					String cellValue = cellValues.isEmpty() ? "null" : String.join("- ", cellValues);
					bw.write(cellValue);
					if (j < table[i].length - 1) {
						bw.write(",");
					}
				}
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}