/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AssemblyLine {
	private int bound;

	public AssemblyLine() {
		int lineN = 2;
		int maxDepth;
		int maxDegree;
		String bashScript;

		if (lineN == 1) {
			maxDepth = 3;
			maxDegree = 3;
			bashScript = "";
			for (int machineN = 30; machineN <= 40; machineN++) {
				liTeLLab.AssemblyLine.RandomALGenerator.Machine firstLineRoot;
				int firstLineMN = machineN;
				while (true) {
					RandomALGenerator generator = new RandomALGenerator(1);
					firstLineRoot = generator.createRandomTree(firstLineMN, maxDepth + (firstLineMN/20), maxDegree, 0);
					if (firstLineRoot == null || firstLineRoot.getNodeN() + 1 < firstLineMN)
						continue;
					break;
				}
				for (int sd = machineN; sd > machineN - 4; sd--) {
					String modelName = "M" + machineN + "-sd" + sd + "-k" + (sd + 1);
					String inputFileName = modelName + ".input.txt";
					bashScript += "java -jar litellab.jar " + inputFileName + " -k " + (sd + 1) + "\n"
							+ "mv z3.output.txt " + modelName + ".z3.output.txt\n"
							+ "mv litellab.output.txt " + modelName + ".output.txt\n\n";
					LiTeLLab.writeToFile(getTreeAxioms(firstLineRoot, firstLineMN, sd).toString(), inputFileName);
					LiTeLLab.writeToFile(firstLineRoot.toString(), modelName + ".txt");
				}
			}
			LiTeLLab.writeToFile(bashScript, "run.sh");
		}
		else if (lineN == 2) {// two lines of machines with the total number of @machineN machines. Maximum machineN is 22 within 2 hours, with 4 different setup deadlines.
			maxDepth = 3;
			maxDegree = 2;
			bashScript = "";
			for (int machineN = 15; machineN <= 25; machineN++) {
				liTeLLab.AssemblyLine.RandomALGenerator.Machine firstLineRoot;
				liTeLLab.AssemblyLine.RandomALGenerator.Machine secondLineRoot;
				Random r = new Random();
				int firstLineMN = machineN/2 + 1 + r.nextInt(machineN/5);
				int secondLineMN = machineN - firstLineMN;
				while (true) {
					RandomALGenerator generator = new RandomALGenerator(1);
					firstLineRoot = generator.createRandomTree(firstLineMN, maxDepth + (firstLineMN/10), maxDegree, 0);
					if (firstLineRoot == null || firstLineRoot.getNodeN() + 1 < firstLineMN)
						continue;
					break;
				}
				while (true) {
					RandomALGenerator generator = new RandomALGenerator(firstLineMN + 1);
					secondLineRoot = generator.createRandomTree(secondLineMN, maxDepth + (secondLineMN/10), maxDegree, 0);
					if (secondLineRoot == null || secondLineRoot.getNodeN() + 1 < secondLineMN)
						continue;
					break;
				}
				for (int sd = machineN; sd > machineN - 4; sd--) {
					String modelName = "M" + machineN + "-sd" + sd + "-k" + (sd + 1);
					String inputFileName = modelName + ".input.txt";
					bashScript += "java -jar litellab.jar " + inputFileName + " -k " + (sd + 1) + "\n"
							+ "mv z3.output.txt " + modelName + ".z3.output.txt\n"
							+ "mv litellab.output.txt " + modelName + ".output.txt\n\n";
					LiTeLLab.writeToFile(get2TreeAxioms(firstLineRoot, firstLineMN, secondLineRoot, secondLineMN, sd).toString(), inputFileName);
					LiTeLLab.writeToFile(firstLineRoot.toString() + "\n" + secondLineRoot.toString(), modelName + ".txt");
				}
			}
			LiTeLLab.writeToFile(bashScript, "run.sh");
		}
	}

	public OLTLFormula get2TreeAxioms(liTeLLab.AssemblyLine.RandomALGenerator.Machine firstLineRoot, int firstLineMN, liTeLLab.AssemblyLine.RandomALGenerator.Machine secondLineRoot, int secondLineMN, int sd) {
		And result = new And();
		result.add(getNextM(firstLineRoot.getId(), firstLineRoot.getSetupCost(), firstLineRoot.getProductPrice(), -1, sd));
		result.add(firstLineRoot.getNextSemantics(sd));
		result.add(firstLineRoot.getPrevSemantics());

		result.add(getNextM(secondLineRoot.getId(), secondLineRoot.getSetupCost(), secondLineRoot.getProductPrice(), -1, sd));
		result.add(secondLineRoot.getNextSemantics(sd));
		result.add(secondLineRoot.getPrevSemantics());
		result.add(getMutEx(firstLineMN + secondLineMN));
		result.add(getSetupDeadline(sd));

		return result;
	}

	public OLTLFormula getTreeAxioms(liTeLLab.AssemblyLine.RandomALGenerator.Machine firstLineRoot, int firstLineMN, int sd) {
		And result = new And();
		result.add(getNextM(firstLineRoot.getId(), firstLineRoot.getSetupCost(), firstLineRoot.getProductPrice(), -1, sd));
		result.add(firstLineRoot.getNextSemantics(sd));
		result.add(firstLineRoot.getPrevSemantics());
		result.add(getMutEx(firstLineMN));
		result.add(getSetupDeadline(sd));

		return result;
	}

	/*
	  				"(&& "
					+ "(w (-p- noSomeM1S) 100)"
					+ "(alw (&&"
					+ "(w (-p- M1O) 2)        "
					+ "(-> (-p- M1S) (&& (-p- setup) (next (!!(somf (-p- M1S))))))"
					+ "(<-> (-p- noSomeM1S) (!! (som (-p- M1S))))"
					+ "(<-> (-p- M1R) (somp (-p- M1S))) "
					+ "(<-> (-p- M1O) (&& (-p- M1R) (!! (-p- M2R) )))"
					+ "))"
					+ ")"
	 */
	/*//negative m2 means M2 is the last Machine in the chain.
	//With omnipresent weighted formulae
	//	private OLTLFormula getNextM(int m1, int m1Price, int m1ProductPrice, int m2) {
	//		And result = new And();
	//		result.add(new WAP(getNoSomeMS(m1), m1Price));
	//		And and = new And();
	//		and.add(new WAP(getMO(m1), m1ProductPrice));
	//		and.add(new Impl(getMS(m1), new And(new Predicate("setup"), new Next(new Not(new SomF(getMS(m1)))))));
	//		and.add(new Iff(getNoSomeMS(m1), new Not(new Som(getMS(m1)))));
	//		and.add(new Impl(getMR(m1), new SomP(getMS(m1))));
	//		if (m2 >= 0)
	//			and.add(new Iff(getMO(m1), new And(getMR(m1), new Not(getMR(m2)))));
	//		else
	//			and.add(new Iff(getMO(m1), getMR(m1)));
	//		result.add(new Alw(and));
	//
	//		return result;
	//	}

	/*
		"(&& "
	+ "(w (-p- noSomeM1S) 100)"
	+ "(next (w (-p- M1O) 2) k)"
	+ "(alw (&&"
	+ "(-> (-p- M1S) (&& (-p- setup) (next (!!(somf (-p- M1S))))))"
	+ "(<-> (-p- noSomeM1S) (!! (som (-p- M1S))))"
	+ "(<-> (-p- M1R) (somp (-p- M1S))) "
	+ "(<-> (-p- M1O) (&& (-p- M1R) (!! (-p- M2R) )))"
	+ "))"
	+ ")"
	 */
	//negative m2 means M2 is the last Machine in the chain.
	private static OLTLFormula getNextM(int m1, int m1SetupCost, int m1ProductPrice, int m2, int setupDeadline) {
		And result = new And();
		result.add(new WAP(getNoSomeMS(m1), m1SetupCost));
		result.add(new XFutr((new WAP(getMO(m1), m1ProductPrice)), setupDeadline + 1));
		And and = new And();
		and.add(new Impl(getMS(m1), new And(new Predicate("setup"), new Next(new Not(new SomF(getMS(m1)))))));
		and.add(new Iff(getNoSomeMS(m1), new Not(new Som(getMS(m1)))));
		and.add(new Iff(getMR(m1), new SomP(getMS(m1))));
		if (m2 >= 0)
			and.add(new Iff(getMO(m1), new And(getMR(m1), new Not(getMR(m2)))));
		else
			and.add(new Iff(getMO(m1), getMR(m1)));
		result.add(new Alw(and));

		return result;
	}

	/*
	 * (-> (-p- M2R) (-p- M1R))
	 */
	private static OLTLFormula getPreviousM(int m2, ArrayList<Integer> m1) {
		if (m1.size() == 1)
			return new Alw(new Impl(getMR(m2), getMR(m1.get(0))));
		And and = new And();
		for (int m : m1)
			and.add(getMR(m));
		return new Alw(new Impl(getMR(m2), and));
	}

	private static OLTLFormula getMutEx(int n) {
		And and = new And();
		if (n == 2)
			return new Impl(getMS(1), new Not(getMS(2)));
		for (int i = 1; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				and.add(new Not(new And(getMS(i), getMS(j))));

		return new Alw(and);
	}

	// d: the number of time instants user is allowed to setup
	private static OLTLFormula getSetupDeadline(int d) {
		return new XFutr(new And(new Yesterday(new AlwP(new Predicate("setup"))), new Not(new SomF(new Predicate("setup")))), d);
	}

	private static Predicate getNoSomeMS(int index) {
		return new Predicate("noSomeM"+index+"S");
	}
	private static Predicate getMO(int index) {//output
		return new Predicate("M"+index+"O");
	}
	private static Predicate getMS(int index) {//setup
		return new Predicate("M"+index+"S");
	}
	private static Predicate getMR(int index) {//running
		return new Predicate("M"+index+"R");
	}

	public int getBound() {
		return bound;
	}

	public class RandomALGenerator {
		int startingIndex;
		int machineCount;

		public RandomALGenerator(int startingIndex) {
			this.startingIndex = startingIndex;
			this.machineCount = startingIndex;
		}

		public static class Machine {
			private int id;
			private int setupCost;
			private int productPrice = -1;
			List<Machine> children;

			public Machine(int id, int setupCost) {
				this.id = id;
				this.setupCost = setupCost;
				this.children = new ArrayList<>();
			}

			public int getId() {
				return id;
			}

			public OLTLFormula getNextSemantics(int sd) {
				And result = new And();
				for (Machine child : children)
					result.add(getNextM(child.getId(), child.getSetupCost(), child.getProductPrice(), id, sd));
				for (Machine child : children)
					result.add(child.getNextSemantics(sd));
				return result;
			}

			public OLTLFormula getPrevSemantics() {
				And result = new And();
				ArrayList<Integer> childrenID = new ArrayList<Integer>();
				for (Machine child : children)
					childrenID.add(child.getId());
				result.add(getPreviousM(id, childrenID));
				for (Machine child : children)
					if (child.getChildren().size() > 0)
						result.add(child.getPrevSemantics());
				return result;
			}

			public int getNodeN() {
				int nodeN = 0;
				for (Machine child : children) {
					nodeN += child.getNodeN();
				}
				return children.size() + nodeN;
			}

			public int getSetupCost() {
				return setupCost;
			}

			public int getProductPrice() {
				if (productPrice > 0)
					return productPrice;
				int sum = 0;
				Random r = new Random();
				for (Machine child : children)
					sum += child.getProductPrice();
				productPrice = sum + 1 + r.nextInt(5);
				return productPrice;
			}

			public List<Machine> getChildren() {
				return children;
			}

			private String toString(int depth) {
				StringBuilder sb = new StringBuilder();
				String indent = String.join("", Collections.nCopies(depth, "    ")); // 4 spaces for each level of depth
				sb.append(indent).append("(").append(id)
				.append(", ").append(setupCost)
				.append(", ").append(getProductPrice())
				.append(")\n");
				for (Machine child : children) {
					sb.append(child.toString(depth + 1)); // Increase depth for children
				}
				return sb.toString();
			}

			@Override
			public String toString() {
				return toString(0); // Start with depth 0 for the root
			}


		}

		private Random random = new Random();

		public Machine createRandomTree(int maxMachineN, int maxDepth, int maxDegree, int currentDepth) {
			if ((currentDepth > maxDepth) || ((machineCount - startingIndex) >= maxMachineN ))
				return null;

			Machine node = new Machine(machineCount++, 100 + (maxDepth - currentDepth) * 10 + random.nextInt(10)); // Assigning a random value to the node
			int childrenCount = random.nextInt(maxDegree + 1); // Random number of children up to maxDegree

			for (int i = 0; i < childrenCount; i++) {
				Machine child = createRandomTree(maxMachineN, maxDepth, maxDegree, currentDepth + 1);
				if (child != null)
					node.children.add(child);
			}

			return node;
		}

	}

}