package com.pourhashem.oltl.oltl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Model {
	private static int bound = 4;
	/**
	 * softBound is the exact length of the model, but the bound is the K that model needs to get unfolded. If it is not given it must be equal to the bound.
	 */
	private OLTLFormula oltlFormula;
	private Set<Integer> ltlIndexes;

	public Model(String script, int bound) {
		Parser parser = new Parser(script);
		this.bound = bound;
		oltlFormula = parser.getOLtlFormula();
//				System.out.println("**"+oltlFormula);
		oltlFormula = expandAbbreviations(oltlFormula);
//				System.out.println("**"+oltlFormula);
		removeAbbreviationsAndRedundantFFromLTLInstances();
//				System.out.println("**"+oltlFormula);
		setWAPsAssertedTimeInstants(oltlFormula, 0);
	}

	public String getLTLSemantics() {
		String s = "", high = "", low = "";
		boolean realAvgCost = true;
		for (int index : ltlIndexes)
			s += OLTLFormula.ltlInstances.get(index).getSemantics();
		if (realAvgCost) {
			for (WAP wap : WAP.instances) {
				high += wap.getHighSemantics();
				low += wap.getLowSemantics();
			}
		}
		if (realAvgCost) {
			s += "\n(= costHSum (+ 0 " + high +"))\n";
			s += "\n(= costLSum (+ 0 " + low +"))\n";
		}
		if (oltlFormula instanceof Predicate)
			return s + "(= ((_ extract 0 0) " + ((Predicate) oltlFormula).getName() + ") #b1)";
		else
			return s + "(= ((_ extract 0 0) " + oltlFormula.getName() + ") #b1)";

	}

	private String getDeclaration(String name) {
		return "\n(declare-fun " + name + " () (_ BitVec " + (bound + 2) + "))";
	}

	private String getDeclarations() {
		String s = "";
		for (Predicate p : Predicate.instances)
			s += getDeclaration(p.getName());
		for (int index : ltlIndexes)
			s += getDeclaration("oltl" + index);

		return s;
	}

	private String getLoopConstraint(String name) {
		return "(loopConF " + name + ")";
	}

	private String getLoopConstraints() {
		String s = "";
		for (Predicate p : Predicate.instances)
			s += getLoopConstraint(p.getName());
		for (int index : ltlIndexes)
			s += getLoopConstraint("oltl" + index);

		return s;
	}

	private String getSoftSemantics() {
		String s = "";
		boolean realAvgCost = true; 
		if (! realAvgCost) {
			if (WAP.instances.size() == 0)
				return s;
			for (WAP wap : WAP.instances)
				s += "\n" + wap.getSemantics();
		}
		else
			/*(assert (= costHAvg (ite (= i_loop #b000001) (/ costHSum 4.0)
					(ite (= i_loop #b000010) (/ costHSum 3.0)
						(ite (= i_loop #b000011) (/ costHSum 2.0)
							 costHSum)))
					))*/
			s += "\n(assert (= costHAvg " + getRecIte(1) + "))"
					+ "\n(minimize costHAvg)"
					+ "\n(minimize costLSum)";	

		return s;
	}

	private String getRecIte(int i) {
		if (i == bound)
			return " costHSum";
		return "(ite (= i_loop (_ bv" + i + " " + (bound + 2) +")) (/ costHSum " + (bound-i+1) + ".0)" + getRecIte(i + 1) + ")";
	}

//	private String intToBv(int i) {
//		String result = Integer.toBinaryString(i);
//		int l = result.length();
//		for (int k = bound + 2; k > l; k--)
//			result = "0" + result;
//		return "#b"+ result;
//	}

	public static int getBound() {
		return bound;
	}

	public OLTLFormula getLtlFormula() {
		return oltlFormula;
	}

	public void setLtlFormula(OLTLFormula ltlFormula) {
		this.oltlFormula = ltlFormula;
	}

	public String getSemantics() {
		ltlIndexes = new HashSet<Integer>();
		for (OLTLFormula ltlf : OLTLFormula.ltlInstances)
			ltlIndexes.add(ltlf.getIndex());

		return getDeclarations() + "\n(assert (and " + getLTLSemantics() + '\n' + getLoopConstraints() + "))"
		+ getSoftSemantics();
	}

	private void setWAPsAssertedTimeInstants(Formula inputF, int nestedNextLevel) {
		if (inputF instanceof Alw || inputF instanceof AlwF || inputF instanceof AlwP || inputF instanceof Som || inputF instanceof SomF || inputF instanceof SomP || inputF instanceof Release || inputF instanceof Until || inputF instanceof Since || inputF instanceof Trigger || inputF instanceof Yesterday)
			setInteriorWAPsRootXFalse(inputF);
		if (inputF instanceof And)
			for (Formula f : ((And)inputF).getFormulae())
				setWAPsAssertedTimeInstants(f, nestedNextLevel);
		if (inputF instanceof Or)
			for (Formula f : ((Or)inputF).getFormulae())
				setWAPsAssertedTimeInstants(f, nestedNextLevel);
		if (inputF instanceof Iff) {
			setWAPsAssertedTimeInstants(((Iff)inputF).getFormula1(), nestedNextLevel);
			setWAPsAssertedTimeInstants(((Iff)inputF).getFormula2(), nestedNextLevel);
		}
		if (inputF instanceof Impl) {
			setWAPsAssertedTimeInstants(((Impl)inputF).getFormula1(), nestedNextLevel);
			setWAPsAssertedTimeInstants(((Impl)inputF).getFormula2(), nestedNextLevel);
		}
		if (inputF instanceof Not)
			setWAPsAssertedTimeInstants(((Not)inputF).getFormula(), nestedNextLevel);
		if (inputF instanceof Next)
			setWAPsAssertedTimeInstants(((Next)inputF).getFormula(), nestedNextLevel + 1);
		if (inputF instanceof WAP)
			((WAP)inputF).addAssertedTimeInstants(nestedNextLevel);
	}

	private void setInteriorWAPsRootXFalse(Formula inputF) {
		if (inputF instanceof Alw)
			setInteriorWAPsRootXFalse(((Alw)inputF).getFormula());
		if (inputF instanceof AlwF)
			setInteriorWAPsRootXFalse(((AlwF)inputF).getFormula());
		if (inputF instanceof AlwP)
			setInteriorWAPsRootXFalse(((AlwP)inputF).getFormula());
		if (inputF instanceof Iff) {
			setInteriorWAPsRootXFalse(((Iff)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Iff)inputF).getFormula2());
		}
		if (inputF instanceof Impl) {
			setInteriorWAPsRootXFalse(((Impl)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Impl)inputF).getFormula2());
		}
		if (inputF instanceof Next)
			setInteriorWAPsRootXFalse(((Next)inputF).getFormula());
		if (inputF instanceof Not)
			setInteriorWAPsRootXFalse(((Not)inputF).getFormula());
		if (inputF instanceof Release) {
			setInteriorWAPsRootXFalse(((Release)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Release)inputF).getFormula2());
		}
		if (inputF instanceof Since) {
			setInteriorWAPsRootXFalse(((Since)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Since)inputF).getFormula2());
		}
		if (inputF instanceof Until) {
			setInteriorWAPsRootXFalse(((Until)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Until)inputF).getFormula2());
		}
		if (inputF instanceof Trigger) {
			setInteriorWAPsRootXFalse(((Trigger)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Trigger)inputF).getFormula2());
		}
		if (inputF instanceof Som)
			setInteriorWAPsRootXFalse(((Som)inputF).getFormula());
		if (inputF instanceof SomF)
			setInteriorWAPsRootXFalse(((SomF)inputF).getFormula());
		if (inputF instanceof SomP)
			setInteriorWAPsRootXFalse(((SomP)inputF).getFormula());
		if (inputF instanceof Yesterday)
			setInteriorWAPsRootXFalse(((Yesterday)inputF).getFormula());
		if (inputF instanceof And)
			for (Formula f : ((And)inputF).getFormulae())
				setInteriorWAPsRootXFalse(f);
		if (inputF instanceof Or)
			for (Formula f : ((Or)inputF).getFormulae())
				setInteriorWAPsRootXFalse(f);
		if (inputF instanceof WAP)
			((WAP)inputF).setRootX(false);
	}

	private OLTLFormula expandAbbreviations(OLTLFormula inputF) {
		return expandXFutr(expandXInterval(inputF));
	}

	private OLTLFormula expandXInterval(OLTLFormula inputF) {
		if (inputF instanceof Alw)
			return new Alw(expandXInterval(((Alw)inputF).getFormula()));
		if (inputF instanceof AlwF)
			return new AlwF(expandXInterval(((AlwF)inputF).getFormula()));
		if (inputF instanceof AlwP)
			return new AlwP(expandXInterval(((AlwP)inputF).getFormula()));
		if (inputF instanceof Iff) {
			return new Iff(expandXInterval(((Iff)inputF).getFormula1()), expandXInterval(((Iff)inputF).getFormula2()));
		}
		if (inputF instanceof Impl) {
			return new Impl(expandXInterval(((Impl)inputF).getFormula1()), expandXInterval(((Impl)inputF).getFormula2()));
		}
		if (inputF instanceof Next)
			return new Next(expandXInterval(((Next)inputF).getFormula()));
		if (inputF instanceof Not)
			return new Not(expandXInterval(((Not)inputF).getFormula()));
		if (inputF instanceof Release) {
			return new Release(expandXInterval(((Release)inputF).getFormula1()), expandXInterval(((Release)inputF).getFormula2()));
		}
		if (inputF instanceof Since) {
			return new Since(expandXInterval(((Since)inputF).getFormula1()), expandXInterval(((Since)inputF).getFormula2()));
		}
		if (inputF instanceof Until) {
			return new Until(expandXInterval(((Until)inputF).getFormula1()), expandXInterval(((Until)inputF).getFormula2()));
		}
		if (inputF instanceof Trigger) {
			return new Trigger(expandXInterval(((Trigger)inputF).getFormula1()), expandXInterval(((Trigger)inputF).getFormula2()));
		}
		if (inputF instanceof Som)
			return new Som(expandXInterval(((Som)inputF).getFormula()));
		if (inputF instanceof SomF)
			return new SomF(expandXInterval(((SomF)inputF).getFormula()));
		if (inputF instanceof SomP)
			return new SomP(expandXInterval(((SomP)inputF).getFormula()));
		if (inputF instanceof Yesterday)
			return new Yesterday(expandXInterval(((Yesterday)inputF).getFormula()));
		if (inputF instanceof And) {
			And and = new And();
			for (OLTLFormula f : ((And)inputF).getFormulae())
				and.add(expandXInterval(f));
			return and;
		}
		if (inputF instanceof Or) {
			Or or = new Or();
			for (OLTLFormula f : ((Or)inputF).getFormulae())
				or.add(expandXInterval(f));
			return or;
		}
		if (inputF instanceof XInterval) {
			OLTLFormula f = expandXInterval(((XInterval)inputF).getFormula());
			int x1 = ((XInterval)inputF).getX1();
			int x2 = ((XInterval)inputF).getX2();
			And and = new And();
			for (int t = x1; t <= x2; t++) 
				and.add(new XFutr(f, t));
			return and;
		}

		return inputF;
	}

	private OLTLFormula expandXFutr(OLTLFormula inputF) {
		if (inputF instanceof Alw)
			return new Alw(expandXFutr(((Alw)inputF).getFormula()));
		if (inputF instanceof AlwF)
			return new AlwF(expandXFutr(((AlwF)inputF).getFormula()));
		if (inputF instanceof AlwP)
			return new AlwP(expandXFutr(((AlwP)inputF).getFormula()));
		if (inputF instanceof Iff) {
			return new Iff(expandXFutr(((Iff)inputF).getFormula1()), expandXFutr(((Iff)inputF).getFormula2()));
		}
		if (inputF instanceof Impl) {
			return new Impl(expandXFutr(((Impl)inputF).getFormula1()), expandXFutr(((Impl)inputF).getFormula2()));
		}
		if (inputF instanceof Next)
			return new Next(expandXFutr(((Next)inputF).getFormula()));
		if (inputF instanceof Not)
			return new Not(expandXFutr(((Not)inputF).getFormula()));
		if (inputF instanceof Release) {
			return new Release(expandXFutr(((Release)inputF).getFormula1()), expandXFutr(((Release)inputF).getFormula2()));
		}
		if (inputF instanceof Since) {
			return new Since(expandXFutr(((Since)inputF).getFormula1()), expandXFutr(((Since)inputF).getFormula2()));
		}
		if (inputF instanceof Until) {
			return new Until(expandXFutr(((Until)inputF).getFormula1()), expandXFutr(((Until)inputF).getFormula2()));
		}
		if (inputF instanceof Trigger) {
			return new Trigger(expandXFutr(((Trigger)inputF).getFormula1()), expandXFutr(((Trigger)inputF).getFormula2()));
		}
		if (inputF instanceof Som)
			return new Som(expandXFutr(((Som)inputF).getFormula()));
		if (inputF instanceof SomF)
			return new SomF(expandXFutr(((SomF)inputF).getFormula()));
		if (inputF instanceof SomP)
			return new SomP(expandXFutr(((SomP)inputF).getFormula()));
		if (inputF instanceof Yesterday)
			return new Yesterday(expandXFutr(((Yesterday)inputF).getFormula()));
		if (inputF instanceof And) {
			And and = new And();
			for (OLTLFormula f : ((And)inputF).getFormulae())
				and.add(expandXFutr(f));
			return and;
		}
		if (inputF instanceof Or) {
			Or or = new Or();
			for (OLTLFormula f : ((Or)inputF).getFormulae())
				or.add(expandXFutr(f));
			return or;
		}
		if (inputF instanceof XFutr) {
			OLTLFormula f = ((XFutr)inputF).getFormula();
			int x = ((XFutr)inputF).getX();
			if (x == 0)
				return expandXFutr(f);
			return new Next(expandXFutr(new XFutr(f, x - 1)));
		}

		return inputF;
	}

	public void removeAbbreviationsAndRedundantFFromLTLInstances() {
		ArrayList<OLTLFormula> updatedLTLInstances = new ArrayList<OLTLFormula>();
		ArrayList<OLTLFormula> currentLTLInstances = new ArrayList<OLTLFormula>();
		for (OLTLFormula f : OLTLFormula.ltlInstances)
			currentLTLInstances.add(f);
		for (OLTLFormula f : currentLTLInstances)
			if (!f.containsAbbreviation() && !isIn(f, updatedLTLInstances))
				updatedLTLInstances.add(f);
		OLTLFormula.ltlInstances = updatedLTLInstances;
	}

	private boolean isIn(OLTLFormula inputF, ArrayList<OLTLFormula> updatedLTLInstances) {
		for (OLTLFormula f : updatedLTLInstances)
			if (f.equals(inputF))
				return true;
		return false;
	}

}