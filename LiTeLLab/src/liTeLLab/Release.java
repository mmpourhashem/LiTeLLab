/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class Release extends OLTLFormula {

	private OLTLFormula f1;
	private OLTLFormula f2;

	public Release(OLTLFormula f1, OLTLFormula f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	public OLTLFormula getFormula1() {
		return f1;
	}

	public OLTLFormula getFormula2() {
		return f2;
	}

	@Override
	public String getSemantics() {
		return "(release " + this.getName() + " " + f1.getName() + " " + f2.getName() + ")";
	}

	@Override
	public String toString() {
		return "(release " + f1 + " " + f2 + ")";
	}

	@Override
	public boolean equals(Object o){
		if (o instanceof Release)
			return f1.equals(((Release) o).getFormula1()) && f2.equals(((Release) o).getFormula2());

		return false;
	}


}