/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

import java.util.ArrayList;

public class And extends OLTLFormula {
	ArrayList<OLTLFormula> f = new ArrayList<OLTLFormula>();

	public And(OLTLFormula... formulae) {
		super();
		ArrayList<OLTLFormula> bfs = new ArrayList<OLTLFormula>();
		for (OLTLFormula bf:formulae)
			bfs.add(bf);
		setFormulae(bfs);
	}

	public And(ArrayList<OLTLFormula> formulae) {
		super();
		setFormulae(formulae);
	}

	public void setFormulae(ArrayList<OLTLFormula> formulae) {
		f = new ArrayList<OLTLFormula>();
		for (OLTLFormula bf:formulae)
				add(bf);
	}

	/**
	 * Avoids redundant elements.
	 */
	public void add(OLTLFormula fIn) {
		for (OLTLFormula fma: f)
			if (fma.equals(fIn))
				return;
		if (fIn != null)
			f.add(fIn);
	}

//	public void removeFormulae(int index) {
//		f.remove(index);
//	}

	public void addAll(ArrayList<OLTLFormula> bfs) {
		for (OLTLFormula bf:bfs)
			if (bf != null)
				add(bf);
	}

	public ArrayList<OLTLFormula> getFormulae() {
		return f;
	}

	public int size() {
		return f.size();
	}

	public String getSemantics() {
		String s = "";
		for (OLTLFormula ltlf : f)
			s += " " + ltlf.getName();

		return "(= " + this.getName() + " (bvand" + s + "))";
	}

	@Override
	public String toString() {
		if (f.isEmpty())
			return "";

		String s = "(&&";
		for (int i = 0; i < f.size(); i++)
			s = s + " " + f.get(i).toString();

		return s + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof And) {
			ArrayList<OLTLFormula> a1 = this.getFormulae();
			ArrayList<OLTLFormula> a2 = ((And) o).getFormulae();
			if (a1.size() != a2.size())
				return false;
//			return Parser.bfArrayEqual(a1, a2);
			return Parser.bfArraySubset(a1, a2);
		}

		return false;
	}

}
