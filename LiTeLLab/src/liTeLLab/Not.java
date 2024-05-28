/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class Not extends OLTLFormula {

	private OLTLFormula f;

	public Not(OLTLFormula f) {
		super();
		this.f = f;
	}

	public OLTLFormula getFormula() {
		return f;
	}

	public String getSemantics() {
		return "(= " + this.getName() + " (bvnot " + f.getName() + "))";
	}

	@Override
	public String toString() {
		return "(!! " + f + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Not)
			return f.equals(((Not) o).getFormula());

		return false;
	}

}
