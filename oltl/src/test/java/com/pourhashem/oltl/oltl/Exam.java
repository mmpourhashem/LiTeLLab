/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.pourhashem.oltl.oltl.*;

@SuppressWarnings("deprecation")
public class Exam {
	private int bound;
	private int numberOfHours = 5, numberOfDays = 5, numberOfCourses = 16/*12 for 3 years BS, 16 for 4 years BS*/, groupSize = 4, numberOfGroups = 4;//3 for 3 years BS
	private final float n1N = (float) 4.5, n2N = (float) 4, n3N = (float) 3.5, n4N = (float) 3,  n1ND = 1;
	private int timeInstantsPerHour = 1;
	private int [][] ccPenalty; //Course Collision Penalty
	private OLTLFormula ltlFormula;
	private Predicate dayStartP = new Predicate("DayStart");
	private Predicate loopP = new Predicate("ProgramEnd");
	private And wapsAt0 = new And();

	public Exam(int year) {
		if (year == 3) {
			this.numberOfCourses = 12;
			this.numberOfGroups = 3;
		}
		if (year == 4) {
			this.numberOfCourses = 16;
			this.numberOfGroups = 4;
		}
			
		bound = numberOfHours * numberOfDays + 5;
		ccPenalty = new int[19][19];
		ccPenalty[1][2] = ccPenalty[2][1] = 30;
		ccPenalty[1][3] = ccPenalty[3][1] = 25;
		ccPenalty[1][4] = ccPenalty[4][1] = 20;
		ccPenalty[2][3] = ccPenalty[3][2] = 24;
//		ccPenalty[2][4] = ccPenalty[4][2] = 18;
		ccPenalty[2][4] = ccPenalty[4][2] = 5;
		ccPenalty[3][4] = ccPenalty[4][3] = 21;
		
		ccPenalty[5][6] = ccPenalty[6][5] = 10;
		ccPenalty[5][7] = ccPenalty[7][5] = 14;
		ccPenalty[5][8] = ccPenalty[8][5] = 19;
		ccPenalty[6][7] = ccPenalty[7][6] = 10;
		ccPenalty[6][8] = ccPenalty[8][6] = 15;
		ccPenalty[7][8] = ccPenalty[8][7] = 17;
		
		ccPenalty[9][10] = ccPenalty[10][9] = 25;
		ccPenalty[9][11] = ccPenalty[11][9] = 20;
		ccPenalty[9][12] = ccPenalty[12][9] = 15;
		ccPenalty[10][11] = ccPenalty[11][10] = 19;
		ccPenalty[10][12] = ccPenalty[12][10] = 14;
		ccPenalty[11][12] = ccPenalty[12][11] = 15;
		
//		for 4 years BS
		ccPenalty[13][14] = ccPenalty[14][13] = 10;
		ccPenalty[13][15] = ccPenalty[15][13] = 14;
		ccPenalty[13][16] = ccPenalty[16][13] = 19;
		ccPenalty[14][15] = ccPenalty[15][14] = 11;
		ccPenalty[14][16] = ccPenalty[16][14] = 15;
		ccPenalty[15][16] = ccPenalty[16][15] = 17;
		
		ltlFormula = getConfigAxioms();
	}

	/*
	 * (onceAndLength (-p- spc1) 4) (onceAndLength (-p- spc2) 3)
	 * (onceAndLength (-p- spc3) 3) (onceAndLength (-p- spc4) 2) (onceAndLength (-p- spc5) 4)
	 * (onceAndLength (-p- spc6) 2) (onceAndLength (-p- spc7) 3) (onceAndLength (-p- spc8) 4)
	 */
	private ArrayList<OLTLFormula> getCoursesLengthAxioms() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		result.addAll(getCourseOnceAndLength(getCRPredicate(1), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(2), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(3), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(4), 1));

		result.addAll(getCourseOnceAndLength(getCRPredicate(5), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(6), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(7), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(8), 1));
		
