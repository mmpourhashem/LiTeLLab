/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Not extends LTLFormula {

	private LTLFormula f;

	public Not(LTLFormula f) {
		super();
		this.f = f;
	}

	public LTLFormula getFormula() {
		return f;
	}

	public String getSemantics() {
		return "(= " + this.getName() + " (bvnot " + f.getName() + "))";
	}

	@Override
	public String toString() {
		return "(!! " + f + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Not)
			return f.equals(((Not) o).getFormula());

		return false;
	}

}
