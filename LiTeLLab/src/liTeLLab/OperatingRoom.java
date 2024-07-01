/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//	To add a surgery check out #AddSurgery

@SuppressWarnings("deprecation")
public class OperatingRoom {
	private final int bound;
	private final int softBound;
	private final int numberOfORs, numberOfSurgeons, numberOfSurgeries;
	private final Date startTime = new Date(0, 0, 0, 8, 0);
	//	private final Date shiftEndTime = new Date(0, 0, 0, 21, 0);
	private final Date shiftEndTime = new Date(0, 0, 0, 19, 0);
	private final Date endTime = new Date(0, 0, 0, 24, 0);

	//old costs 2,4,5,10
	private final int noIdleORPenalty = 1; //for every OR being idle for an hour

	private final int noWaitingSNPenalty [] = {4, 4, 1, 1}; //for every SN waiting for an hour
	private final int noOverTimeSNPenalty[] = {1, 1, 4, 4}; //for every SN working overtime for an hour

//	private final int SR4PrecedesSR3Penalty = 10; //if SR4 follows SR3 it has this much penalty

	private final int timeInstantsPerHour = 1;
	private OLTLFormula ltlFormula;
	private Predicate shiftEndP = new Predicate("ShiftEnd");

	public OperatingRoom(int numberOfORs, int numberOfSurgeries) {
		this.softBound = getCeilTimeInstant(endTime) - getTimeInstant(startTime);
		this.bound = softBound + 3;
		this.numberOfORs = numberOfORs; //main max=4
		this.numberOfSurgeries = numberOfSurgeries;//Main max=9
		numberOfSurgeons = 4;
		//#AddSurgery
		ltlFormula = getConfigAxioms();
	}

	public OLTLFormula getConfigAxioms() {
		ArrayList<OLTLFormula> system = new ArrayList<OLTLFormula>();
		ArrayList<OLTLFormula> init = new ArrayList<OLTLFormula>();
		init.add(getNestedNexts(shiftEndP, getCeilTimeInstant(shiftEndTime) - getTimeInstant(startTime)));
		system.addAll(getGeneralAxioms());
		system.addAll(getSurgeonsSurgeriesAxioms());
		system.addAll(getSR1Axioms());
		system.addAll(getSR2Axioms());
		system.addAll(getSR3Axioms());
		system.addAll(getSR4Axioms());
		system.addAll(getSR5Axioms());
		if (numberOfSurgeries >= 6) 
			system.addAll(getSR6Axioms());
		if (numberOfSurgeries >= 7)
			system.addAll(getSR7Axioms());
		if (numberOfSurgeries >= 8)
			system.addAll(getSR8Axioms());
		if (numberOfSurgeries >= 9)
			system.addAll(getSR9Axioms());
		//#AddSurgery

		system.add(new Som(getSRPredicate(1)));
		system.add(new Som(getSRPredicate(2)));
		system.add(new Som(getSRPredicate(3)));
		system.add(new Som(getSRPredicate(4)));
		system.add(new Som(getSRPredicate(5)));
		if (numberOfSurgeries >= 6)
		system.add(new Som(getSRPredicate(6)));
		if (numberOfSurgeries >= 7)
			system.add(new Som(getSRPredicate(7)));
		if (numberOfSurgeries >= 8)
			system.add(new Som(getSRPredicate(8)));
		if (numberOfSurgeries >= 9)
			system.add(new Som(getSRPredicate(9)));
		//#AddSurgery

		system.addAll(getNoConsequentSRsForAnySN5HoursOrMore());
		system.addAll(getSoftNoOverTimeSN());
		system.addAll(getSoftNoIdleOr());
		system.addAll(getSoftNoWaitingSN());



		And systemAnd = new And();
		systemAnd.addAll(system);
		And result = new And();
		if (init.size() > 0) {
			And initAnd = new And();
			initAnd.addAll(init);
			result.add(initAnd);
		}
		result.add(new Alw(systemAnd));

		return result;
	}

