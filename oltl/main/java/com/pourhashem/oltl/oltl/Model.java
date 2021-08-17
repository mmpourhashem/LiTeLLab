package com.pourhashem.oltl.oltl;

import java.util.ArrayList;

public class Model {
	private static int bound;
	/**
	 * softBound is the exact length of the model, but the bound is the K that model needs to get unfolded. If it is not given it must be equal to the bound.
	 */
	private static int softBound;
	private LTLFormula ltlFormula;
	private int ltlFormulaIndex;
	private ArrayList<com.pourhashem.oltl.oltl.SoftFormula> softFormulae;

	public Model(String script) {
		Parser parser = new Parser(script);
		bound = parser.getBound();
		softBound = parser.getSoftBound();
		ltlFormula = parser.getLtlFormula();
		ltlFormulaIndex = ltlFormula.getIndex();
		softFormulae = parser.getSoftFormulae();
	}

	public String getLTLSemantics() {
		String s = "";
		int lastIndex = -1;
		for (LTLFormula ltlf : LTLFormula.ltlInstances)
			if (ltlf.getIndex() > lastIndex) {
				lastIndex = ltlf.getIndex();
				s += ltlf.getSemantics();
			}
		if (ltlFormula instanceof Predicate)
			return s + "(= ((_ extract 0 0) " + ((Predicate)ltlFormula).getPredicateName() + ") #b1)";
		else
			return s + "(= ((_ extract 0 0) " + ltlFormula.getName() + ") #b1)";
	}

	private String getDeclaration(String name) {
		return "\n(declare-fun " + name + " () (_ BitVec " + (bound + 2) + "))";
	}

	private String getDeclarations() {
		String s = "";
		for (Predicate p : Predicate.instances)
			s += getDeclaration(p.getPredicateName());
		int lastIndex = -1;
		for (LTLFormula ltlf : LTLFormula.ltlInstances)
			if (ltlf.getIndex() > lastIndex) {
				lastIndex = ltlf.getIndex();
				s += getDeclaration("oltl" + ltlf.getIndex());
			}

		return s;
	}

	private String getLoopConstraint(String name) {
		return "(loopConF " + name + ")";
	}

	private String getLoopConstraints() {
		String s = "";
		for (Predicate p : Predicate.instances)
			s += getLoopConstraint(p.getPredicateName());
		int lastIndex = -1;
		for (LTLFormula ltlf : LTLFormula.ltlInstances)
			if (ltlf.getIndex() > lastIndex) {
				lastIndex = ltlf.getIndex();
				s += getLoopConstraint("oltl" + ltlf.getIndex());
			}

		return s;
	}

	private String getSoftSemantics() {
		String s = "";

		if (softFormulae != null)
			for (SoftFormula softF : softFormulae)
				s += "\n" + softF.getSemantics();

		return s;
	}

	public static int getBound() {
		return bound;
	}
	
	public static int getSoftBound() {
		return softBound;
	}

	public LTLFormula getLtlFormula() {
		return ltlFormula;
	}

	public void setLtlFormula(LTLFormula ltlFormula) {
		this.ltlFormula = ltlFormula;
	}

	public String getSemantics() {
		return getDeclarations() + "\n(assert (and " + getLTLSemantics() + '\n' + getLoopConstraints() + "))"
				+ getSoftSemantics();
	}
}