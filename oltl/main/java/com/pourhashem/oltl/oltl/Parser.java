/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package com.pourhashem.oltl.oltl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;
import com.pourhashem.xtext.oltl.OltlStandaloneSetup;
import com.pourhashem.xtext.oltl.oltl.Model;
import com.pourhashem.xtext.oltl.oltl.SoftAllTI;
import com.pourhashem.xtext.oltl.oltl.SoftFormula;
import com.pourhashem.xtext.oltl.oltl.SoftTI;
import com.pourhashem.xtext.oltl.oltl.TempFormula;
import com.pourhashem.xtext.oltl.oltl.Weight;

public class Parser {
	private int bound = 0;
	private int softBound;
	private Model model;
	private LTLFormula ltlFormula;
	private ArrayList<com.pourhashem.oltl.oltl.SoftFormula> softFormulae;

	public Parser(String script) {
		parse(script);
	}

	public LTLFormula getLtlFormula() {
		return ltlFormula;
	}

	public ArrayList<com.pourhashem.oltl.oltl.SoftFormula> getSoftFormulae() {
		return softFormulae;
	}

	public int getBound() {
		return bound;
	}
	
	public int getSoftBound() {
		return softBound;
	}

	public boolean parse(String script) {
		Injector injector = new OltlStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.createResource(URI.createURI("file:/example.oltl"));
		InputStream in = new ByteArrayInputStream(script.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}

		model = (com.pourhashem.xtext.oltl.oltl.Model) resource.getContents().get(0);
		if ((model == null) || (model.getTempFormula() == null))
			throw new IllegalArgumentException("Empty LTL formula.");
		softBound = bound = model.getBound();
		if (model.getSoftBound() > 0)
			softBound = model.getSoftBound();
		ltlFormula = getTempFormula(model.getTempFormula());
		if (model.getSoftFormulae().size() > 0)
			softFormulae = getSoftFormulae(model.getSoftFormulae());

		return true;/////////////////////////////////////// ***
		// return parseOutput();
	}

	private LTLFormula getTempFormula(TempFormula tempF) {
		if (tempF.getAp() != null)
			return new Predicate(tempF.getAp().getName());
		if (tempF.getFa().size() > 0)
			return new And(getTempFormulae(tempF.getFa()));
		if (tempF.getFo().size() > 0)
			return new Or(getTempFormulae(tempF.getFo()));
		if (tempF.getFnot() != null)
			return new Not(getTempFormula(tempF.getFnot()));
		if (tempF.getOp2() != null)
			return getOp2(tempF.getOp2(), tempF.getF1(), tempF.getF2());
		if (tempF.getOpf() != null)
			return getOpF(tempF.getOpf(), tempF.getF());
		return null;
	}

	private com.pourhashem.oltl.oltl.SoftFormula getSoftFormula(SoftFormula softF) {
		if (softF.getSoftAll() != null)
			return getSoftAll(softF.getSoftAll());
		if (softF.getSoftAt() != null)
			return getSoftAt(softF.getSoftAt());

		throw new IllegalArgumentException("Invalid temporal formula.");
	}

	private com.pourhashem.oltl.oltl.SoftFormula getSoftAll(SoftAllTI softAll) {
		String id = "";
		if (softAll.getId() != null)
			id = softAll.getId();
		return new SoftAll(new Predicate(softAll.getAp().getName()), id, getWeight(softAll.getWeight()));
	}

	private com.pourhashem.oltl.oltl.SoftFormula getSoftAt(SoftTI softAt) {
		String id = "";
		if (softAt.getId() != null)
			id = softAt.getId();
		return new SoftAt(new Predicate(softAt.getAp().getName()), softAt.getTi(), id, getWeight(softAt.getWeight()));
	}
	
	private float getWeight(Weight weight) {
		if (weight.getWInt() != null)
			return (float) weight.getWInt().getInt();
		else
			return Float.parseFloat(weight.getWFloat().getInt1() + "." + weight.getWFloat().getInt2());
	}

