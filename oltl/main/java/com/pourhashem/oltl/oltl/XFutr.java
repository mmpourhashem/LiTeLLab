/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class XFutr extends Abbreviation {

	private OLTLFormula f;
	private int x;
	
	public XFutr(OLTLFormula f, int x) {
		super();
		this.f = f;
		this.x = x;
	}

	public OLTLFormula getFormula() {
		return f;
	}
	
	public int getX() {
		return x;
	}
	
	@Override
	public String getSemantics() {
		return null;
	}

	@Override
	public String toString() {
		return "(next " + f + " " + x + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof XFutr)
			return (f.equals(((XFutr) o).getFormula()) && ((XFutr) o).getX() == this.x);

		return false;
	}
	
}