/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Som extends LTLFormula {

	LTLFormula f;

    public Som(LTLFormula f) {
    	super();
		this.f = f;
    }
    
    public LTLFormula getFormula() {
    	return f;
    }
    
    @Override
    public String toString() {
        return "(som " + f + ")";
    }
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Som)
			return f.equals(((Som) o).getFormula());
		return false;
	}

	@Override
	public String getSemantics() {
		return "(som " + this.getName() + " " + f.getName() + ")";
	}
	
}