	/*
	 * 'futr' | 'past' | 'withinf' | 'withinp' | 'lasts' | 'lasted'
	 */
	// private Formula getOpFN(String opfn, TPFormula f1, int i) {
	// if (opfn.equals("futr"))
	// return new Futr(getFormula(f1), i);
	//
	// if (opfn.equals("past"))
	// return new Past(getFormula(f1), i);
	//
	// if (opfn.equals("withinf"))
	// return new WithinF(getFormula(f1), i);
	//
	// if (opfn.equals("withinp"))
	// return new WithinP(getFormula(f1), i);
	//
	// if (opfn.equals("lasts"))
	// return new Lasts(getFormula(f1), i);
	//
	// if (opfn.equals("lasted"))
	// return new Lasted(getFormula(f1), i);
	//
	// throw new IllegalArgumentException("Invalid temporal formula.");
	// }
	//
	// /*
	// * 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' |
	// 'somp'
	// */
	private LTLFormula getOpF(String opf, TempFormula f) {
		if (opf.equals("next"))
			return new Next(getTempFormula(f));
		if (opf.equals("yesterday"))
			return new Yesterday(getTempFormula(f));
		if (opf.equals("alw"))
			return new Alw(getTempFormula(f));
		if (opf.equals("alwf"))
			return new AlwF(getTempFormula(f));
		if (opf.equals("alwp"))
			return new AlwP(getTempFormula(f));
		if (opf.equals("som"))
			return new Som(getTempFormula(f));
		if (opf.equals("somf"))
			return new SomF(getTempFormula(f));
		if (opf.equals("somp"))
			return new SomP(getTempFormula(f));

		throw new IllegalArgumentException("Invalid temporal formula.");
	}

	private LTLFormula getOp2(String op2, TempFormula f1, TempFormula f2) {
		if (op2.equals("->"))
			return new Impl(getTempFormula(f1), getTempFormula(f2));
		if (op2.equals("<->"))
			return new Iff(getTempFormula(f1), getTempFormula(f2));
		if (op2.equals("until"))
			return new Until(getTempFormula(f1), getTempFormula(f2));
		if (op2.equals("release"))
			return new Release(getTempFormula(f1), getTempFormula(f2));
		if (op2.equals("since"))
			return new Since(getTempFormula(f1), getTempFormula(f2));
		if (op2.equals("trigger"))
			return new Trigger(getTempFormula(f1), getTempFormula(f2));

		throw new IllegalArgumentException("Invalid temporal formula.");
	}

	@SuppressWarnings("unused")
	private void printLTLInstances(LTLFormula ltlF) {
		for (int i = 0; i < LTLFormula.ltlInstances.size(); i++)
			System.out.println("\n" + ((LTLFormula) LTLFormula.ltlInstances.get(i)).getIndex() + ": "
					+ LTLFormula.ltlInstances.get(i));
	}

	public static boolean bfArraySubset(ArrayList<LTLFormula> a1, ArrayList<LTLFormula> a2) {
		if (a1 == null || a2 == null)
			return false;
		for (int i = 0; i < a1.size(); i++)
			for (int j = 0; j < a2.size(); j++) {
				if (a1.get(i).equals(a2.get(j)))
					break;
				if (j == a2.size() - 1)
					return false;
			}
		return true;
	}

	public static boolean bfArrayEqual(ArrayList<LTLFormula> a1, ArrayList<LTLFormula> a2) {
		return (bfArraySubset(a1, a2) && bfArraySubset(a2, a1));
	}

	private ArrayList<LTLFormula> getTempFormulae(EList<TempFormula> tempFe) {
		ArrayList<LTLFormula> formulae = new ArrayList<LTLFormula>();
		for (TempFormula tempF : tempFe)
			formulae.add(getTempFormula(tempF));
		return formulae;
	}

	private ArrayList<com.pourhashem.oltl.oltl.SoftFormula> getSoftFormulae(EList<SoftFormula> softFe) {
		ArrayList<com.pourhashem.oltl.oltl.SoftFormula> formulae = new ArrayList<com.pourhashem.oltl.oltl.SoftFormula>();
		for (SoftFormula softF : softFe)
			formulae.add(getSoftFormula(softF));
		return formulae;
	}

}
