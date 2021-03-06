/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class SomP extends LTLFormula {

	LTLFormula f;

    public SomP(LTLFormula f) {
    	super();
		this.f = f;
    }
    
    public LTLFormula getFormula() {
    	return f;
    }
    
    @Override
    public String toString() {
        return "(somp " + f + ")";
    }
    
    @Override
	public boolean equals(Object o) {
		if (o instanceof SomP)
			return f.equals(((SomP) o).getFormula());
		return false;
	}

	@Override
	public String getSemantics() {
		return "(somp " + this.getName() + " " + f.getName() + ")";
	}

}
