/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Next extends OLTLFormula {

	private OLTLFormula f;

	public Next(OLTLFormula formula) {
		super();
		this.f = formula;
	}

	public OLTLFormula getFormula() {
		return f;
	}

	@Override
	public String getSemantics() {
		return "(next " + this.getName() + " " + f.getName() + ")";
	}

	@Override
	public String toString() {
		return "(next " + f + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Next)
			return f.equals(((Next) o).getFormula());

		return false;
	}

}
