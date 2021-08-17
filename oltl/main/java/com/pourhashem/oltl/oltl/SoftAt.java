/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

public class SoftAt extends SoftFormula {

	Predicate ap;
	int time;
	String id = "";
	float weight;

	public SoftAt(Predicate ap, int time, String id, float weight) {
		cons(ap, time, id, weight);
	}
	
	public SoftAt(Predicate ap, int time, float weight) {
		cons(ap, time, "", weight);
	}
	
	private void cons(Predicate ap, int time, String id, float weight) {
		this.ap = ap;
		this.time = time;
		this.id = id;
		this.weight = weight;
	}

	public Formula getPredicate() {
		return ap;
	}

	public int getTime() {
		return time;
	}

	public float getWeight() {
		return weight;
	}

	@Override
	public String getSemantics() {
		String idPart = (id.length() == 0) ? "" : " :id " + id;
		return "(assert-soft (= ((_ extract " + time + " " + time + ") " + ap.getName() + ") #b1)" + idPart + " :weight "
				+ weight + ")";
	}

	@Override
	public String toString() {
		String idPart = (id.length() == 0) ? "" : id + " ";
		return "(soft (@ " + ap + " " + time + ") " + idPart + weight + ")";
	}

}