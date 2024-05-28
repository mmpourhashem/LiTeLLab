/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class AlwF extends OLTLFormula {

	OLTLFormula f;

	public AlwF(OLTLFormula f) {
		super();
		this.f = f;
	}

	public OLTLFormula getFormula() {
		return f;
	}

	@Override
	public String getSemantics() {
		return "(alwf " + this.getName() + " " + f.getName() + ")";
	}

	@Override
	public String toString() {
		return "(alwf " + f + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof AlwF)
			return f.equals(((AlwF) o).getFormula());
		return false;
	}

}
