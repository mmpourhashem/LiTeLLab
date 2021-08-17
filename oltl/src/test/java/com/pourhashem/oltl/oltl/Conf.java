package com.pourhashem.oltl.oltl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.pourhashem.oltl.oltl.*;
import com.pourhashem.oltl.oltl.LTLFormula;
import com.pourhashem.oltl.oltl.SoftFormula;

@SuppressWarnings("deprecation")
public class Conf {
	private int bound;
	private int numberOfHalls, numberOfSpeakers, numberOfSpeeches, numberOfAttendees;
	private Date startTime = new Date(0, 0, 0, 8, 0);
	private Date endTime = new Date(0, 0, 0, 17, 0);
	private int timeInstantsPerHour = 2;
	private LTLFormula ltlFormula;
	private ArrayList<SoftFormula> softFormulae;

	public Conf() {
		softFormulae = new ArrayList<SoftFormula>();
		this.bound = getCeilTimeInstant(endTime) - getTimeInstant(startTime);
//		numberOfHalls = 3;
//		numberOfSpeakers = 8;
//		numberOfSpeeches = 10;
//		numberOfAttendees = 10;
		numberOfHalls = 3;
		numberOfSpeakers = 5;
		numberOfSpeeches = 8;
		numberOfAttendees = 8;
		ltlFormula = getConfigAxioms();
		System.out.println(getOLTLScript());//TODO del
	}

