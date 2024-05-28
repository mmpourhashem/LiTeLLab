/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class Som extends OLTLFormula {

	OLTLFormula f;

    public Som(OLTLFormula f) {
    	super();
		this.f = f;
    }
    
    public OLTLFormula getFormula() {
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
