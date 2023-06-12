/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

import java.util.HashSet;

public class WAP extends Atom {

	public static HashSet<WAP> instances = new HashSet<WAP>();
	private Predicate ap;
	private float weight;
	private boolean isRootX = true;
	private HashSet<Integer> assertedTimeInstants = new HashSet<Integer>();
	private String name = "";

	public WAP(Predicate ap, float weight) {
		this.ap = ap;
		this.weight = weight;
		new Predicate(getName());
		instances.add(this);
	}

	public String getName() {
		if (name.length() > 0)
			return name;
		int count = 0;
		for (WAP wap : instances)
			if (wap.getAp().getName().equals(ap.getName()) && wap.getWeight() != weight)
				count++;
		name = "w" + ++count + ap.getName();
		return name;
	}

	public Predicate getAp() {
		return ap;
	}

	public float getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "(w " + ap + " " + weight + ")";
	}

	public boolean isRootX() {
		return isRootX;
	}

	public void setRootX(boolean isRootX) {
		for (WAP wap : instances)
			if (wap.equals(this))
				wap.isRootX = isRootX;
	}

	public HashSet<Integer> getAssertedTimeInstants() {
		return assertedTimeInstants;
	}

	public void addAssertedTimeInstants(int index) {
		for (WAP wap : instances)
			if (wap.equals(this))
				wap.assertedTimeInstants.add(index);
	}

	@Override
	public int hashCode() {
		try {
			return (name.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof WAP)
			return (ap.equals(((WAP) o).getAp()) && weight == ((WAP) o).getWeight());
		return false;
	}

	@Override
	public String getSemantics() {
		String high = "";
		String low = "";
		if (! isRootX)
			for (int t = 0; t <= Model.getBound(); t++) {
				high += "\n(assert-soft (= #b1 (bvor (bvnot ((_ extract "+t+" "+t+") "+name+")) (bvnot ((_ extract "+t+" "+t+") in_loop)) ((_ extract "+t+" "+t+") "+ap.getName()+"))) :weight "+weight+" :id high)";
				low += "\n(assert-soft (= #b1 (bvor (bvnot ((_ extract "+t+" "+t+") "+name+")) ((_ extract "+t+" "+t+") in_loop) ((_ extract "+t+" "+t+") "+ap.getName()+"))) :weight "+weight+" :id low)";
			}
		else
			for (int t : assertedTimeInstants) {
				high += "\n(assert-soft (= #b1 (bvor (bvnot ((_ extract "+t+" "+t+") "+name+")) (bvnot ((_ extract "+t+" "+t+") in_loop)) ((_ extract "+t+" "+t+") "+ap.getName()+"))) :weight "+weight+" :id high)";
				low += "\n(assert-soft (= #b1 (bvor (bvnot ((_ extract "+t+" "+t+") "+name+")) ((_ extract "+t+" "+t+") in_loop) ((_ extract "+t+" "+t+") "+ap.getName()+"))) :weight "+weight+" :id low)";
			}
		
//		return high + low;
		return "";
	}

	public String getHighSemantics() {
		String result = "";
		if (! isRootX)
//				(ite (= #b1 (bvand ((_ extract 0 0) w1a) ((_ extract 0 0) in_loop) (bvnot ((_ extract 0 0) a)))) 1.0 0.0)
			for (int t = 0; t <= Model.getBound(); t++)
				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") ((_ extract "+t+" "+t+") in_loop) (bvnot ((_ extract "+t+" "+t+") "+ap.getName()+")))) "+weight+" 0.0)";
		else
			for (int t : assertedTimeInstants)
				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") ((_ extract "+t+" "+t+") in_loop) (bvnot ((_ extract "+t+" "+t+") "+ap.getName()+")))) "+weight+" 0.0)";	
		
		return result;
	}

	public String getLowSemantics() {
		String result = "";
		if (! isRootX)
//				(ite (= #b1 (bvand ((_ extract 0 0) w1a) ((_ extract 0 0) in_loop) (bvnot ((_ extract 0 0) a)))) 1.0 0.0)
			for (int t = 0; t <= Model.getBound(); t++)
				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") (bvnot ((_ extract "+t+" "+t+") in_loop)) (bvnot ((_ extract "+t+" "+t+") "+ap.getName()+")))) "+weight+" 0.0)";
		else
			for (int t : assertedTimeInstants)
				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") (bvnot ((_ extract "+t+" "+t+") in_loop)) (bvnot ((_ extract "+t+" "+t+") "+ap.getName()+")))) "+weight+" 0.0)";	
		
		return result;
	}

}