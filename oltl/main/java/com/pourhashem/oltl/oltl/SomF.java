/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class SomF extends LTLFormula {

	LTLFormula f;

    public SomF(LTLFormula f) {
    	super();
		this.f = f;
    }
    
    public LTLFormula getFormula() {
    	return f;
    }

	@Override
	public String getSemantics() {
		return "(somf " + this.getName() + " " + f.getName() + ")";
	}

    @Override
    public String toString() {
        return "(somf " + f + ")";
    }

    @Override
	public boolean equals(Object o) {
		if (o instanceof SomF)
			return f.equals(((SomF) o).getFormula());
		return false;
	}

}