	public LTLFormula getConfigAxioms() {
		ArrayList<LTLFormula> system = new ArrayList<LTLFormula>();
		ArrayList<LTLFormula> init = new ArrayList<LTLFormula>();
		init.addAll(getBreakAxioms(new Date(0, 0, 0, 12, 0), new Date(0, 0, 0, 13, 30)));
		system.addAll(getSpeakersSpeechAxioms());
		system.addAll(getSpeechesLengthsAxioms());
		system.addAll(getSpeechInSingleHall());
		system.addAll(getAtLeastOneATAndAtLeastOnceSC());
		system.addAll(getHalls_Speeches());
		system.addAll(getAttendeeNotPartiallyAttendSpeech());
		system.addAll(getAttendeesDefinition());
		system.addAll(getSpeakersDefinition());
		system.addAll(getAttendees_Halls());
		system.addAll(getExclusivityAxioms());
/* Attendees: at1((1,4), (2,4) (3,2), (4,2)), at2((1,6), (2,6)), at3((3,12)), at4((4,12)), 
 * at5((5, 6), (6,6)), at6((6,6),(7,6)), at7((7,12)), at8((1,2), (2,2), (3,2), (4,2), (5,2), (6,2)), at9, at10
*/
		system.add(getATDoesNotMissSC(1, 1, 6));
		system.add(getATDoesNotMissSC(1, 2, 6));
//		system.add(getATDoesNotMissSC(1, 3, 2));
//		system.add(getATDoesNotMissSC(1, 4, 2));
		system.add(getATDoesNotMissSC(2, 1, 5));
		system.add(getATDoesNotMissSC(2, 2, 5));
		system.add(getATDoesNotMissSC(2, 3, 1));
		system.add(getATDoesNotMissSC(2, 4, 1));
		system.add(getATDoesNotMissSC(3, 1, 2));
		system.add(getATDoesNotMissSC(3, 2, 2));
		system.add(getATDoesNotMissSC(3, 3, 4));
		system.add(getATDoesNotMissSC(3, 4, 4));
		system.add(getATDoesNotMissSC(4, 3, 6));
		system.add(getATDoesNotMissSC(4, 4, 6));
		
		system.add(getATDoesNotMissSC(5, 5, 12));

		system.add(getATDoesNotMissSC(6, 6, 10));
		system.add(getATDoesNotMissSC(6, 7, 2));
		
		system.add(getATDoesNotMissSC(7, 7, 10));
		system.add(getATDoesNotMissSC(7, 8, 2));

		system.add(getATDoesNotMissSC(8, 5, 3));
		system.add(getATDoesNotMissSC(8, 6, 3));
		system.add(getATDoesNotMissSC(8, 7, 3));
		system.add(getATDoesNotMissSC(8, 8, 3));
		system.addAll(getNoSpeechIn(new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
		system.addAll(getNoSpeechIn(new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
//		system.add(getATDoesNotLikeTI(1, new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
//		system.add(getATDoesNotLikeTI(1, new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
//		system.add(getATDoesNotLikeTI(2, new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
//		system.add(getATDoesNotLikeTI(2, new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
//		system.add(getATDoesNotLikeTI(3, new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
//		system.add(getATDoesNotLikeTI(3, new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
//		system.add(getATDoesNotLikeTI(4, new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
//		system.add(getATDoesNotLikeTI(4, new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
//		system.add(getATDoesNotLikeTI(5, new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
//		system.add(getATDoesNotLikeTI(5, new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
//		system.add(getATDoesNotLikeTI(6, new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
//		system.add(getATDoesNotLikeTI(6, new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
//		system.add(getATDoesNotLikeTI(7, new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
//		system.add(getATDoesNotLikeTI(7, new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
//		system.add(getATDoesNotLikeTI(8, new Date(0,0,0,8,0), new Date(0,0,0,9,0), 1));
//		system.add(getATDoesNotLikeTI(8, new Date(0,0,0,15,0), new Date(0,0,0,17,0), 1));
		And systemAnd = new And();
		systemAnd.addAll(system);
		And initAnd = new And();
		initAnd.addAll(init);
		And result = new And();
		result.add(initAnd);
		result.add(new Alw(systemAnd));
		
		return result;
	}
	
	public String getOLTLScript() {
		String script = "Bound:" + bound + "\n";
		script += "Formula:\n" + ltlFormula + "\n";
		script += "SoftFormulae:\n";
		for (SoftFormula sf : softFormulae) {
			script += sf + "\n";
		}
		
		return script;
	}
	
	public Predicate getHLPredicate(int hlIndex) {
		return new Predicate("HL" + hlIndex);
	}
	
	public Predicate getSCPredicate(int scIndex) {
		return new Predicate("SC" + scIndex);
	}

	public Predicate getSKPredicate(int skIndex) {
		return new Predicate("SK" + skIndex);
	}

	public Predicate getATPredicate(int atIndex) {
		return new Predicate("AT" + atIndex);
	}

	public Predicate getHLSKPredicate(int hlIndex, int skIndex) {
		return new Predicate("HL" + hlIndex + "SK" + skIndex);
	}

	public Predicate getHLSCPredicate(int hlIndex, int scIndex) {
		return new Predicate("HL" + hlIndex + "SC" + scIndex);
	}

	public Predicate getHLATPredicate(int hlIndex, int atIndex) {
		return new Predicate("HL" + hlIndex + "AT" + atIndex);
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
	public ArrayList<LTLFormula> getOnceAndLength(LTLFormula f, int length) {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		if (length == 1)
			return getOnce(f);
		result.add(new Som(f));
		result.add(new Alw(new Impl(new And(new Not(new Yesterday(f)), f), getOnceAndLengthRec(f, length))));
		return result;
	}
	private LTLFormula getOnceAndLengthRec(LTLFormula f, int length) {
		if (length == 2)
			return new Next(new And(f, new Next(new AlwF(new Not(f)))));
		else if (length > 2)
			return new Next(new And(f, getOnceAndLengthRec(f, length - 1)));
		return null;
	}
	
	/*If a speech is 3 TIs, it cannot happen in h1h2h1, it should happen in h1h1h1, h2h2h2, or h3h3h3.
	 * (&&
		(-> h1spc (next (!! (|| h2spc h3spc))))
		(-> h2spc (next (!! (|| h1spc h3spc))))
		(-> h3spc (next (!! (|| h2spc h1spc)))))
	 */
	public ArrayList<LTLFormula> getSpeechInSingleHall() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++)
			for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
				Or orOtherHLs = new Or();
				for (int otherHalls = 1; otherHalls <= numberOfHalls; otherHalls++)
					if (otherHalls != hlIndex)
						orOtherHLs.add(getHLSCPredicate(otherHalls, scIndex));
				result.add(new Impl(getHLSCPredicate(hlIndex, scIndex), new Next(new Not(orOtherHLs))));
			}
		
		return result;
	}
	
	/*
	 * (&&
		(-> (&& h1p h1spc) (alw (-> h1spc h1p)))
		(-> (&& h2p h2spc) (alw (-> h2spc h2p)))
		(-> (&& h3p h3spc) (alw (-> h3spc h3p)))
		)
	 */
	public ArrayList<LTLFormula> getAttendeeNotPartiallyAttendSpeech() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int atIndex = 1; atIndex <= numberOfAttendees; atIndex++)
			for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++)
				for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++)
					result.add(new Impl(
							new And(getHLATPredicate(hlIndex, atIndex), getHLSCPredicate(hlIndex, scIndex)),
							new Alw(new Impl(getHLSCPredicate(hlIndex, scIndex), getHLATPredicate(hlIndex, atIndex)))));
	
		return result;
	}
	
	ArrayList<LTLFormula> getExclusivity(ArrayList<LTLFormula> formulae) {
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
	
	/*	(&&
			(<-> p1 (|| h1p1 h2p1 h3p1))
			(exclusive3 h1p1 h2p1 h3p1))
	 */
	public ArrayList<LTLFormula> getAttendees_Halls() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int atIndex = 1; atIndex <= numberOfAttendees; atIndex++) {
			Or hallsAttendeeOr = new Or();
			for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
				hallsAttendeeOr.add(getHLATPredicate(hlIndex, atIndex));
			}
			result.add(new Iff(getATPredicate(atIndex), hallsAttendeeOr));
			result.addAll(getExclusivity(hallsAttendeeOr.getFormulae()));
		}
		return result;
	}
	
	/*
	 * (<-> (-p- spc1) (|| (-p- h1spc1) (-p- h2spc1) (-p- h3spc1)))
	 * ...
	 */
	public ArrayList<LTLFormula> getHalls_Speeches() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++) {
			Or hallsSpeecheOr = new Or();
			for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
				hallsSpeecheOr.add(getHLSCPredicate(hlIndex, scIndex));
			}
			result.add(new Iff(getSCPredicate(scIndex), hallsSpeecheOr));
		}
		return result;
		
	}
	
	/* (defun noTalkOn (i)
		(futr (!! (|| (-p- spc1) (-p- spc2) (-p- spc3) (-p- spc4) (-p- spc5) (-p- spc6) (-p- spc7) (-p- spc8))) i))
	 */
	public LTLFormula getNoSpeechAtTI(int timeInstant) {
		assert(timeInstant >= 0);
		if (timeInstant == 0) {
			Or speechesOr = new Or();
			for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++)
				speechesOr.add(getSCPredicate(scIndex));
			return new Not(speechesOr);
		}
		else
			return new Next(getNoSpeechAtTI(timeInstant - 1));
	}
	
	public ArrayList<LTLFormula> getBreakAxioms(Date startTme, Date endTime) {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int timeInstant = getTimeInstant(startTme); timeInstant < getTimeInstant(endTime); timeInstant++)
			result.add(getNoSpeechAtTI(timeInstant));
		return result;
	}
	
	@SuppressWarnings("deprecation")
	public int getTimeInstant(Date time) {
		return (int) (getDateDiff(startTime, time, TimeUnit.MINUTES) / (60.0 / timeInstantsPerHour));
	}
	
	@SuppressWarnings("deprecation")
	public int getCeilTimeInstant(Date time) {
		return (int) Math.ceil(getDateDiff(startTime, time, TimeUnit.MINUTES) / (60.0 / timeInstantsPerHour));
	}
	
	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTime() - date1.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}

	/*
	 * ANDhl((-> hlSC1 hlat1)
	 */
	LTLFormula getATDoesNotMissSC(int atIndex, int scIndex, double weight) {
		float fWeight = (float) weight;
		LTLFormula result;
		And and = new And();
		for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
			and.add(new Impl(getHLSCPredicate(hlIndex, scIndex), getHLATPredicate(hlIndex, atIndex)));
		}
		Predicate atScAP = new Predicate("soft_AT" + atIndex + "SC" + scIndex);
		result = new Iff(atScAP, and);
		softFormulae.add(new SoftAll(atScAP, fWeight));
		return result;
	}
	
	/*
	 * ; (AS (@ (!! (-p- p1)) 0) 1); p1 doesn't like 0800-0830
		(assert-soft (= ((_ extract 0 0) p1) #b0) :id personTimeSlot :weight 1)
	 */
	LTLFormula getATDoesNotLikeTI(int atIndex, Date startTime, Date endTime, double weight) {
		float fWeight = (float) weight;
		Predicate atAP = new Predicate("soft_notAT" + atIndex + "time");
		for (int time = getTimeInstant(startTime); time < getCeilTimeInstant(endTime); time++)
			softFormulae.add(new SoftAt(atAP, time, fWeight));

		return new Iff(atAP, new Not(getATPredicate(atIndex)));
	}
	
