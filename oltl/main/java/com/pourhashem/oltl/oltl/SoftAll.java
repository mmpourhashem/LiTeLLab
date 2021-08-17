/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class SoftAll extends SoftFormula {

	Predicate ap;
	String id = "";
	float weight;

	public SoftAll(Predicate ap, String id, float weight) {
		cons(ap, id, weight);
	}

	public SoftAll(Predicate ap, float weight) {
		cons(ap, "", weight);
	}

	private void cons(Predicate ap, String id, float weight) {
		this.ap = ap;
		this.id = id;
		this.weight = weight;
	}

	public Formula getPredicate() {
		return ap;
	}

	public float getWeight() {
		return weight;
	}

	@Override
	public String getSemantics() {
		String s = "";
//		for (int time = 0; time <= Model.getBound(); time++)
		for (int time = 0; time < Model.getSoftBound(); time++)
			s += '\n' + new SoftAt(ap, time, id, weight).getSemantics();
		return s;
	}

	@Override
	public String toString() {
		String idPart = (id.length() == 0) ? "" : id + " ";
		return "(soft " + ap + " " + idPart + weight + ")";
	}

}