		result.addAll(getCourseOnceAndLength(getCRPredicate(9), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(10), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(11), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(12), 1));
		
//		for 4 years BS
		result.addAll(getCourseOnceAndLength(getCRPredicate(13), 3));
		result.addAll(getCourseOnceAndLength(getCRPredicate(14), 3));
		result.addAll(getCourseOnceAndLength(getCRPredicate(15), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(16), 1));

		return result;
	}
	
	public OLTLFormula getConfigAxioms() {
		ArrayList<OLTLFormula> system = new ArrayList<OLTLFormula>();
		ArrayList<OLTLFormula> init = new ArrayList<OLTLFormula>();
		init.add(getDayStartAxioms());
		init.add(getLoopAxiom());
		
		system.add(getCoursesWithinProgram());		
		system.addAll(getCoursesLengthAxioms());
		system.addAll(getExclusivityAxioms());
		system.addAll(getSoftNo1Next());
		system.addAll(getSoftNo2Next());
		system.addAll(getSoftNo3Next());
		system.addAll(getSoftNo4Next());
		system.addAll(getSoftNo1NextDay());
		And systemAnd = new And();
		systemAnd.addAll(system);
		And initAnd = new And();
		initAnd.addAll(init);
		initAnd.add(wapsAt0);
		And result = new And();
		result.add(initAnd);
		result.add(new Alw(systemAnd));
//		System.out.println(result);
		return result;
	}
	
	ArrayList<OLTLFormula> getWeekendAxioms(Date startDate, Date endDate) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		Or coursesOr = new Or();
		for (int crIndex = 1; crIndex <= numberOfCourses; crIndex++)
			coursesOr.add(getCRPredicate(crIndex));
		Not nothing = new Not(coursesOr);
		int startTime = numberOfHours * (startDate.getDate() - 1);
		int endTime = numberOfHours * endDate.getDate() - 1;
		for (int time = startTime; time <= endTime; time++)
			result.add(getNestedNexts(nothing, time));
		return result;
	}
	
	OLTLFormula getDayStartAxioms() {
		Predicate dayStartP = new Predicate("DayStart");
		return new And(dayStartP, new Next(new AlwF(new Iff(dayStartP, getNestedYesterdays(dayStartP, numberOfHours)))));
	}
	
	OLTLFormula getLoopAxiom() {
		return getNestedNexts(new And(new Yesterday(new AlwP(new Not(loopP))), new AlwF(loopP)), bound - 5);
	}
	
	OLTLFormula getNestedNexts(OLTLFormula ltlFormula, int time) {
		assert (time >= 0);
		if (time == 0)
			return ltlFormula;
		if (time == 1)
			return new Next(ltlFormula);
		
		return new Next(getNestedNexts(ltlFormula, time - 1));
	}
	
	OLTLFormula getNestedYesterdays(OLTLFormula ltlFormula, int time) {
		assert (time >= 0);
		if (time == 0)
			return ltlFormula;
		if (time == 1)
			return new Yesterday(ltlFormula);
		
		return new Yesterday(getNestedYesterdays(ltlFormula, time - 1));
	}

	public String getOLTLScript() {
		return ltlFormula.toString();
	}
	
	public Predicate getCRPredicate(int crIndex) {
		return new Predicate("CR" + crIndex);
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
	public ArrayList<OLTLFormula> getCourseOnceAndLength(Predicate courseP, int length) {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		if (length == 1)
			return getOnce(courseP);
		result.add(new Som(courseP));
		result.add(new Alw(new Impl(new And(new Not(new Yesterday(courseP)), courseP),
				getCourseOnceAndLengthRec(new And(courseP, new Not(dayStartP)), courseP, length))));
		return result;
	}

	private OLTLFormula getCourseOnceAndLengthRec(OLTLFormula courseAndNotDayStartP, Predicate courseP, int length) {
		if (length == 2)
			return new Next(new And(courseAndNotDayStartP, new Next(new AlwF(new Not(courseP)))));
		else if (length > 2)
			return new Next(new And(courseAndNotDayStartP, getCourseOnceAndLengthRec(courseAndNotDayStartP, courseP, length - 1)));
		return null;
	}
	
	private ArrayList<OLTLFormula> getExclusivity(ArrayList<OLTLFormula> formulae) {
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
	

	private ArrayList<OLTLFormula> getExclusivityAxioms() {
		ArrayList<OLTLFormula> coursesP = new ArrayList<OLTLFormula>();
		for (int crIndex = 1; crIndex <= numberOfCourses; crIndex++)
			coursesP.add(getCRPredicate(crIndex));
		return getExclusivity(coursesP);
	}
	
	private OLTLFormula getCoursesWithinProgram() {
		Or coursesOr = new Or();
		for (int crIndex = 1; crIndex <= numberOfCourses; crIndex++)
			coursesOr.add(getCRPredicate(crIndex));
		
		return new Impl(loopP, new Not(coursesOr));
	}

	/*
	 * (<-> (-p- SOFT_No1N1_2) (alw (!! (||
	 * 		(&& (-p- CR1) (next (&& (!! (-p- dayStart)) (-p- CR2))))
	 * 		(&& (-p- CR2) (next (&& (!! (-p- dayStart)) (-p- CR1))))
	 * ))))
	 * ...
	 * (soft (@ (-p- SOFT_No1N1_2) 0) 3.5* ccPenalty[1][2]) //allOrNothing
	 */
	private ArrayList<OLTLFormula> getSoftNo1Next() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int table = 0; table < numberOfGroups; table++)
			for (int first = table * groupSize + 1; first <= (table + 1) * groupSize; first++)
				for (int second = first + 1; second <= (table + 1) * groupSize; second++) {
					Predicate firstSecondP = new Predicate("SOFT_No1N" + first + "_" + second);
					result.add(new Iff(firstSecondP, new Alw(new Not(new Or(
							new And(getCRPredicate(first), new Next(new And(new Not(dayStartP), getCRPredicate(second)))),
							new And(getCRPredicate(second), new Next(new And(new Not(dayStartP), getCRPredicate(first)))))))));
//					softFormulae.add(new SoftAt(firstSecondP, 0, n1N * ccPenalty[first][second]));
					wapsAt0.add(new WAP(firstSecondP, n1N * ccPenalty[first][second]));
				}
		
		return result;
	}
	
	/*
	 * (<-> (@ (-p- SOFT_No2Next1_2) (alw (!! (||
	 * (&& (-p- CR1) (next (&& (!! (|| (-p- dayStart) (-p- CR1) (-p- CR2))) (next (&& (!! (-p- dayStart)) (-p- CR2))))))
	 * (&& (-p- CR2) (next (&& (!! (|| (-p- dayStart) (-p- CR2) (-p- CR1))) (next (&& (!! (-p- dayStart)) (-p- CR1))))))
	 * )))))
	 * (soft (@ (-p- SOFT_No2Next1_2) 0) 3 * ccPenalty[1][2]) //allOrNothing
	 */
	private ArrayList<OLTLFormula> getSoftNo2Next() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int table = 0; table < numberOfGroups; table++)
			for (int first = table * groupSize + 1; first <= (table + 1) * groupSize; first++)
				for (int second = first + 1; second <= (table + 1) * groupSize; second++) {
					Predicate firstSecondP = new Predicate("SOFT_No2N" + first + "_" + second);
					result.add(new Iff(firstSecondP, new Alw(new Not(new Or(
							new And(getCRPredicate(first),new Next(new And(new Not(new Or(dayStartP, getCRPredicate(first), getCRPredicate(second))),
									new Next(new And(new Not(dayStartP), getCRPredicate(second)))))),
							new And(getCRPredicate(second),new Next(new And(new Not(new Or(dayStartP, getCRPredicate(second), getCRPredicate(first))),
									new Next(new And(new Not(dayStartP), getCRPredicate(first)))))))))));
//					softFormulae.add(new SoftAt(firstSecondP, 0, n2N * ccPenalty[first][second]));
					wapsAt0.add(new WAP(firstSecondP, n2N * ccPenalty[first][second]));
				}
		
		return result;
	}
	
	/*// CR1 | nothing | nothing | CR2
	 * (<-> (@ (-p- SOFT_No3Next1_2) (alw (!! (||
	 * (&& (-p- CR1) 
	 * 		(next (&&
	 * 			(!! (|| (-p- dayStart) (-p- CR1) (-p- CR2)))
	 * 			(next (&& 
	 * 				(!! (|| (-p- dayStart) (-p- CR1) (-p- CR2)))
	 * 				(next (&& (!! (-p- dayStart) (-p- CR2))))))))
	 * ...rev
	 * )))))
	 * (soft (@ (-p- SOFT_No3Next1_2) 0) 2.5 *ccPenalty[1][2]) //allOrNothing
	 */
	private ArrayList<OLTLFormula> getSoftNo3Next() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int table = 0; table < numberOfGroups; table++)
			for (int first = table * groupSize + 1; first <= (table + 1) * groupSize; first++)
				for (int second = first + 1; second <= (table + 1) * groupSize; second++) {
					Predicate firstSecondP = new Predicate("SOFT_No3N" + first + "_" + second);
					result.add(new Iff(firstSecondP,
							new Alw(new Not(new Or(
									new And(getCRPredicate(first),
									new Next(new And(
											new Not(new Or(dayStartP, getCRPredicate(first), getCRPredicate(second))), 
											new Next(new And(
													new Not(new Or(dayStartP, getCRPredicate(first), getCRPredicate(second))),
													new Next(new And(new Not(dayStartP), getCRPredicate(second)))))))),
									new And(getCRPredicate(second),
											new Next(new And(
													new Not(new Or(dayStartP, getCRPredicate(second), getCRPredicate(first))), 
													new Next(new And(
															new Not(new Or(dayStartP, getCRPredicate(second), getCRPredicate(first))),
															new Next(new And(new Not(dayStartP), getCRPredicate(first)))))))))
									))));
//					softFormulae.add(new SoftAt(firstSecondP, 0, n3N * ccPenalty[first][second]));
					wapsAt0.add(new WAP(firstSecondP, n3N * ccPenalty[first][second]));
				}
		
		return result;
	}
	
	/*// CR1 | nothing | nothing | nothing | CR2
	 * (<-> (@ (-p- SOFT_No4Next1_2) (alw (!! (|| 
	 * (&& (-p- CR1) 
	 * 		(next (&&
	 * 			(!! (|| (-p- dayStart) (-p- CR1) (-p- CR2)))
	 * 			(next (&& 
	 * 				(!! (|| (-p- dayStart) (-p- CR1) (-p- CR2)))
	 * 				(next (&& 
	 *		 			(!! (|| (-p- dayStart) (-p- CR1) (-p- CR2)))
	 * 					(next (&& (!! (-p- dayStart) (-p- CR2))))))))))
	 * ...rev
	 * )))))
	 * (soft (@ (-p- SOFT_No4Next1_2) 0) 2 * ccPenalty[1][2]) //allOrNothing
	 */
	private ArrayList<OLTLFormula> getSoftNo4Next() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int table = 0; table < numberOfGroups; table++)
			for (int first = table * groupSize + 1; first <= (table + 1) * groupSize; first++)
				for (int second = first + 1; second <= (table + 1) * groupSize; second++) {
					Predicate firstSecondP = new Predicate("SOFT_No4N" + first + "_" + second);
					result.add(new Iff(firstSecondP,
							new Alw(new Not(new Or(new And(getCRPredicate(first),
									new Next(new And(
											new Not(new Or(dayStartP, getCRPredicate(first), getCRPredicate(second))), 
											new Next(new And(
													new Not(new Or(dayStartP, getCRPredicate(first), getCRPredicate(second))),
													new Next(new And(
														new Not(new Or(dayStartP, getCRPredicate(first), getCRPredicate(second))),
														new Next(new And(new Not(dayStartP), getCRPredicate(second)))))))))), 
									new And(getCRPredicate(second),
											new Next(new And(
													new Not(new Or(dayStartP, getCRPredicate(second), getCRPredicate(first))), 
													new Next(new And(
															new Not(new Or(dayStartP, getCRPredicate(second), getCRPredicate(first))),
															new Next(new And(
																new Not(new Or(dayStartP, getCRPredicate(second), getCRPredicate(first))),
																new Next(new And(new Not(dayStartP), getCRPredicate(first)))))))))))))));
//					softFormulae.add(new SoftAt(firstSecondP, 0, n4N * ccPenalty[first][second]));
					wapsAt0.add(new WAP(firstSecondP, n4N * ccPenalty[first][second]));
				}
		
		return result;
	}
	