//	/*ALL OR NOTHING, which is not very precise.
//	 *  (<-> (-p- Soft_NoSpeech) (!! (|| (-p- sc1) (-p- sc2) ...)))
//	 * ; (AS (@ (-p- Soft_NoSpeech) 0) 8);
//	 */
//	LTLFormula getNoSpeechIn(Date startTime, Date endTime, double weight) {
//		float fWeight = (float) weight;
//		Predicate softNoSpeechAP = new Predicate("soft_NoSpeech");
//		for (int time = getTimeInstant(startTime); time < getCeilTimeInstant(endTime); time++)
//			softFormulae.add(new SoftAt(softNoSpeechAP, time, fWeight));
//		Or scOr = new Or();
//		for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++)
//			scOr.addFormula(getSCPredicate(scIndex));
//		
//		return new Iff(softNoSpeechAP, new Not(scOr));
//	}
	
	/*
	 *  (<-> (-p- Soft_NoSC1) (!! (-p- sc1)))
	 *  (<-> (-p- Soft_NoSC2) (!! (-p- sc2)))
	 *  ...
	 * ; (AS (@ (-p- Soft_NoSC1) 0) 8); doesn't like 0800-0830
	 * ; (AS (@ (-p- Soft_NoSC2) 0) 8); doesn't like 0800-0830
	 */
	ArrayList<LTLFormula> getNoSpeechIn(Date startTime, Date endTime, double weight) {
		float fWeight = (float) weight;
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++) {
			Predicate softNoSCAP = new Predicate("soft_NoSC" + scIndex);
			for (int time = getTimeInstant(startTime); time < getCeilTimeInstant(endTime); time++)
				softFormulae.add(new SoftAt(softNoSCAP, time, fWeight));

			result.add(new Iff(softNoSCAP, new Not(getSCPredicate(scIndex))));
		}
		
		return result;
	}
	
	ArrayList<SoftFormula> getSoftFormulae() {
		return softFormulae;
	}

	private ArrayList<LTLFormula> getExclusivityAxioms() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		// hl_sk 1___0-1, e.g. (&& hl1sk1 hl1sk2) is forbidden.
		for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
			ArrayList<LTLFormula> hlSks = new ArrayList<LTLFormula>();
			for (int skIndex = 1; skIndex <= numberOfSpeakers; skIndex++)
				hlSks.add(getHLSKPredicate(hlIndex, skIndex));
			result.addAll(getExclusivity(hlSks));
		}
		// sk_hl 0_1___1, e.g. (&& hl1sk1 hl2sk1) is forbidden.
		for (int skIndex = 1; skIndex <= numberOfSpeakers; skIndex++) {
			ArrayList<LTLFormula> hlSks = new ArrayList<LTLFormula>();
				for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++)
				hlSks.add(getHLSKPredicate(hlIndex, skIndex));
			result.addAll(getExclusivity(hlSks));
		}
		
		// hl_sc 1___0-1, e.g. (&& hl1sc1 hl1sc2) is forbidden.
		for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
			ArrayList<LTLFormula> hlScs = new ArrayList<LTLFormula>();
			for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++)
				hlScs.add(getHLSCPredicate(hlIndex, scIndex));
			result.addAll(getExclusivity(hlScs));
		}
		// sc_hl 0-1___1, e.g. (&& hl1sc1 hl2sc1) is forbidden.
		for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++) {
			ArrayList<LTLFormula> hlScs = new ArrayList<LTLFormula>();
			for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++)
				hlScs.add(getHLSCPredicate(hlIndex, scIndex));
			result.addAll(getExclusivity(hlScs));
		}

		// at_hl *___0-1, e.g. (&& hl1at1 hl2at1) is forbidden.
		for (int atIndex = 1; atIndex <= numberOfAttendees; atIndex++) {
			ArrayList<LTLFormula> hlScs = new ArrayList<LTLFormula>();
				for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++)
				hlScs.add(getHLSCPredicate(hlIndex, atIndex));
			result.addAll(getExclusivity(hlScs));
		}
		
		
		return result;
	}

	ArrayList<LTLFormula> getSpeakersSpeechAxioms() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		result.addAll(getSpeakersSpeeches(1, 1, 2));
		result.addAll(getSpeakersSpeeches(2, 3));
		result.addAll(getSpeakersSpeeches(3, 4, 5));
		result.addAll(getSpeakersSpeeches(4, 6));
		result.addAll(getSpeakersSpeeches(5, 7, 8));
		
		return result;
	}
	/* 
	 * FAhl(FAsk(<-> hlsk ORscOfSk(hlsc)))
	 */
	private ArrayList<LTLFormula> getSpeakersSpeeches(int ... skScs) {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		assert (skScs.length > 1);
		for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
			Or speechesOr = new Or();
			for (int scIndex = 1; scIndex < skScs.length; scIndex++) {
				speechesOr.add(getHLSCPredicate(hlIndex, skScs[scIndex]));
			}
			result.add(new Iff(getHLSKPredicate(hlIndex, skScs[0]), speechesOr));
		}
		
		return result;
	}
	
	/*
	 * (onceAndLength (-p- spc1) 4) (onceAndLength (-p- spc2) 3)
	 * (onceAndLength (-p- spc3) 3) (onceAndLength (-p- spc4) 2) (onceAndLength (-p- spc5) 4)
	 * (onceAndLength (-p- spc6) 2) (onceAndLength (-p- spc7) 3) (onceAndLength (-p- spc8) 4)
	 */
	private ArrayList<LTLFormula> getSpeechesLengthsAxioms() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		result.addAll(getOnceAndLength(getSCPredicate(1), 4));
		result.addAll(getOnceAndLength(getSCPredicate(2), 3));
		result.addAll(getOnceAndLength(getSCPredicate(3), 3));
		result.addAll(getOnceAndLength(getSCPredicate(4), 2));
		result.addAll(getOnceAndLength(getSCPredicate(5), 4));
		result.addAll(getOnceAndLength(getSCPredicate(6), 2));
		result.addAll(getOnceAndLength(getSCPredicate(7), 3));
		result.addAll(getOnceAndLength(getSCPredicate(8), 4));
		return result;
	}
	
	/*
	 * (<-> at1 (|| hl1at1 hl2at1 hl3at1))
	 */
	ArrayList<LTLFormula> getAttendeesDefinition() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int atIndex = 1; atIndex <= numberOfAttendees; atIndex++) {
			Or hallsAttendeeOr = new Or();
			for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
				hallsAttendeeOr.add(getHLATPredicate(hlIndex, atIndex));
			}
			result.add(new Iff(getATPredicate(atIndex), hallsAttendeeOr));
		}
		
		return result;
	}
	
	/*
	 * (<-> sk1 (|| hl1sk1 hl2sk1 hl3sk1))
	 */
	ArrayList<LTLFormula> getSpeakersDefinition() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int skIndex = 1; skIndex <= numberOfSpeakers; skIndex++) {
			Or hallsSpeakersOr = new Or();
			for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
				hallsSpeakersOr.add(getHLSKPredicate(hlIndex, skIndex));
			}
			result.add(new Iff(getSKPredicate(skIndex), hallsSpeakersOr));
		}
		
		return result;
	}
	
	/*
	 * (<-> (OrSC sc) (ORAT at)) 
	 */
	ArrayList<LTLFormula> getAtLeastOneATAndAtLeastOnceSC() {
		ArrayList<LTLFormula> result = new ArrayList<LTLFormula>();
		for (int hlIndex = 1; hlIndex <= numberOfHalls; hlIndex++) {
			Or scOr = new Or();
			for (int scIndex = 1; scIndex <= numberOfSpeeches; scIndex++)
				scOr.add(getHLSCPredicate(hlIndex, scIndex));
			Or atOr = new Or();
			for (int atIndex = 1; atIndex <= numberOfAttendees; atIndex++)
				atOr.add(getHLATPredicate(hlIndex, atIndex));
			result.add(new Iff(scOr, atOr));
		}

		return result;
	}

}