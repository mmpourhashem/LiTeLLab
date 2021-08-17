/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Since extends LTLFormula {

	private LTLFormula f1;
	private LTLFormula f2;

	public Since(LTLFormula f1, LTLFormula f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	public LTLFormula getFormula2() {
		return f2;
	}

	public LTLFormula getFormula1() {
		return f1;
	}

	@Override
	public String getSemantics() {
		return "(since " + this.getName() + " " + f1.getName() + " " + f2.getName() + ")";
	}

	@Override
	public String toString() {
		return "(since " + f1 + " " + f2 + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Since)
			return f1.equals(((Since) o).getFormula1()) && f2.equals(((Since) o).getFormula2());

		return false;
	}


}