/*(<-> (@ (-p- SOFT_No1NDay1_2) (alw (!! (|| 
(&& (-p- cr1)
	(next 
		(||
			(until (!! (|| (-p- cr2) (-p- dayStart))) 
				(&& 
					(-p- dayStart) (!! (-p- cr2)) 
					(next (until (!! (-p- dayStart)) (&& (!! (-p- dayStart)) (-p- cr2))))))
			(until (!! (-p- dayStart)) (&& (-p- dayStart) (-p- cr2))))))
(&& (-p- cr2)
	(next 
		(||
			(until (!! (|| (-p- cr1) (-p- dayStart)))
				(&& 
					(-p- dayStart) (!! (-p- cr1)) 
					(next (until (!! (-p- dayStart)) (&& (!! (-p- dayStart)) (-p- cr1))))))
			(until (!! (-p- dayStart)) (&& (-p- dayStart) (-p- cr1)))))))))))*/
	private ArrayList<OLTLFormula> getSoftNo1NextDay() {
		ArrayList<OLTLFormula> result = new ArrayList<OLTLFormula>();
		for (int table = 0; table < numberOfGroups; table++)
			for (int first = table * groupSize + 1; first <= (table + 1) * groupSize; first++)
				for (int second = first + 1; second <= (table + 1) * groupSize; second++) {
					Predicate firstSecondP = new Predicate("SOFT_No1NDay" + first + "_" + second);
					result.add(new Iff(firstSecondP,
							new Alw(new Not (new Or(
									new And(getCRPredicate(first), new Next(
									new Or(new Until(new Not(new Or(getCRPredicate(second), dayStartP)), 
												new And(
													dayStartP, new Not(getCRPredicate(second)),
													new Next(new Until(new Not(dayStartP), new And(new Not(dayStartP), getCRPredicate(second)))))),
										new Until(new Not(dayStartP), new And(dayStartP, getCRPredicate(second)))))),
									(new And(getCRPredicate(second), new Next(
												new Or(
														new Until(new Not(new Or(getCRPredicate(first), dayStartP)), 
																new And(
																	dayStartP, new Not(getCRPredicate(first)),
																	new Next(new Until(new Not(dayStartP), new And(new Not(dayStartP), getCRPredicate(first)))))),
														new Until (new Not(dayStartP), new And(dayStartP, getCRPredicate(first))))))))))));
//					softFormulae.add(new SoftAst(firstSecondP, 0, n1ND * ccPenalty[first][second]));
					wapsAt0.add(new WAP(firstSecondP, n1ND * ccPenalty[first][second]));
				}
		
		return result;
	}

	public int getBound() {
		return bound;
	}
	
}