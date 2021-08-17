/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

import java.util.Date;

import com.pourhashem.oltl.oltl.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class LTLTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public LTLTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(LTLTest.class);
	}

	public static void test1() {
		String s = "Bound: 4" + "Formula:"
		// + "(alw (&& (-p- s) (-p- sss)))"
		// + "(&& (next (somp (-p- a))) (!!(-p- b)))"
		// + "(&& (|| (-p- a) (-p- b)) (&& (somf (-p- a)) (-p- b)) (&& (-p- b)
		// (until (-p- c) (|| (-p- a) (-p- b))) (somf (-p- a))))"
				+ "(&& (&& (-p- a) (!! (next (alwf (-p- a))))) (next (alwf (-p- c))))" + "SoftFormulae:"
				+ "(soft (-p- a) 11)" + "(soft (@ (-p- b) 3) 22)";
		App.run(s);
	}

	public static void test2() {
		String s = "Bound: 4\n" + "\nFormula:\n"
		// + "(alw (&& (-p- s) (-p- sss)))"
		// + "(&& (next (somp (-p- a))) (!!(-p- b)))"
		// + "(&& (|| (-p- a) (-p- b)) (&& (somf (-p- a)) (-p- b)) (&& (-p- b)
		// (until (-p- c) (|| (-p- a) (-p- b))) (somf (-p- a))))"
				+ "(&& (&& (-p- a) (!! (next (alwf (-p- a))))) (next (alwf (-p- c))))" + "\nSoftFormulae:\n"
				+ "(soft (-p- a) 11)" + "(soft (@ (-p- b) 3) 22)";
		App.run(s);
	}
	
	public static void test3() {
		String s = "Bound:19"
				+ "Formula:"
//				+ "(alw (<-> (-P- soft-notAT1time) "
				+ "(-P- a_1)"
//				+ "))"
//				+ "SoftFormulae:"
//				+ "(soft (@ (-P- soft-notAT1time) 0) 1.0)"
//				+ "(soft (@ (-P- soft-notAT1time) 1) 1.0)"
;
		App.run(s);
	}

	public static void TestConf() {
		Conf conf = new Conf();
//		System.out.println(conf.getOLTLScript());
		App.run(conf.getOLTLScript());
	}
	
	@SuppressWarnings("deprecation")
	public void TestConfInternal() {
		Conf conf = new Conf();
		// System.out.println(conf.getOnce(new Predicate("aaa")));
		// System.out.println("-------------------------");
		// System.out.println(conf.getOnceAndLength(new Predicate("aaa"), 3));
		// System.out.println(conf.getSpeechInSingleHall());
		// System.out.println(conf.getAttendeeNotPartiallyAttendSpeech());
		// ArrayList<LTLFormula> fs.getExclusivityAxioms(fe));
		//// System.out.println(conf.getAttendees_Halls());
		// System.out.println(conf.getNoSpeechAtTI(0));
		// System.out.println(conf.getNoSpeechAtTI(1));
		// System.out.println(conf.getNoSpeechAtTI(2));
		// System.out.println(conf.getTimeInstant(new Date(0,0,0,9,1)));
		// System.out.println(conf.getTimeInstant(new Date(0,0,0,8,1)));
		// System.out.println(conf.getTimeInstant(new Date(0,0,0,12,0)));
		// System.out.println(conf.getTimeInstant(new Date(0,0,0,13,30)));
		// System.out.println(conf.getBreakAxioms(new Date(0,0,0,12,0), new
		// Date(0,0,0,13,30)));
		// System.out.println(conf.getSpeakersSpeechAxioms());
		// System.out.println(conf.getATDoesNotMissSC(1,2,(float) 2.3));
		// System.out.println(conf.getATDoesNotMissSC(2,3,(float) 2));
		// System.out.println(conf.getATDoesNotMissSC(3,1,(float) 0.3));
		// System.out.println(conf.getAttendeesDefinition());
		// System.out.println(conf.getSpeakersDefinition());
		System.out.println(conf.getATDoesNotLikeTI(3, new Date(0, 0, 0, 8, 0), new Date(0, 0, 0, 9, 0), 1));
		System.out.println(conf.getATDoesNotLikeTI(3, new Date(0, 0, 0, 15, 0), new Date(0, 0, 0, 17, 0), 1));

		for (SoftFormula sf : conf.getSoftFormulae())
			System.out.println(sf);

	}

}
