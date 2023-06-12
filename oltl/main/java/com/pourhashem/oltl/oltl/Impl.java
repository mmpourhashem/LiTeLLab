/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Impl extends OLTLFormula {

	private OLTLFormula f1;
	private OLTLFormula f2;

	public Impl(OLTLFormula f1, OLTLFormula f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	public OLTLFormula getFormula2() {
		return f2;
	}

	public OLTLFormula getFormula1() {
		return f1;
	}
	
	@Override
	public String getSemantics() {
		return "(= " + this.getName() + "(bvimpl " + f1.getName() + " " + f2.getName() + "))";
	}

	@Override
	public String toString() {
		return "(-> " + f1 + " " + f2 + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Impl)
			return f1.equals(((Impl) o).getFormula1()) && f2.equals(((Impl) o).getFormula2());

		return false;
	}

}