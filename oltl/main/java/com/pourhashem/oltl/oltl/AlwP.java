/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class AlwP extends LTLFormula {

	LTLFormula f;

    public AlwP(LTLFormula f) {
    	super();
		this.f = f;
    }
    
    public LTLFormula getFormula() {
    	return f;
    }
    
	@Override
	public String getSemantics() {
		return "(alwp " + this.getName() + " " + f.getName() + ")";
	}

    @Override
    public String toString() {
        return "(alwp " + f + ")";
    }
    
    @Override
	public boolean equals(Object o) {
		if (o instanceof AlwP)
			return f.equals(((AlwP) o).getFormula());
		return false;
	}

}
