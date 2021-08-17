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
public class ExamGroup {
	private int modelBound;
	private int numberOfHours = 5, numberOfDays = 12, numberOfCourses = 18, groupSize = 6;
	private int timeInstantsPerHour = 1;
	private final float p = 1; //penalty
	private LTLFormula ltlFormula;
	private ArrayList<SoftFormula> softFormulae;
	private Predicate dayStartP = new Predicate("DayStart");
	private Predicate loopP = new Predicate("ProgramEnd");

	public ExamGroup() {
		softFormulae = new ArrayList<SoftFormula>();
		modelBound = numberOfHours * numberOfDays + 5;
		
		ltlFormula = getConfigAxioms();
		System.out.println(getOLTLScript());//TODO del
	}

	public LTLFormula getConfigAxioms() {
		ArrayList<LTLFormula> system = new ArrayList<LTLFormula>();
		ArrayList<LTLFormula> init = new ArrayList<LTLFormula>();
		init.addAll(getWeekendAxioms(new Date(0, 0, 6, 0, 0), new Date(0, 0, 7, 0, 0)));
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
		And result = new And();
		result.add(initAnd);
		result.add(new Alw(systemAnd));
		System.out.println(result);
		return result;
	}
	
	ArrayList<LTLFormula> getWeekendAxioms(Date startDate, Date endDate) {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
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
	
	LTLFormula getDayStartAxioms() {
		Predicate dayStartP = new Predicate("DayStart");
		return new And(dayStartP, new Next(new AlwF(new Iff(dayStartP, getNestedYesterdays(dayStartP, numberOfHours)))));
	}
	
	LTLFormula getLoopAxiom() {
		return getNestedNexts(new And(new Yesterday(new AlwP(new Not(loopP))), new AlwF(loopP)), modelBound - 5);
	}
	
	LTLFormula getNestedNexts(LTLFormula ltlFormula, int time) {
		assert (time >= 0);
		if (time == 0)
			return ltlFormula;
		if (time == 1)
			return new Next(ltlFormula);
		
		return new Next(getNestedNexts(ltlFormula, time - 1));
	}
	
	LTLFormula getNestedYesterdays(LTLFormula ltlFormula, int time) {
		assert (time >= 0);
		if (time == 0)
			return ltlFormula;
		if (time == 1)
			return new Yesterday(ltlFormula);
		
		return new Yesterday(getNestedYesterdays(ltlFormula, time - 1));
	}

	public String getOLTLScript() {
		String script = "Bound:" + modelBound + "\n";
		script += "Formula:\n" + ltlFormula + "\n";
		if (softFormulae.size() > 0) {
			script += "SoftFormulae:\n";
			for (SoftFormula sf : softFormulae) {
				script += sf + "\n";
			}
		}
		
		return script;
	}
	
	public Predicate getCRPredicate(int crIndex) {
		return new Predicate("CR" + crIndex);
	}
	
	/*(defun once (ev)
			(&&
				(som ev)
				(alw (-> ev (alwf_e (!! ev))))))*/
	public ArrayList<LTLFormula> getOnce(LTLFormula f) {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
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
	public ArrayList<LTLFormula> getCourseOnceAndLength(Predicate courseP, int length) {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		if (length == 1)
			return getOnce(courseP);
		result.add(new Som(courseP));
		result.add(new Alw(new Impl(new And(new Not(new Yesterday(courseP)), courseP),
				getCourseOnceAndLengthRec(new And(courseP, new Not(dayStartP)), courseP, length))));
		return result;
	}

	private LTLFormula getCourseOnceAndLengthRec(LTLFormula courseAndNotDayStartP, Predicate courseP, int length) {
		if (length == 2)
			return new Next(new And(courseAndNotDayStartP, new Next(new AlwF(new Not(courseP)))));
		else if (length > 2)
			return new Next(new And(courseAndNotDayStartP, getCourseOnceAndLengthRec(courseAndNotDayStartP, courseP, length - 1)));
		return null;
	}
	
	private ArrayList<LTLFormula> getExclusivity(ArrayList<LTLFormula> formulae) {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
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
	

	private ArrayList<LTLFormula> getExclusivityAxioms() {
		ArrayList<LTLFormula> coursesP = new ArrayList<LTLFormula>();
		for (int crIndex = 1; crIndex <= numberOfCourses; crIndex++)
			coursesP.add(getCRPredicate(crIndex));
		return getExclusivity(coursesP);
	}
	
	private LTLFormula getCoursesWithinProgram() {
		Or coursesOr = new Or();
		for (int crIndex = 1; crIndex <= numberOfCourses; crIndex++)
			coursesOr.add(getCRPredicate(crIndex));
		
		return new Impl(loopP, new Not(coursesOr));
	}

	/*
	 * (onceAndLength (-p- spc1) 4) (onceAndLength (-p- spc2) 3)
	 * (onceAndLength (-p- spc3) 3) (onceAndLength (-p- spc4) 2) (onceAndLength (-p- spc5) 4)
	 * (onceAndLength (-p- spc6) 2) (onceAndLength (-p- spc7) 3) (onceAndLength (-p- spc8) 4)
	 */
	private ArrayList<LTLFormula> getCoursesLengthAxioms() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		result.addAll(getCourseOnceAndLength(getCRPredicate(1), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(2), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(3), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(4), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(5), 1));
//		result.addAll(getCourseOnceAndLength(getCRPredicate(5), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(6), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(7), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(8), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(9), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(10), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(11), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(12), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(13), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(14), 1));
		result.addAll(getCourseOnceAndLength(getCRPredicate(15), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(16), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(17), 2));
		result.addAll(getCourseOnceAndLength(getCRPredicate(18), 2));

		return result;
	}
	
	/*
	 * (<-> (-p- SOFT_No1N1) (alw (!! 
	 * 		(&& (-p- CR1) (next (&& (!! (-p- dayStart)) (-p- CROther))))
	 * )))
	 * ...
	 * (soft (@ (-p- SOFT_No1N1) 0) 3.5* p) //allOrNothing
	 */
	private ArrayList<LTLFormula> getSoftNo1Next() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int table = 0; table <= 2; table++)
			for (int course = table * groupSize + 1; course <= (table + 1) * groupSize; course++) {
				Or orOther = new Or();
				for (int other = table * groupSize + 1; other <= (table + 1) * groupSize; other++)
					if (course != other)
						orOther.add(getCRPredicate(other));
				Predicate courseSP = new Predicate("SOFT_No1N" + course);
				result.add(new Iff(courseSP, new Alw(
						new Not(new And(getCRPredicate(course), new Next(new And(new Not(dayStartP), orOther)))))));
				softFormulae.add(new SoftAt(courseSP, 0, (float) 3.5 * p));

			}

		return result;
	}
	
