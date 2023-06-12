/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Iff extends OLTLFormula {

	private OLTLFormula f1;
	private OLTLFormula f2;

	public Iff(OLTLFormula formula1, OLTLFormula formula2) {
		super();
		this.f1 = formula1;
		this.f2 = formula2;
	}

	public OLTLFormula getFormula2() {
		return f2;
	}

	public OLTLFormula getFormula1() {
		return f1;
	}
	
	@Override
	public String getSemantics() {
		return "(= " + this.getName() + "(bviff " + f1.getName() + " " + f2.getName() + "))";
	}

	@Override
	public String toString() {
		return "(<-> " + f1 + " " + f2 + ")";
	}

	@Override
	public boolean equals(Object o){
		if (o instanceof Iff)
			return (f1.equals(((Iff) o).getFormula1()) && f2.equals(((Iff) o).getFormula2())) || f1.equals(((Iff) o).getFormula2()) && f2.equals(((Iff) o).getFormula1());

		return false;
	}

}