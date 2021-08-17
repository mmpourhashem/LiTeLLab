/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

import java.util.ArrayList;

public class And extends LTLFormula {
	ArrayList<LTLFormula> f = new ArrayList<LTLFormula>();

	public And(LTLFormula... formulae) {
		super();
		ArrayList<LTLFormula> bfs = new ArrayList<LTLFormula>();
		for (LTLFormula bf:formulae)
			bfs.add(bf);
		setFormulae(bfs);
	}

	public And(ArrayList<LTLFormula> formulae) {
		super();
		setFormulae(formulae);
	}

	public void setFormulae(ArrayList<LTLFormula> formulae) {
		f = new ArrayList<LTLFormula>();
		for (LTLFormula bf:formulae)
				add(bf);
	}

	/**
	 * Avoids redundant elements.
	 */
	public void add(LTLFormula fIn) {
		for (LTLFormula fma: f)
			if (fma.equals(fIn))
				return;
		if (fIn != null)
			f.add(fIn);
	}

//	public void removeFormulae(int index) {
//		f.remove(index);
//	}

	public void addAll(ArrayList<LTLFormula> bfs) {
		for (LTLFormula bf:bfs)
			if (bf != null)
				add(bf);
	}

	public ArrayList<LTLFormula> getFormulae() {
		return f;
	}

	public int size() {
		return f.size();
	}

	public String getSemantics() {
		String s = "";
		for (LTLFormula ltlf : f)
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
			ArrayList<LTLFormula> a1 = this.getFormulae();
			ArrayList<LTLFormula> a2 = ((And) o).getFormulae();
			return Parser.bfArrayEqual(a1, a2);
		}

		return false;
	}

}
