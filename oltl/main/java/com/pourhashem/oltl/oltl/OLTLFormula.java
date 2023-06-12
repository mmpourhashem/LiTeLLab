package com.pourhashem.oltl.oltl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class OLTLFormula extends Formula {
	public static ArrayList<OLTLFormula> ltlInstances = new ArrayList<OLTLFormula>();
	private int index = -1;

	public abstract String getSemantics();

	public OLTLFormula() {
//		if (!(this instanceof Atom) && !(this instanceof Abbreviation) && !(containsAbbreviation()))
		if (!(this instanceof Atom))
			ltlInstances.add(this);
	}

	public int getIndex() {
		for (int i = 0; i < ltlInstances.size(); i++) {
			if (ltlInstances.get(i).equals(this))
				return i;
		}
		return -2;
	}

	public String getName() {
		if (index >= 0)
			return "oltl" + index;
		return "oltl" + getIndex();
	}

	public boolean containsAbbreviation() {
		if (this instanceof Alw)
			return ((Alw)this).getFormula().containsAbbreviation();
		if (this instanceof AlwF)
			return ((AlwF)this).getFormula().containsAbbreviation();
		if (this instanceof AlwP)
			return ((AlwP)this).getFormula().containsAbbreviation();
		if (this instanceof Iff) {
			return ((Iff)this).getFormula1().containsAbbreviation() || ((Iff)this).getFormula2().containsAbbreviation();
		}
		if (this instanceof Impl) {
			return ((Impl)this).getFormula1().containsAbbreviation() || ((Impl)this).getFormula2().containsAbbreviation();
		}
		if (this instanceof Next)
			return ((Next)this).getFormula().containsAbbreviation();
		if (this instanceof Not)
			return ((Not)this).getFormula().containsAbbreviation();
		if (this instanceof Release) {
			return ((Release)this).getFormula1().containsAbbreviation() || ((Release)this).getFormula2().containsAbbreviation();
		}
		if (this instanceof Since) {
			return ((Since)this).getFormula1().containsAbbreviation() || ((Since)this).getFormula2().containsAbbreviation();
		}
		if (this instanceof Until) {
			return ((Until)this).getFormula1().containsAbbreviation() || ((Until)this).getFormula2().containsAbbreviation();
		}
		if (this instanceof Trigger) {
			return ((Trigger)this).getFormula1().containsAbbreviation() || ((Trigger)this).getFormula2().containsAbbreviation();
		}
		if (this instanceof Som)
			return ((Som)this).getFormula().containsAbbreviation();
		if (this instanceof SomF)
			return ((SomF)this).getFormula().containsAbbreviation();
		if (this instanceof SomP)
			return ((SomP)this).getFormula().containsAbbreviation();
		if (this instanceof Yesterday)
			return ((Yesterday)this).getFormula().containsAbbreviation();
		if (this instanceof And) {
			And and = new And();
			for (OLTLFormula f : ((And)this).getFormulae())
				if (f.containsAbbreviation())
					return true;
			return false;
		}
		if (this instanceof Or) {
			Or or = new Or();
			for (OLTLFormula f : ((Or)this).getFormulae())
				if (f.containsAbbreviation())
					return true;
			return false;
		}
		if (this instanceof Abbreviation)
			return true;
		
		return false;
	}

}
