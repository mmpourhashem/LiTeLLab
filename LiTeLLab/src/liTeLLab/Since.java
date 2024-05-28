/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class Since extends OLTLFormula {

	private OLTLFormula f1;
	private OLTLFormula f2;

	public Since(OLTLFormula f1, OLTLFormula f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	public OLTLFormula getFormula2() {
		return f2;
	}

	public OLTLFormula getFormula1() {
		return f1;
	}

	@Override
	public String getSemantics() {
		return "(since " + this.getName() + " " + f1.getName() + " " + f2.getName() + ")";
	}

	@Override
	public String toString() {
		return "(since " + f1 + " " + f2 + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Since)
			return f1.equals(((Since) o).getFormula1()) && f2.equals(((Since) o).getFormula2());

		return false;
	}


}