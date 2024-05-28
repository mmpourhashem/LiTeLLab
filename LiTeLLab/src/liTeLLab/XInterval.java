/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class XInterval extends Abbreviation {

	private OLTLFormula f;
	private int x1;
	private int x2;
	
	public XInterval(OLTLFormula f, int x1, int x2) {
		super();
		this.f = f;
		this.x1 = x1;
		this.x2 = x2;
	}

	public OLTLFormula getFormula() {
		return f;
	}
	
	public int getX1() {
		return x1;
	}
	
	public int getX2() {
		return x2;
	}
	
	@Override
	public String getSemantics() {
		return null;
	}

	@Override
	public String toString() {
		return "(next " + f + " " + x1 + " " + x2 + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof XInterval)
			return (f.equals(((XInterval) o).getFormula()) && ((XInterval) o).getX1() == this.x1 && ((XInterval) o).getX2() == this.x2);

		return false;
	}
	
}