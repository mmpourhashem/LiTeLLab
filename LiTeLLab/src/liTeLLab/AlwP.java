/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class AlwP extends OLTLFormula {

	OLTLFormula f;

    public AlwP(OLTLFormula f) {
    	super();
		this.f = f;
    }
    
    public OLTLFormula getFormula() {
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