	/*
	 * (<-> (@ (-p- SOFT_No2N1) (alw (!! 
	 * (&& (-p- CR1) (next (&& (!! (|| (-p- dayStart) (-p- CR1) (-p- CROther))) (next (&& (!! (-p- dayStart) (-p- CROther)))))))
	 * ))))
	 * (soft (@ (-p- SOFT_No2N1) 0) 3 * p) //allOrNothing
	 */
	private ArrayList<LTLFormula> getSoftNo2Next() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int table = 0; table <= 2; table++)
			for (int course = table * groupSize + 1; course <= (table + 1) * groupSize; course++) {
				Or orOther = new Or();
				for (int other = table * groupSize + 1; other <= (table + 1) * groupSize; other++)
					if (course != other)
						orOther.add(getCRPredicate(other));
				Predicate courseSP = new Predicate("SOFT_No2N" + course);
				result.add(new Iff(courseSP,
						new Alw(new Not(new And(getCRPredicate(course),
								new Next(new And(new Not(new Or(dayStartP, getCRPredicate(course), orOther)),
										new Next(new And(new Not(dayStartP), orOther)))))))));
				softFormulae.add(new SoftAt(courseSP, 0, (float) 3 * p));
			}

		return result;

	}
	
	/*// CR1 | nothing | nothing | CR2
	 * (<-> (@ (-p- SOFT_No3N1) (alw (!!
	 * (&& (-p- CR1) 
	 * 		(next (&&
	 * 			(!! (|| (-p- dayStart) (-p- CR1) (-p- CROther)))
	 * 			(next (&& 
	 * 				(!! (|| (-p- dayStart) (-p- CR1) (-p- CROther)))
	 * 				(next (&& (!! (-p- dayStart) (-p- CROther))))))))
	 * 
	 * )))))
	 * (soft (@ (-p- SOFT_No3N1) 0) 2.5 * p) //allOrNothing
	 */
	private ArrayList<LTLFormula> getSoftNo3Next() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int table = 0; table <= 2; table++)
			for (int course = table * groupSize + 1; course <= (table + 1) * groupSize; course++) {
				Or orOther = new Or();
				for (int other = table * groupSize + 1; other <= (table + 1) * groupSize; other++)
					if (course != other)
						orOther.add(getCRPredicate(other));
				Predicate courseSP = new Predicate("SOFT_No3N" + course);
				result.add(new Iff(courseSP,
							new Alw(new Not(
									new And(getCRPredicate(course),
									new Next(new And(
											new Not(new Or(dayStartP, getCRPredicate(course), orOther)), 
											new Next(new And(
													new Not(new Or(dayStartP, getCRPredicate(course), orOther)),
													new Next(new And(new Not(dayStartP), orOther)))))))))));
					softFormulae.add(new SoftAt(courseSP, 0, (float) 2.5 * p));
				}
		
		return result;
	}
	
	/*// CR1 | nothing | nothing | nothing | CROther
	 * (<-> (@ (-p- SOFT_No4N1) (alw (!! 
	 * (&& (-p- CR1) 
	 * 		(next (&&
	 * 			(!! (|| (-p- dayStart) (-p- CR1) (-p- CROther)))
	 * 			(next (&& 
	 * 				(!! (|| (-p- dayStart) (-p- CR1) (-p- CROther)))
	 * 				(next (&& 
	 *		 			(!! (|| (-p- dayStart) (-p- CR1) (-p- CROther)))
	 * 					(next (&& (!! (-p- dayStart) (-p- CROther))))))))))
	 * 
	 * )))))
	 * (soft (@ (-p- SOFT_No4N1) 0) 2 * p) //allOrNothing
	 */
	private ArrayList<LTLFormula> getSoftNo4Next() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int table = 0; table <= 2; table++)
			for (int course = table * groupSize + 1; course <= (table + 1) * groupSize; course++) {
				Or orOther = new Or();
				for (int other = table * groupSize + 1; other <= (table + 1) * groupSize; other++)
					if (course != other)
						orOther.add(getCRPredicate(other));
				Predicate courseSP = new Predicate("SOFT_No4N" + course);
				result.add(new Iff(courseSP,
						new Alw(new Not(new And(getCRPredicate(course),
								new Next(new And(
										new Not(new Or(dayStartP, getCRPredicate(course), orOther)), 
										new Next(new And(
												new Not(new Or(dayStartP, getCRPredicate(course), orOther)),
												new Next(new And(
													new Not(new Or(dayStartP, getCRPredicate(course), orOther)),
													new Next(new And(new Not(dayStartP), orOther)))))))))))));
					softFormulae.add(new SoftAt(courseSP, 0, (float) 2 * p));
				}
		
		return result;
	}
	
