/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Yesterday extends LTLFormula {

	LTLFormula f;

	public Yesterday(LTLFormula f) {
		super();
		this.f = f;
	}

	public LTLFormula getFormula(){ 
		return f;
	}

	@Override
	public String toString() {
		return "(yesterday " + f + ")";     
	}

	@Override
	public boolean equals(Object o){
		if (o instanceof Yesterday){
			return f.equals(((Yesterday) o).getFormula());
		}

		return false;
	}

	@Override
	public String getSemantics() {
		return "(yesterday " + this.getName() + " " + f.getName() + ")";
	}

}