	public String getOLTLScript() {
		return ltlFormula.toString();
	}

	public Predicate getORPredicate(int orIndex) {
		return new Predicate("OR" + orIndex);
	}

	public Predicate getSRPredicate(int srIndex) {
		return new Predicate("SR" + srIndex);
	}

	public Predicate getSNPredicate(int snIndex) {
		return new Predicate("SN" + snIndex);
	}

	public Predicate getORSNPredicate(int orIndex, int snIndex) {
		return new Predicate("OR" + orIndex + "SN" + snIndex);
	}

	public Predicate getORSRPredicate(int orIndex, int srIndex) {
		return new Predicate("OR" + orIndex + "SR" + srIndex);
	}

	public Predicate getORSRPPredicate(int orIndex, int srIndex) {
		return new Predicate("OR" + orIndex + "SR" + srIndex + "P");
	}

	public Predicate getORSRCPredicate(int orIndex, int srIndex) {
		return new Predicate("OR" + orIndex + "SR" + srIndex + "C");
	}

	/*Bidirectional (not concurrent) Order
  	(&&
	  (-> f1 (next (until (!! f1) f2)))
	  (-> f2 (yesterday (since (!! f2) f1)))
	  (-> f1 (!! f2)))*/
	public ArrayList<OLTLFormula> getBDOrder(OLTLFormula f1, OLTLFormula f2) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		result.add(new Impl(f1, new Next(new Until(new Not(f1), f2))));
		result.add(new Impl(f2, new Yesterday(new Since(new Not(f2), f1))));
		result.add(new Impl(f1, new Not(f2)));

