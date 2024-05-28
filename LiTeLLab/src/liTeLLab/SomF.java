/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class SomF extends OLTLFormula {

	OLTLFormula f;

    public SomF(OLTLFormula f) {
    	super();
		this.f = f;
    }
    
    public OLTLFormula getFormula() {
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
