/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

import java.util.HashSet;

public class WAP extends Atom {

	public static HashSet<WAP> instances = new HashSet<WAP>();
	private Predicate ap;
	private float weight;
	private boolean isRootX = true;
	private HashSet<Integer> assertedTimeInstants = new HashSet<Integer>();
	private String name = "";
	private boolean intervalWise = false;

	public WAP(Predicate ap, float weight) {
		this(ap, weight, false);
	}

	public WAP(Predicate ap, float weight, boolean intervalWise) {
		this.ap = ap;
		this.weight = weight;
		this.intervalWise = intervalWise;
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
		if (intervalWise)
			name = "iw" + ++count + ap.getName();
		else
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
		String i = "";
		if (intervalWise)
			i = "i";
		return "(" + i + "w " + ap + " " + weight + ")";
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

	public String getHighSemantics() {
		String result = "";
		//				(ite (= #b1 (bvand ((_ extract 0 0) w1a) ((_ extract 0 0) in_loop) (bvnot ((_ extract 0 0) a)))) 1.0 0.0)
		for (int t = 0; t <= Model.getBound(); t++)
			if ((! isRootX) || assertedTimeInstants.contains(t))
				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") ((_ extract "+t+" "+t+") in_loop) (bvnot ((_ extract "+t+" "+t+") "+ap.getName()+")))) "+weight+" 0.0)";	

		return result;
	}

	public String getLowSemantics() {
		String result = "";
		//				(ite (= #b1 (bvand ((_ extract 0 0) w1a) ((_ extract 0 0) in_loop) (bvnot ((_ extract 0 0) a)))) 1.0 0.0)
		for (int t = 0; t <= Model.getBound(); t++)
			if ((! isRootX) || assertedTimeInstants.contains(t))
				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") (bvnot ((_ extract "+t+" "+t+") in_loop)) (bvnot ((_ extract "+t+" "+t+") "+ap.getName()+")))) "+weight+" 0.0)";

		return result;
	}

	//	<before interval wise weights>
	//	public String getOCLTLocLowSemantics() {
	//		String result = "",length = Model.prefix + "Length";;
	//		for (int t = 0; t <= Model.getBound(); t++)
	//			if ((! isRootX) || assertedTimeInstants.contains(t))
	//				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") (bvnot ((_ extract "+t+" "+t+") in_loop)) "
	//						+ "(bvnot ((_ extract "+t+" "+t+") "+ap.getName()+")))) (+ " + Model.getTransitionCost() + " (* "+weight+" (to_real ("+length+" " +t+"))))" +" 0.0)";//"(+ 1" is for transition cost
	//
	//		return result;
	//	}
	//
	//	public String geOCLTLoctHighSemantics() {
	//		String result = "",length = Model.prefix + "Length";;
	//		for (int t = 0; t <= Model.getBound(); t++)
	//			if ((! isRootX) || assertedTimeInstants.contains(t))
	//				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") ((_ extract "+t+" "+t+") in_loop) "
	//						+ "(bvnot ((_ extract "+t+" "+t+") "+ap.getName()+")))) (+ " + Model.getTransitionCost() + " (* "+weight+" (to_real ("+length+" " +t+"))))" +" 0.0)";//"(+ 1" is for transition cost
	//
	//		return result;
	//	} </before interval wise weights>

	public String getOCLTLocLowSemantics() {
		String result = "",length = Model.prefix + "Length";;
		for (int t = 0; t < Model.getBound(); t++)
			if ((! isRootX) || assertedTimeInstants.contains(t)) {
				String cost = " " + weight;
				if (intervalWise)
					cost = " (* "+weight+" (to_real ("+length+" " +t+")))";
				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") (bvnot ((_ extract "+t+" "+t+") in_loop)) "
						+ "(bvnot ((_ extract "+t+" "+t+") "+ap.getName()+"))))" + cost + " 0.0)";
			}

		return result;
	}

	public String geOCLTLoctHighSemantics() {
		String result = "",length = Model.prefix + "Length";;
		for (int t = 1; t <= Model.getBound(); t++)
			if ((! isRootX) || assertedTimeInstants.contains(t)) {
				String cost = " " + weight;
				if (intervalWise)
					cost = " (* "+weight+" (to_real ("+length+" " +t+")))";
				result += "\n(ite (= #b1 (bvand ((_ extract "+t+" "+t+") "+name+") ((_ extract "+t+" "+t+") in_loop) "
						+ "(bvnot ((_ extract "+t+" "+t+") "+ap.getName()+"))))" + cost + " 0.0)";
			}

		return result;
	}

	public boolean getIntervalWise() {
		return intervalWise;
	}

	@Override
	public int hashCode() {
		try {
			return ((name + intervalWise).hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof WAP)
			return (ap.equals(((WAP) o).getAp()) && weight == ((WAP) o).getWeight() && ((WAP) o).getIntervalWise() == intervalWise);
		return false;
	}

	@Override
	public String getSemantics() {
		return null;
	}

}