		return result;
	}

	/*Bidirectional Next
	  (<-> f1 (next f2))
	 */
	public ArrayList<OLTLFormula> getBDNext(OLTLFormula f1, OLTLFormula f2) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		result.add(new Iff(f1, new Next(f2)));

		return result;
	}

	/*Border (&&
	  (<-> module (&& (somp start) (somf end)))
	  (-> (|| start end) module))
	 */
	public ArrayList<OLTLFormula> getBorders(OLTLFormula module, OLTLFormula start, OLTLFormula end) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		result.add(new Iff(module, new And(new SomP(start), new SomF(end))));
		result.add(new Impl(new Or(start, end), module));

		return result;
	}

	/*Coincidence
	  (<-> f1 f2)
	 */
	public ArrayList<OLTLFormula> getCoincidence(OLTLFormula f1, OLTLFormula f2) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();

		result.add(new Iff(f1, f2));
		return result;
	}

	/*(defun once (ev)
			(&&
				(som ev)
				(alw (-> ev (alwf_e (!! ev))))))*/
	public ArrayList<OLTLFormula> getOnce(OLTLFormula f) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		result.add(new Som(f));
		result.add(new Alw(new Impl(f, new Next(new AlwF(new Not(f))))));
		return result;
	}

	/*(defun onceAndLength (ev length)
	(case length
		((2)
			(&& (som ev)
				(alw (-> (&& (!! (yesterday ev)) ev) (next (&& ev (next (alwf (!! ev)))))))))
		((3)
			(&& (som ev)
				(alw (-> (&& (!! (yesterday ev)) ev) (next (&& ev (next (&& ev (next (alwf (!! ev)))))))))))
		((4)
			(&& (som ev)
				(alw (-> (&& (!! (yesterday ev)) ev) (next (&& ev (next (&& ev (next (&& ev (next (alwf (!! ev)))))))))))))))*/
	public ArrayList<OLTLFormula> getOnceWithLength(OLTLFormula f, int length) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		if (length == 1)
			return getOnce(f);
		result.add(new Som(f));
		result.add(new Alw(new Impl(new And(new Not(new Yesterday(f)), f), getOnceWithLengthRec(f, length))));
		return result;
	}
	private OLTLFormula getOnceWithLengthRec(OLTLFormula f, int length) {
		if (length == 2)
			return new Next(new And(f, new Next(new AlwF(new Not(f)))));
		else if (length > 2)
			return new Next(new And(f, getOnceWithLengthRec(f, length - 1)));
		return null;
	}

	OLTLFormula getNestedNexts(OLTLFormula ltlFormula, int time) {
		assert (time >= 0);
		if (time == 0)
			return ltlFormula;
		if (time == 1)
			return new Next(ltlFormula);

		return new Next(getNestedNexts(ltlFormula, time - 1));
	}

	ArrayList<OLTLFormula> getExclusivity(ArrayList<OLTLFormula> formulae) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		if (formulae.size() == 2) {
			result.add(new Not(new And(formulae.get(0), formulae.get(1))));
			return result;
		} else if (formulae.size() > 2)
			for (int fIndex = 0; fIndex < formulae.size(); fIndex++) {
				Or orOtherFe = new Or();
				for (int otherFIndex = 0; otherFIndex < formulae.size(); otherFIndex++)
					if (otherFIndex != fIndex)
						orOtherFe.add(formulae.get(otherFIndex));
				result.add(new Impl(formulae.get(fIndex), new Not(orOtherFe)));
			}

		return result;
	}

	public int getTimeInstant(Date time) {
		return (int) (getDateDiff(startTime, time, TimeUnit.MINUTES) / (60.0 / timeInstantsPerHour));
	}

	public int getCeilTimeInstant(Date time) {
		return (int) Math.ceil(getDateDiff(startTime, time, TimeUnit.MINUTES) / (60.0 / timeInstantsPerHour));
	}

	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTime() - date1.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}

	/*
SR1P	SR1P	SN1	(SN1 SN2)	SN1	SR1C	
SR2P	SR2P	SN2	SN2	SN2	SR2C	
SR3P	SN3	SN3 SN4	(SN3 SN4)	SN3	SR3C	SR3C
SR4P	SN4	SN4	SN4	SR4C	SR4C	
SR5P	SN1	SN1	SN1	SR5C		
SR6P	SN3	SN3	SN3	SR6C		*///#AddSurgery
	ArrayList<OLTLFormula> getSurgeonsSurgeriesAxioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		result.addAll(getSurgeonsSurgeries(1, 1, 5, 9));//SN1 is engaged in SR1 and SR5
		result.addAll(getSurgeonsSurgeries(2, 1, 2, 7, 8));//***add 9
		//		result.addAll(getSurgeonsSurgeries(2, 1, 2, 7));
		result.addAll(getSurgeonsSurgeries(3, 3, 6));
		result.addAll(getSurgeonsSurgeries(4, 3, 4));
		//#AddSurgery

		return result;
	}
	/* 
	 * FAor(FAsn(<-> orsn ORsrOfor(orsr)))
	 * E.g. ... (<-> OR1SN1 (|| OR1SR1 OR1SR5) ...
	 */
	private ArrayList<OLTLFormula> getSurgeonsSurgeries(int ... snSrs) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		ArrayList<Integer> newSnSrs = new ArrayList<Integer>();
		newSnSrs.add(snSrs[0]);
		for (int i = 1; i < snSrs.length; i++)
			if (snSrs[i] <= numberOfSurgeries)
				newSnSrs.add(snSrs[i]);		
			
		assert (newSnSrs.size() > 1);
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			Or surgeriesOr = new Or();
			for (int srIndex = 1; srIndex < newSnSrs.size(); srIndex++) {
				surgeriesOr.add(getORSRPredicate(orIndex, newSnSrs.get(srIndex)));
			}
			result.add(new Impl(getORSNPredicate(orIndex, newSnSrs.get(0)), surgeriesOr));
		}

		return result;
	}

	/*//SN in a single OR
	 * (&& (i allOR) (&& (j allSN)
		  (-> (-p- oriSNj) (notOtherOriSNj(i)))*/
	ArrayList<OLTLFormula> getSNInSingleOR() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			for (int snIndex = 1; snIndex <= numberOfSurgeons; snIndex++)
				result.add(new Impl(getORSNPredicate(orIndex, snIndex), getNotOtherORForSN(orIndex, snIndex)));
			for (int srIndex = 1; srIndex <= numberOfSurgeries; srIndex++)
				result.addAll(getBorders(getORSRPredicate(orIndex, srIndex), getORSRPPredicate(orIndex, srIndex),getORSRCPredicate(orIndex, srIndex)));
		}

		return result;
	}

	/*
	 * (<-> SN1 (|| or1SN1 or2SN1 or3SN1))
	 */
	ArrayList<OLTLFormula> getSurgeonsDefinition() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int snIndex = 1; snIndex <= numberOfSurgeons; snIndex++) {
			Or orsSNsOr = new Or();
			for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
				orsSNsOr.add(getORSNPredicate(orIndex, snIndex));
			}
			result.add(new Iff(getSNPredicate(snIndex), orsSNsOr));
		}

		return result;
	}

	/*
	 * (<-> SR1 (|| or1SR1 or2SR1 or3SR1))
	 */
	ArrayList<OLTLFormula> getSurgeriesDefinition() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int srIndex = 1; srIndex <= numberOfSurgeries; srIndex++) {
			Or orsSROr = new Or();
			for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
				orsSROr.add(getORSRPredicate(orIndex, srIndex));
			}
			result.add(new Iff(getSRPredicate(srIndex), orsSROr));
		}

		return result;
	}

	// SR in a single OR
	// (-> (-p- oriSR1) (notGOtherOR(i)))
	// only one SR in a single OR
	// (-> (-p- oriSR1) (notOtherSRs(i, 1)))
	ArrayList<OLTLFormula> getORSRRelation() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int srIndex = 1; srIndex <= numberOfSurgeries; srIndex++)
			for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
				result.add(new Impl(getORSRPredicate(orIndex, srIndex), getGNotOtherORs(srIndex, orIndex)));
				result.add(new Impl(getORSRPredicate(orIndex, srIndex), getNotOtherSRs(orIndex, srIndex)));
			}

		return result;
	}

	OLTLFormula getNotOtherSNs(int snIndex, int orIndex) {
		Or or = new Or();
		for (int snIndexCounter = 1; snIndexCounter <= numberOfSurgeons; snIndexCounter++)
			if (snIndexCounter != snIndex)
				or.add(getORSNPredicate(orIndex, snIndexCounter));

		return new Not(or);
	}

	OLTLFormula getNotOtherSNs(int snIndex1, int snIndex2, int orIndex) {
		Or or = new Or();
		for (int snIndexCounter = 1; snIndexCounter <= numberOfSurgeons; snIndexCounter++)
			if (snIndexCounter != snIndex1 && snIndexCounter != snIndex2)
				or.add(getORSNPredicate(orIndex, snIndexCounter));

		return new Not(or);
	}

	OLTLFormula getGNotOtherORs(int srIndex, int orIndex) {
		Or or = new Or();
		for (int orIndexCounter = 1; orIndexCounter <= numberOfORs; orIndexCounter++)
			if (orIndexCounter != orIndex)
				or.add(getORSRPredicate(orIndexCounter, srIndex));

		return new Not(new Som(or));
	}

	OLTLFormula getNotOtherSRs(int orIndex, int srIndex) {
		Or or = new Or();
		for (int srIndexCounter = 1; srIndexCounter <= numberOfSurgeries; srIndexCounter++)
			if (srIndexCounter != srIndex)
				or.add(getORSRPredicate(orIndex, srIndexCounter));

		return new Not(or);
	}


	OLTLFormula getNotAnySN() {
		Or or = new Or();
		for (int snIndex = 1; snIndex <= numberOfSurgeons; snIndex++)
			or.add(getSNPredicate(snIndex));

		return new Not(or);
	}

	OLTLFormula getNotAnyORiSN(int orIndex) {
		Or or = new Or();
		for (int snIndex = 1; snIndex <= numberOfSurgeons; snIndex++)
			or.add(getORSNPredicate(orIndex, snIndex));

		return new Not(or);
	}

	private OLTLFormula getNotOtherORForSN(int orIndex, int snIndex) {
		Or or = new Or();
		for (int orIndexCounter = 1; orIndexCounter <= numberOfORs; orIndexCounter++)
			if (orIndex != orIndexCounter)
				or.add(getORSNPredicate(orIndexCounter, snIndex));

		return new Not(or);		
	}

	/*
SR1P	SR1P	SN1	(SN1 SN2)	SN1	SR1C	
SR2P	SR2P	SN2	SN2	SN2	SR2C	
SR3P	SN3	SN3 SN4	(SN3 SN4)	SN3	SR3C	SR3C
SR4P	SN4	SN4	SN4	SR4C	SR4C	
SR5P	SN1	SN1	SN1	SR5C		
SR6P	SN3	SN3	SN3	SR6C		//#AddSurgery
 //SN in a single OR
	 * (&& (i allOR) (&& (j allSN)
  (-> (-p- oriSNj) (notOtherOriSNj(i)))
  //no unwanted SNs

))
	 */
	private ArrayList<OLTLFormula> getGeneralAxioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		result.addAll(getOnceWithLength(shiftEndP, 1));
		result.addAll(getSNInSingleOR());
		result.addAll(getSurgeonsDefinition());
		result.addAll(getSurgeriesDefinition());
		result.addAll(getORSRRelation());


		return result;
	}

	/*SR1P	SR1P	SN1	(SN1 SN2)	SN1	SR1C	
	 */
	private ArrayList<OLTLFormula> getSR1Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 1;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN1 = new And(oriSR, getORSNPredicate(orIndex, 1));
			OLTLFormula oriSN2 = new And(oriSR, getORSNPredicate(orIndex, 2));

			and.addAll(getOnceWithLength(oriSRP, 2));
			and.addAll(getOnceWithLength(oriSN1, 3));
			and.addAll(getOnceWithLength(oriSN2, 1));
			and.addAll(getOnceWithLength(oriSRC, 1));
			//<paper>
			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), new And(oriSRP, new Next(oriSRP))));
			and.addAll(getBDOrder(new And(oriSRP, new Yesterday(oriSRP)), new And(oriSN1, new Yesterday(new Not(oriSN1)))));
			and.addAll(getCoincidence(new Yesterday(new And(oriSN1, new Yesterday(new Not(oriSN1)))), oriSN2));
			and.addAll(getBDOrder(new And(oriSN1, new Next(new Not(oriSN1))), oriSRC));
			//</paper>
			result.add(new Impl(oriSR, and));
		}

		return result;
	}

	/*SR2P	SR2P	SN2	SN2	SN2	SR2C
	 */
	private ArrayList<OLTLFormula> getSR2Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 2;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN2 = new And(oriSR, getORSNPredicate(orIndex, 2));

			and.addAll(getOnceWithLength(oriSRP, 2));
			and.addAll(getOnceWithLength(oriSN2, 3));
			and.addAll(getOnceWithLength(oriSRC, 1));

			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), new And(oriSRP, new Next(oriSRP))));
			and.addAll(getBDOrder(new And(oriSRP, new Yesterday(oriSRP)), new And(oriSN2, new Yesterday(new Not(oriSN2)))));
			and.addAll(getBDOrder(new And(oriSN2, new Next(new Not(oriSN2))), oriSRC));
			result.add(new Impl(oriSR, and));
		}

		return result;
	}

	/*SR3P	SN3	(SN3 SN4)	(SN3 SN4)	SN3	SR3C	SR3C
	 */
	private ArrayList<OLTLFormula> getSR3Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 3;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN3 = new And(oriSR, getORSNPredicate(orIndex, 3));
			OLTLFormula oriSN4 = new And(oriSR, getORSNPredicate(orIndex, 4));

			and.addAll(getOnceWithLength(oriSRP, 1));
			and.addAll(getOnceWithLength(oriSN3, 4));
			and.addAll(getOnceWithLength(oriSN4, 2));
			and.addAll(getOnceWithLength(oriSRC, 2));

			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), oriSRP));
			and.addAll(getBDOrder(oriSRP, new And(oriSN3, new Yesterday(new Not(oriSN3)))));
			and.addAll(getCoincidence(new And(oriSN3, new Yesterday(new And(oriSN3, new Not(new Yesterday(oriSN3))))), 
					new And(oriSN4, new Not(new Yesterday(oriSN4)))));
			and.addAll(getBDOrder(new And(oriSN3, new Next(new Not(oriSN3))), new And(oriSRC, new Next(oriSRC))));
			result.add(new Impl(oriSR, and));
		}

		return result;
	}

	/*SR4P	SN4	SN4	SN4	SR4C	SR4C	
	 */
	private ArrayList<OLTLFormula> getSR4Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 4;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN4 = new And(oriSR, getORSNPredicate(orIndex, 4));

			and.addAll(getOnceWithLength(oriSRP, 1));
			and.addAll(getOnceWithLength(oriSN4, 3));
			and.addAll(getOnceWithLength(oriSRC, 2));

			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), oriSRP));
			and.addAll(getBDOrder(oriSRP, new And(oriSN4, new Yesterday(new Not(oriSN4)))));
			and.addAll(getBDOrder(new And(oriSN4, new Next(new Not(oriSN4))), new And(oriSRC, new Next(oriSRC))));
			result.add(new Impl(oriSR, and));
		}

		return result;
	}

	/*SR5P	SN1	SN1	SN1	SR5C
	 */
	private ArrayList<OLTLFormula> getSR5Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 5;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN1 = new And(oriSR, getORSNPredicate(orIndex, 1));

			and.addAll(getOnceWithLength(oriSRP, 1));
			and.addAll(getOnceWithLength(oriSN1, 3));
			and.addAll(getOnceWithLength(oriSRC, 1));

			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), oriSRP));
			and.addAll(getBDOrder(oriSRP, new And(oriSN1, new Yesterday(new Not(oriSN1)))));
			and.addAll(getBDOrder(new And(oriSN1, new Next(new Not(oriSN1))), oriSRC));
			result.add(new Impl(oriSR, and));
		}

		return result;
	}

	/*SR6P	SN3	SN3	SN3	SR6C
	 */
	private ArrayList<OLTLFormula> getSR6Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 6;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN3 = new And(oriSR, getORSNPredicate(orIndex, 3));

			and.addAll(getOnceWithLength(oriSRP, 1));
			and.addAll(getOnceWithLength(oriSN3, 3));
			and.addAll(getOnceWithLength(oriSRC, 1));

			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), oriSRP));
			and.addAll(getBDOrder(oriSRP, new And(oriSN3, new Yesterday(new Not(oriSN3)))));
			and.addAll(getBDOrder(new And(oriSN3, new Next(new Not(oriSN3))), oriSRC));
			result.add(new Impl(oriSR, and));
		}

		return result;
	}

	/*SR7P	SN2	SR7C
	 */
	private ArrayList<OLTLFormula> getSR7Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 7;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN2 = new And(oriSR, getORSNPredicate(orIndex, 2));

			and.addAll(getOnceWithLength(oriSRP, 1));
			and.addAll(getOnceWithLength(oriSN2, 1));
			and.addAll(getOnceWithLength(oriSRC, 1));

			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), oriSRP));
			and.addAll(getBDOrder(oriSRP, new And(oriSN2, new Yesterday(new Not(oriSN2)))));
			and.addAll(getBDOrder(new And(oriSN2, new Next(new Not(oriSN2))), oriSRC));
			result.add(new Impl(oriSR, and));
		}

		return result;
	}

	/*SR8P	SN2	SR8C
	 */
	private ArrayList<OLTLFormula> getSR8Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 8;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN2 = new And(oriSR, getORSNPredicate(orIndex, 2));

			and.addAll(getOnceWithLength(oriSRP, 1));
			and.addAll(getOnceWithLength(oriSN2, 1));
			and.addAll(getOnceWithLength(oriSRC, 1));

			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), oriSRP));
			and.addAll(getBDOrder(oriSRP, new And(oriSN2, new Yesterday(new Not(oriSN2)))));
			and.addAll(getBDOrder(new And(oriSN2, new Next(new Not(oriSN2))), oriSRC));
			result.add(new Impl(oriSR, and));
		}

		return result;
	}

	/*SR9P	SN2	SR9C
	 */
	private ArrayList<OLTLFormula> getSR9Axioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		int srIndex = 9;
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			And and = new And();
			Predicate oriSRP = getORSRPPredicate(orIndex, srIndex);
			Predicate oriSR = getORSRPredicate(orIndex, srIndex);
			Predicate oriSRC = getORSRCPredicate(orIndex, srIndex);
			OLTLFormula oriSN1 = new And(oriSR, getORSNPredicate(orIndex, 1));

			and.addAll(getOnceWithLength(oriSRP, 1));
			and.addAll(getOnceWithLength(oriSN1, 1));
			and.addAll(getOnceWithLength(oriSRC, 1));

			and.addAll(getCoincidence(new And(new Not(new Yesterday(oriSR)), oriSR), oriSRP));
			and.addAll(getBDOrder(oriSRP, new And(oriSN1, new Yesterday(new Not(oriSN1)))));
			and.addAll(getBDOrder(new And(oriSN1, new Next(new Not(oriSN1))), oriSRC));
			result.add(new Impl(oriSR, and));
		}

		return result;
	}


