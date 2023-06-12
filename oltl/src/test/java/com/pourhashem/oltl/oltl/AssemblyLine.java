/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("deprecation")
public class AssemblyLine {
	private int bound;
	private OLTLFormula formula;
	private int setupDeadline;

	public AssemblyLine(int setupDeadline) {
		this.setupDeadline = setupDeadline;
		this.formula = getConfigAxioms();
//		System.out.println(formula);//TODO del
	}

	public OLTLFormula getConfigAxioms() {
		And result = new And();
		result.add(getNextM(1, 100, 1, 4)); //Current machine index, M1's price, the price of M1's product, next machine index
		result.add(getNextM(4, 250, 3, 6));
		result.add(getNextM(2, 110, 1, 5));
		result.add(getNextM(5, 300, 3, 6));
		result.add(getNextM(6, 350, 8, 7));
		result.add(getNextM(3, 200, 2, 7));
		result.add(getNextM(7, 400, 15, -1));
		result.add(getPreviousM(4, 1));
		result.add(getPreviousM(5, 2));
		result.add(getPreviousM(6, 4, 5));
		result.add(getPreviousM(7, 6, 3));
		result.add(getMutEx(7));
		result.add(getSetupDeadline(setupDeadline));//It restricts the number of machine setup. Challenging numbers: 1,4,5
		return result;

	}

	public String getOLTLScript() {
		return formula.toString();
	}
	
	/*
	 * 				"(&& "
					+ "(w (-p- noSomeM1S) 100)"
					+ "(alw (&&"
					+ "(w (-p- M1O) 2)        "
					+ "(-> (-p- M1S) (&& (-p- setup) (next (!!(somf (-p- M1S))))))"
					+ "(<-> (-p- noSomeM1S) (!! (som (-p- M1S))))"
					+ "(<-> (-p- M1R) (somp (-p- M1S))) "
					+ "(<-> (-p- M1O) (&& (-p- M1R) (!! (-p- M2R) )))"
					+ "))"
					+ ")"
	 */
	//negative m2 means M2 is the last Machine in the chain.
	private OLTLFormula getNextM(int m1, int m1Price, int m1ProductPrice, int m2) {
		And result = new And();
		result.add(new WAP(getNoSomeMS(m1), m1Price));
		And and = new And();
		and.add(new WAP(getMO(m1), m1ProductPrice));
		and.add(new Impl(getMS(m1), new And(new Predicate("setup"), new Next(new Not(new SomF(getMS(m1)))))));
		and.add(new Iff(getNoSomeMS(m1), new Not(new Som(getMS(m1)))));
		and.add(new Impl(getMR(m1), new SomP(getMS(m1))));
		if (m2 >= 0)
			and.add(new Iff(getMO(m1), new And(getMR(m1), new Not(getMR(m2)))));
		else
			and.add(new Iff(getMO(m1), getMR(m1)));
		result.add(new Alw(and));

		return result;
	}

	/*
	 * (-> (-p- M2R) (-p- M1R))
	 */
	private OLTLFormula getPreviousM(int m2, int... m1) {
		if (m1.length == 1)
			return new Alw(new Impl(getMR(m2), getMR(m1[0])));
		And and = new And();
		for (int m : m1)
			and.add(getMR(m));
		return new Alw(new Impl(getMR(m2), and));
	}

	private OLTLFormula getMutEx(int n) {
		And and = new And();
		if (n == 2)
			return new Impl(getMS(1), new Not(getMS(2)));
		for (int i = 1; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				and.add(new Not(new And(getMS(i), getMS(j))));

		return new Alw(and);
	}

	// d: the number of time instants user is allowed to setup
	private OLTLFormula getSetupDeadline(int d) {
		return new XFutr(new Not(new SomF(new Predicate("setup"))), d);
	}

	private Predicate getNoSomeMS(int index) {
		return new Predicate("noSomeM"+index+"S");
	}
	private Predicate getMO(int index) {//output
		return new Predicate("M"+index+"O");
	}
	private Predicate getMS(int index) {//setup
		return new Predicate("M"+index+"S");
	}
	private Predicate getMR(int index) {//running
		return new Predicate("M"+index+"R");
	}

	public int getBound() {
		return bound;
	}

}