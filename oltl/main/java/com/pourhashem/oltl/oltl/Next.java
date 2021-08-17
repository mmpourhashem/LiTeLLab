/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Next extends LTLFormula {

	private LTLFormula f;

	public Next(LTLFormula f) {
		super();
		this.f = f;
	}

	public LTLFormula getFormula() {
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
