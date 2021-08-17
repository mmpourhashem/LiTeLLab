/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;


import java.util.HashSet;

public class Predicate extends Atom {

	public static HashSet<Predicate> instances = new HashSet<Predicate>();

	private String predicatename;
	public Predicate() {
	}

	public Predicate(String predicatename) {
		this.predicatename=predicatename;
		instances.add(this);
	}

	public void setPredicateName(String predicatename) {
		this.predicatename=predicatename;
		instances.add(this);
	}

	public String getPredicateName() {
		return predicatename;
	}

//	public String getSemantics() {
//			return s;
//	}
	
	@Override
	public String getName() {
		return predicatename;
	}
	
	@Override
	public String toString() {
		return "(-P- " + predicatename + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Predicate)
			return (predicatename.toUpperCase().equals(((Predicate) o).getPredicateName().toUpperCase()));

		return false;
	}    

	@Override
	public int hashCode() {
		try {
			return this.predicatename.toUpperCase().hashCode();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public String getSemantics() {
		return null;
	}
	
}
