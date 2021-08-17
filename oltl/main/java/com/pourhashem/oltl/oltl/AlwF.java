/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class AlwF extends LTLFormula {

	LTLFormula f;

	public AlwF(LTLFormula f) {
		super();
		this.f = f;
	}

	public LTLFormula getFormula() {
		return f;
	}

	@Override
	public String getSemantics() {
		return "(alwf " + this.getName() + " " + f.getName() + ")";
	}

	@Override
	public String toString() {
		return "(alwf " + f + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof AlwF)
			return f.equals(((AlwF) o).getFormula());
		return false;
	}

}
