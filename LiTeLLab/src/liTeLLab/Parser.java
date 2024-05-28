/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import java.util.ArrayList;

import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.LiTeLLabStandaloneSetup;
import org.xtext.example.mydsl.liTeLLab.TempFormula;
import org.xtext.example.mydsl.liTeLLab.TempTerm;
import org.xtext.example.mydsl.liTeLLab.WInt;
import org.xtext.example.mydsl.liTeLLab.Weight;

import com.google.inject.Injector;

public class Parser {
	private int bound = 0;
	private org.xtext.example.mydsl.liTeLLab.Model model;
	private OLTLFormula oltlFormula;

	public Parser(String script) {
		parse(script);
	}

	public OLTLFormula getOLtlFormula() {
		return oltlFormula;
	}

	public int getBound() {
		return bound;
	}

	public boolean parse(String script) {
		Injector injector = new LiTeLLabStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.createResource(URI.createURI("file:/example.liTeLLab"));
		InputStream in = new ByteArrayInputStream(script.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}

		model = (org.xtext.example.mydsl.liTeLLab.Model) resource.getContents().get(0);
		if ((model == null) || (model.getTempFormula() == null))
			throw new IllegalArgumentException("Empty LTL formula.");
		oltlFormula = getTempFormula(model.getTempFormula());

		return true;
	}

	private OLTLFormula getTempFormula(TempFormula tempF) {
		if (tempF.getAp() != null && tempF.getWeight() == null)
			return new Predicate(tempF.getAp().getPName());
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
		if (tempF.getWeight() != null)
			if (tempF.getAp() != null)
				return getWF(tempF.getAp().getPName(), tempF.getWeight());
			else if (tempF.getIap() != null)
				return getWF(tempF.getIap().getPName(), tempF.getWeight(), true);
		if (tempF.getX1() != null) {
			if (tempF.getX2() != null)
				return getXInterval(tempF.getFNext(), tempF.getX1(), tempF.getX2());
			else
				if (tempF.getX1().getInt() == 0)
					return new Next(getTempFormula(tempF.getFNext()));
				else
					return getXFutr(tempF.getFNext(), tempF.getX1());
		}
		if (tempF.getComp() != null) {
			TemporalTerm tt1 = getTemporalTerm(tempF.getTt1());
			TemporalTerm tt2 = getTemporalTerm(tempF.getTt2());
			
			return new ConstraintOC(tempF.getComp(), tt1, tt2);
		}
		
		System.out.print("\n*****\nInvalid input formula ...\n*****\n"); //Xtext doesn't accept 'p' as an ID in (-p- p).
		return null;
	}
	
	private TemporalTerm getTemporalTerm(TempTerm tt) {
		if (tt.getVar() != null)
			return new Variable(tt.getVar().getVName());
		if (tt.getOldVar() != null)
			return new Variable("Old_" + tt.getOldVar().getVar().getVName());
		return new Constant(tt.getInt1());
	}

	private OLTLFormula getXFutr(TempFormula fNext, WInt x1) {
		return new XFutr(getTempFormula(fNext), x1.getInt());
	}
	
	private OLTLFormula getXInterval(TempFormula fNext, WInt x1, WInt x2) {
		return new XInterval(getTempFormula(fNext), x1.getInt(), x2.getInt());
	}

	private float getWeight(Weight weight) {
		float sign = 1;
		if (weight.getNeg() != null)
			sign = -1;
		if (weight.getWInt() != null)
				return sign * (float) weight.getWInt().getInt();
		else
			return sign * Float.parseFloat(weight.getWFloat().getInt1() + "." + weight.getWFloat().getInt2());
	}

	// /*
	// 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' |
	// 'somp'
	// */
	private OLTLFormula getOpF(String opf, TempFormula f) {
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

	private OLTLFormula getOp2(String op2, TempFormula f1, TempFormula f2) {
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

	private OLTLFormula getWF(String apName, Weight w) {
		return new WAP(new Predicate(apName), getWeight(w));
	}
	
	private OLTLFormula getWF(String apName, Weight w, boolean intervalWise) {
		return new WAP(new Predicate(apName), getWeight(w), intervalWise);
	}
	
	public static boolean bfArraySubset(ArrayList<OLTLFormula> a1, ArrayList<OLTLFormula> a2) {
		if (a1 == null || a2 == null)
			return false;
		for (int i = 0; i < a1.size(); i++) {
			boolean found = false;
			for (int j = 0; j < a2.size(); j++) {
				if (a1.get(i).equals(a2.get(j))) {
					found = true;
					break;
				}
			}
			if (! found)
				return false;
		}
		
		return true;
	}

	private ArrayList<OLTLFormula> getTempFormulae(EList<TempFormula> tempFe) {
		ArrayList<OLTLFormula> formulae = new ArrayList<OLTLFormula>();
		for (TempFormula tempF : tempFe)
			formulae.add(getTempFormula(tempF));
		return formulae;
	}

}
