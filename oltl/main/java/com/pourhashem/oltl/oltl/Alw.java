/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class Alw extends LTLFormula{

    public LTLFormula f;

    public Alw(LTLFormula f) {
    	super();
        this.f = f;
    }

    public LTLFormula getFormula(){
		return f;
	}
    
    @Override
    public String getSemantics() {
    	return "(alw " + this.getName() + " " + f.getName() + ")";
    }

    @Override
    public String toString() {
        return "(alw " + f + ")";
    }

    @Override
	public boolean equals(Object o) {
		if (o instanceof Alw)
			return f.equals(((Alw) o).getFormula());
		return false;
	}

}