//	private ArrayList<OLTLFormula> getNoSRAfterEndTime() {
//		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
//		Or or = new Or();
//		for (int srIndex = 1; srIndex <= numberOfSurgeries; srIndex++)
//			or.add(getSRPredicate(srIndex));
//		result.add(new Impl(shiftEndP, getNestedNexts(new AlwF(new Not(or)), 3)));
//
//		return result;
//	}

	//<paper/>
	private ArrayList<OLTLFormula> getNoConsequentSRsForAnySN5HoursOrMore() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int snIndex = 1; snIndex <= numberOfSurgeons; snIndex++) {
			Predicate sni = getSNPredicate(snIndex);
			result.add(new Not(new And(sni, new Next(new And(sni, new Next(new And(sni, new Next(new And(sni, new Next(sni))))))))));
		}

		return result;
	}

	/*
SR1P	SR1P	SN1	(SN1 SN2)	SN1			SR1C	
SR2P	SR2P	SN2	SN2	SN2					SR2C	
SR3P	SN3	SN3 SN4	(SN3 SN4) SN3	SR3C	SR3C
SR4P	SN4	SN4	SN4					SR4C	SR4C	
SR5P	SN1	SN1	SN1							SR5C		
SR6P	SN3	SN3	SN3							SR6C		
//#AddSurgery
	 */

	private ArrayList<OLTLFormula> getSRRelatedPredicates(int orIndex, int srIndex) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		switch (srIndex) {
		case 1:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 1));
			break;
		case 2:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 1));
			result.add(getORSNPredicate(orIndex, 2));
			break;
		case 3:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 3));
			result.add(getORSNPredicate(orIndex, 4));
			break;
		case 4:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 4));
			break;
		case 5:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 1));
			break;
		case 6:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 3));
			break;
		case 7:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 2));
			break;
		case 8:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 2));
			break;
		case 9:
			result.add(getORSRPPredicate(orIndex, srIndex));
			result.add(getORSRCPredicate(orIndex, srIndex));
			result.add(getORSNPredicate(orIndex, 1));
			break;
			//#AddSurgery
		default:
			break;
		}

		return result;
	}

	/* (<-> softNoOverTimeSN1
	 *		(!! (&& (somp ShiftEnd) (somf sn1)))//ShiftEnd at the time instant labeled 19 means that the shift finishes at 19:00. Presence of ShiftEnd and somp_e(ShiftEnd) means that the shift is already finished.
	 *(soft softNoOverTimeSN1 overTimeSNPenalty)
	 */
	//<paper/>
	private ArrayList<OLTLFormula> getSoftNoOverTimeSN() { //can be optimized, using softAt @13 @14 @15, instead of softAll.
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int snIndex = 1; snIndex <= numberOfSurgeons; snIndex++) {
			Predicate softNoOverTimeSNiP = new Predicate("SoftNoOverTimeSN" + snIndex);
			result.add(new Iff(softNoOverTimeSNiP, new Not(new And(new SomP(shiftEndP), new SomF(getSNPredicate(snIndex))))));
			result.add(new AlwF(new WAP(softNoOverTimeSNiP, noOverTimeSNPenalty[snIndex - 1])));
		}

		return result;
	}

	/* (&& (i allOR)
		 (<-> softNoIdleOri
		 	(&& (j allSR)
		 		(-> oriSRj (|| orianyPostfix)))))
		 (soft softNoIdleOri noIdleORPenalty))
	 */
	private ArrayList<OLTLFormula> getSoftNoIdleOr() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int orIndex = 1; orIndex <= numberOfORs; orIndex++) {
			Predicate softNoIdleOriP = new Predicate("SoftNoIdleOR" + orIndex);
			And and = new And();
			for (int srIndex = 1; srIndex <= numberOfSurgeries; srIndex++)
				and.add(new Impl(getORSRPredicate(orIndex, srIndex), (new Or(getSRRelatedPredicates(orIndex, srIndex)))));
			result.add(new Iff(softNoIdleOriP, and));
			result.add(new AlwF(new WAP(softNoIdleOriP, noIdleORPenalty)));
		}

		return result;
	}

	/*
	 * (&& (i allSN) (<-> softNoWaitingSNi
	 * (!! (&& (!! sni) (yesterday (somp sni)) (next (somf sni)))))
	 * 
	 * (soft softNoWaitingSNi noWaitingSNPenalty))
	 */
	private ArrayList<OLTLFormula> getSoftNoWaitingSN() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int snIndex = 1; snIndex <= numberOfSurgeons; snIndex++) {
			Predicate softNoWaitingSNiP = new Predicate("SoftNoWaitingSN" + snIndex);
			Predicate sni = getSNPredicate(snIndex);
			result.add(new Iff(softNoWaitingSNiP, new Not(new And(new Not(sni), new Yesterday(new SomP(sni)), new Next(new SomF(sni))))));
			result.add(new AlwF(new WAP(softNoWaitingSNiP, noWaitingSNPenalty[snIndex - 1])));
		}

		return result;
	}

	/*
	 * (<-> softSR4PrecedesSR3
	 * 		(alw (-> (&& SR3 SN4) (!! (somf (&& SR4 SN4))))))
	 * 
	 * (soft softSR4PrecedesSR3 sr4PrecedesSR3Penalty))
	 */
//	private ArrayList<OLTLFormula> getSoftSR4PrecedesSR3() {
//		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
//		Predicate softSR4PrecedesSR3 = new Predicate("SoftSR4PrecedesSR3");
//		Predicate sn4 = getSNPredicate(4);
//		Predicate sr3 = getSRPredicate(3);
//		Predicate sr4 = getSRPredicate(4);
//		result.add(new Iff(softSR4PrecedesSR3, new Alw(new Impl(new And(sr3, sn4), new Not(new SomF(new And(sr4, sn4)))))));
//		result.add(new WAP(softSR4PrecedesSR3, SR4PrecedesSR3Penalty));
//
//		return result;
//	}

	public int getBound() {
		return bound;
	}

}