/*(<-> (@ (-p- SOFT_No1NDay1) (alw (!! 
(&& (-p- cr1)
	(next 
		(||
			(until (!! (|| (-p- CROther) (-p- datStart))) 
				(&& 
					(-p- dayStart) (!! (-p- CROther)) 
					(next (until (!! (-p- dayStart)) (&& (!! (-p- dayStart)) (-p- CROther))))))
			(until (!! (-p- dayStart)) (&& (-p- dayStart) (-p- CROther))))))
))))*/
	private ArrayList<LTLFormula> getSoftNo1NextDay() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int table = 0; table <= 2; table++)
			for (int course = table * groupSize + 1; course <= (table + 1) * groupSize; course++) {
				Or orOther = new Or();
				for (int other = table * groupSize + 1; other <= (table + 1) * groupSize; other++)
					if (course != other)
						orOther.add(getCRPredicate(other));
				Predicate courseSP = new Predicate("SOFT_No1NDay" + course);
				result.add(new Iff(courseSP,
						new Alw(new Not (new And(getCRPredicate(course), new Next(
								new Or(
									new Until(new Not(new Or(orOther, dayStartP)), 
											new And(
												dayStartP, new Not(orOther),
												new Next(new Until(new Not(dayStartP), new And(new Not(dayStartP), orOther))))),
									new Until (new Not(dayStartP), new And(dayStartP, orOther)))))))));
					softFormulae.add(new SoftAt(courseSP, 0, (float) p));
				}
		
		return result;
	}
}