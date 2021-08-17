/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Until extends LTLFormula {

	private LTLFormula f1;
	private LTLFormula f2;

	public Until(LTLFormula f1, LTLFormula f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	public LTLFormula getFormula1() {
		return f1;
	}

	public LTLFormula getFormula2() {
		return f2;
	}

	@Override
	public String getSemantics() {
		return "(until " + this.getName() + " " + f1.getName() + " " + f2.getName() + ")";
	}
	
	@Override
	public String toString() {
		return "(until " + f1 + " " + f2 + ")";
	}

	@Override
	public boolean equals(Object o){
		if (o instanceof Until)
			return f1.equals(((Until) o).getFormula1()) && f2.equals(((Until) o).getFormula2());

		return false;
	}

}
