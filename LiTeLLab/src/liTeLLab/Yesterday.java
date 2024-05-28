/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class Yesterday extends OLTLFormula {

	OLTLFormula f;

	public Yesterday(OLTLFormula f) {
		super();
		this.f = f;
	}

	public OLTLFormula getFormula(){ 
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
