package com.pourhashem.oltl.oltl;

import java.util.ArrayList;

public abstract class LTLFormula extends Formula {
	public static ArrayList<LTLFormula> ltlInstances = new ArrayList<LTLFormula>();
	private int index = -1;

	public abstract String getSemantics();

	public LTLFormula() {
		if (!(this instanceof Atom))
			ltlInstances.add(this);
	}

	public int getIndex() {
		for (int i = 0; i < ltlInstances.size(); i++)
			if (ltlInstances.get(i).equals(this)) {
				index = i;
				return index;
			}
		index = -2;
		return index;
	}

	public String getName() {
		if (index >= 0)
			return "oltl" + index;
		return "oltl" + getIndex();
	}

}
