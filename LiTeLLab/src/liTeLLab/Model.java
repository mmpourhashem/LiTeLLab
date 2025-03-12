/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//otlRC_Delta is implemented as in the encoding, but in the implementation we always use small delta instead of capital DELTA according to the formula delta(i)=DELTA(i+1).
public class Model {
	private static int bound;// = 4;
	private OLTLFormula oltlFormula;
	private Set<Integer> ltlIndexes;
	private boolean isOCLTLoc = false;
	private boolean hasSoftConstraints = true;
	private static int cMax = 0;
	private static int m = 0;
	public static String prefix = "otl";
	public static String rcPrefix = prefix + "RC_";
	public static String delta = prefix + "Delta";
	public static boolean hasInputM; 
	public Model(String script, int bound, int m) {
		Parser parser = new Parser(script);
		this.bound = bound;
		hasInputM = false;
		if (m >= 0) {
			this.m = m;
			hasInputM = true;
		}
		oltlFormula = parser.getOLtlFormula();
		oltlFormula = expandAbbreviations(oltlFormula);
		removeAbbreviationsAndRedundantFFromLTLInstances();
		setWAPsAssertedTimeInstants(oltlFormula, 0);
		isOCLTLoc = Variable.instances.size() > 0;
//		For all x (GF(x = 0) or FG(x > Cmax))
		if (isOCLTLoc) {//To avoid zeno behaviour
			And and = new And();
			for (Variable v : Variable.instances)
				if (! v.getName().startsWith("Old_"))
					and.add(new Or(new Alw(new SomF(new ConstraintOC("=", v, new Constant(0)))), new Som(new AlwF(new ConstraintOC(">", v, new Constant(cMax))))));
			and.add(oltlFormula);
			oltlFormula = and;
		}
	}

	public String getSemantics() {
		ltlIndexes = new HashSet<Integer>();
		for (OLTLFormula ltlf : OLTLFormula.ltlInstances)
			ltlIndexes.add(ltlf.getIndex());

		return getDeclarations() + "\n(assert (and " + getLTLSemantics() + '\n' + getLoopConstraints()
		+ "\n))" + getSoftSemantics();
	}

	public String getLTLSemantics() {
		String s = "", high = "", low = "";
		boolean realAvgCost = true;
		for (int index : ltlIndexes)
			s += OLTLFormula.ltlInstances.get(index).getSemantics();
		if (isOCLTLoc) {
			s += "\n;cMax = " + cMax + ", M = " + m;
			s += getClockRelatedSemantics();
			s += getLengthSemantics();
		}
		hasSoftConstraints = WAP.instances.size() > 0;
		if (hasSoftConstraints && realAvgCost) {
			for (WAP wap : WAP.instances) {
				if (! isOCLTLoc) {
					high += wap.getHighSemantics();
					low += wap.getLowSemantics();
				}
				else {
					high += wap.geOCLTLoctHighSemantics();
					low += wap.getOCLTLocLowSemantics();
				}
			}
			s += "\n(= costHSum (+ 0 " + high +"))\n";
			s += "\n(= costLSum (+ 0 " + low +"))\n";
		}
		if (oltlFormula instanceof Predicate)
			return s + "(= ((_ extract 0 0) " + ((Predicate) oltlFormula).getName() + ") #b1)";
		else
			return s + "(= ((_ extract 0 0) " + oltlFormula.getName() + ") #b1)";

	}

	private String getLengthSemantics() {
		String s = "\n;Length Semantics";
		for (int t = 0; t <= bound; t++) {
			for (Variable v : Variable.instances) {
				if (! v.getName().startsWith("Old_"))
					continue;
				String mainClockResetAtT = "(= " + Variable.getVByName(v.getNameWOOld()).getAtTime(t) + " 0.0)";
				s += "\n(=> (and (not " + mainClockResetAtT +") (<= " + v.getAtTime(t + 1) + " " + cMax + ")) ";
				s += "\n\t(= (" + prefix + "Length " + t + ") ";

				String tmp = "(- " + v.getRoundAtTime(t + 1) + " " + v.getRoundAtTime(t) + ")";
				s += tmp + "))";
				s += "\n(=> (and " + mainClockResetAtT + " (<= " + v.getAtTime(t + 1) + " " + cMax + "))";
				s += "\n\t(= (" + prefix + "Length " + t + ") ";
				tmp = v.getRoundAtTime(t + 1);
				s += tmp + "))";
//				0 < x(i) ≤ Cmax and `x(i+1) > Cmax -> Length(i) ≥ Cmax - Round(`x(i))
				String left = "(and (> " + Variable.getVByName(v.getNameWOOld()).getAtTime(t) + " 0.0) (<= " + Variable.getVByName(v.getNameWOOld()).getAtTime(t) + " " + cMax + 
						") (> " + v.getAtTime(t + 1) + " " + cMax + "))";
				String right = " (>= (" + prefix + "Length " + t + ") (- " + cMax + " " + v.getRoundAtTime(t) + "))";
				s += "\n (=> " + left + right + ")"; 
			}
			s += "\n(= (" + prefix + "Length " + t + ") " + getDeltaRoundAtTime(t+1) + ")";
		}

		return s;
	}

	private String getClockRelatedSemantics() {
		String s = "", deltaGTZ = "\n;Delta Semantics", deltaSemantics = "";
		for (ConstraintOC coc : ConstraintOC.instances)
			s += coc.getSemantics();
		s += "\n;Clock bound";
		for (int t = 0; t <= bound; t++) {
			deltaGTZ += "\n(> " + getDeltaAtTime(t) + " 0.0) (<= " + getDeltaAtTime(t) + " " + toReal(m) + ")";
			deltaGTZ += "\n(>= (" + prefix + "Length " + t + ") 0) (<= (" + prefix + "Length " + t + ") " + m + ")";
		}
		for (Variable v : Variable.instances)
			for (int t = 0; t <= bound + 1; t++)
				if (! v.getName().startsWith("Old_"))
					s += "\n(>= " + v.getAtTime(t) + " 0.0)";
		for (Variable v : Variable.instances)
			for (int t = 0; t <= bound + 1; t++) {
				if (! v.getName().startsWith("Old_"))
					deltaSemantics += "\n(=> (not " + v.getResetAPAtTime(t) + ")"
							+ " (= " + v.getAtTime(t) + " " + Variable.getVByName(v.getNameWOld()).getAtTime(t) + "))"; 
				else {
					if (t == 0)
						deltaSemantics += "\n(> " + v.getAtTime(t) + " 0.0)";
					deltaSemantics += "\n(= " + v.getAtTime(t + 1) + " (+ " + Variable.getVByName(v.getNameWOOld()).getAtTime(t) + " " + getDeltaAtTime(t) + "))";
				}
			}
		s += deltaGTZ;
		s += "\n; Clock-Delta Semantics" + deltaSemantics;  
		s += "\n; Region Semantics" + getLoopRegionSemantics();
		s += "\n; Corner Point Semantics" + getCornerPointSemantics();
		return s;
	}

	private String getLoopRegionSemantics() {
		String s = "";
		int kp1 = bound + 1;
		for (Variable v : Variable.instances) {
			String tmp = toReal(cMax);
			if (v.getName().startsWith("Old_"))	{
				String bothGTcMax = "(and (> " + v.getAtTime("i_loopInt") + " " + toReal(cMax) + ") " + "(> " + v.getAtTime(kp1) + " " + toReal(cMax) + ")) ";
				s += "\n(or " + bothGTcMax;
				s += "(and (= " + v.getIntAtTime("i_loopInt") + " " + v.getIntAtTime(kp1) + ")";
				s += "\n(= " + v.getRCAtTime("i_loopInt") + " " + v.getRCAtTime(kp1) + ")";
				s += "\n(= " + v.getFractionIsZeroAtTime("i_loopInt") + " " + v.getFractionIsZeroAtTime(kp1) + ")))";
			}
//			else
//				s += "\n(loopConF " + v.getResetAPName() + ")";
		}
//		&$\Big(\lfloor \old{\dist}(l)\rfloor=\lfloor \old{\dist}(k+1)\rfloor \wedge \RC{\old{\dist}}{l}=\RC{\old{\dist}}{k+1} \wedge (\Fr{\old{\dist}}{l}=0\Leftrightarrow\Fr{\old{\dist}}{k+1}=0)\Big)\wedge$\\
		s += "\n(= (to_int (otlDelta (- i_loopInt 1))) (to_int (otlDelta " + bound + ")))";
		s += "\n(= " + getRCDeltaAtTime("i_loopInt") + " " + getRCDeltaAtTime(bound + 1) + ")";
		s += "\n(= " + getDeltaFractionIsZeroAtTime("(- i_loopInt 1)") + " " + getDeltaFractionIsZeroAtTime(Integer.toString(bound)) + ")";
		//		(fraction part of c1 at k+1 > fraction part of c2 at k+1) <=> (fraction part of c1 at loop > fraction part of c2 at loop)
		Variable [] tmp = new Variable[Variable.instances.size()];
		Variable.instances.toArray(tmp);
		for (int i = 0; i < Variable.instances.size() - 1; i++)
			for (int j = i + 1; j < Variable.instances.size(); j++) {
				Variable ci = tmp[i];
				Variable cj = tmp[j];
				if (! (ci.getName().startsWith("Old_") && cj.getName().startsWith("Old_")))
					continue;
				String bothLessThanCMax = "(and (<= " + ci.getAtTime(kp1) + " " + toReal(cMax) + ") (<= " + cj.getAtTime(kp1) + " " + toReal(cMax) + ")) ";
				s += "\n(=> " + bothLessThanCMax + "(and (= (> " + ci.getFractionAtTime(kp1) + " " + cj.getFractionAtTime(kp1)	+ ") (> " + ci.getFractionAtTime("i_loopInt") + " " + cj.getFractionAtTime("i_loopInt") + "))"
						+ " (= (< " + ci.getFractionAtTime(kp1) + " "  + cj.getFractionAtTime(kp1)	+ ") (< " + ci.getFractionAtTime("i_loopInt") + " " + cj.getFractionAtTime("i_loopInt") + "))))";
			}

		return s;
	}

	private String getCornerPointSemantics() {
		String s = "";
		s += "\n; Keep set right-corner inside the interval.";
		//		for (Variable v : Variable.instances)// this is not necessary
		//			if (! v.getName().startsWith("New_"))
		//				s += "\n(not " + v.getRCAtTime(0) + ")";
		for (int t = 1; t <= bound + 1; t++) {
			for (Variable v : Variable.instances) {
				if (! v.getName().startsWith("Old_"))
					continue;
				String leqCMax = "(<= " + v.getAtTime(t) + " " + toReal(cMax) + ") ";
				String newNotZero = "(not (= (" + v.getNameWOOld() + " " + t + ") 0.0)) ";
//				@20250311 We decided to remove the following constraint because it is not necessary, since length cannot be negative and length(i)=RoundDelta(i+1)
//				s += "\n(=> (and " + newNotZero + leqCMax + "(= " + v.getIntAtTime(t + 1) + " " + v.getIntAtTime(t) + ") " + v.getRCAtTime(t) + ") " + v.getRCAtTime(t + 1) + ")";
				s += "\n(=> (and " + leqCMax + v.getFractionIsZeroAtTime(t) + ") (not " + v.getRCAtTime(t) + "))";
			}
			s += "\n(=> (= (to_int " + getDeltaAtTime(t - 1) + ") " + getDeltaAtTime(t - 1) + ") (not " + getRCDeltaAtTime(t) + "))"; //In the implementation, we always refer to small delta even for RCs. RCDelta(t) in the paper is equal to RCDelta(t-1) in the tool.
		}
		return s;
	}

	private String toReal(int i) {
		return i + ".0";
	}

	private String getDeclaration(String name) {
		return "\n(declare-const " + name + " (_ BitVec " + (bound + 2) + "))";
	}

	private String getIntDeclaration(String name) {
		return "\n(declare-fun " + name + " (Int) Int)";
	}

	private String getRealDeclaration(String name) {
		return "\n(declare-fun " + name + " (Int) Real)";
	}

	private String getBoolDeclaration(String name) {
		return "\n(declare-fun " + name + " (Int) Bool)";
	}

	private String getDeclarations() {
		String s = "";
		for (Predicate p : Predicate.instances)
			s += getDeclaration(p.getName());
		for (int index : ltlIndexes)
			s += getDeclaration(Model.prefix + index);
		if (isOCLTLoc) {
			s += getIntDeclaration(prefix + "Length");
			for (Variable v : Variable.instances) {
				s += getRealDeclaration(v.getName());
				if (v.getName().startsWith("Old_"))
					s += getBoolDeclaration(rcPrefix + v.getName());
			}
			s += "\n(declare-const i_loopInt Int)\n(assert (and (> i_loopInt 0) (<= i_loopInt " + bound + ") (= ((_ int2bv " + (bound + 2) + ") i_loopInt) i_loop)))";
			s += getRealDeclaration(delta);
			s += getBoolDeclaration(rcPrefix + "Delta");
			s += "\n(declare-const " + prefix + "Denom" + " Int)\n(assert (<= " + prefix + "Denom " + ((m+1)*bound) + "))";
		}

		return s;
	}

	private String getLoopConstraint(String name) {
		return "(loopConF " + name + ")";
	}

	private String getLoopConstraints() {
		String s = "";
		for (Predicate p : Predicate.instances)
			s += getLoopConstraint(p.getName());
		for (int index : ltlIndexes)
			s += getLoopConstraint(Model.prefix + index);

		return s;
	}

	private String getSoftSemantics() {
		String s = "";
		if (! hasSoftConstraints)
			return s;
		if (! isOCLTLoc)
			s += "\n(assert (= costHAvg " + getRecIte(1) + "))"
					+ "\n(minimize costHAvg)"
					+ "\n(minimize costLSum)";
		else {
			String length = prefix + "Length", denom = prefix + "Denom";
			s += "\n(assert (and (> " + denom + " 0) (= " + denom + " (+";
			for (int t = 1; t <= Model.getBound(); t++)
				s += " (ite (= #b0 ((_ extract "+t+" "+t+") in_loop)) 0 (" + length + " " + t +"))";
			s += "))\n(= costHAvg";
			String tail = "";
			s += "(/ costHSum (to_real otlDenom)))))";
			s += "\n(minimize costHAvg)\n(minimize costLSum)";
		}

		return s;
	}

	private String getRecIte(int i) {
		if (i == bound)
			return " costHSum";
		return "(ite (= i_loop (_ bv" + i + " " + (bound + 2) +")) (/ costHSum " + (bound - i + 1) + ".0)" + getRecIte(i + 1) + ")";
	}

	public static int getBound() {
		return bound;
	}

	public OLTLFormula getLtlFormula() {
		return oltlFormula;
	}

	public void setLtlFormula(OLTLFormula ltlFormula) {
		this.oltlFormula = ltlFormula;
	}

	private void setWAPsAssertedTimeInstants(Formula inputF, int nestedNextLevel) {
		if (inputF instanceof Alw || inputF instanceof AlwF || inputF instanceof AlwP || inputF instanceof Som || inputF instanceof SomF || inputF instanceof SomP || inputF instanceof Release || inputF instanceof Until || inputF instanceof Since || inputF instanceof Trigger || inputF instanceof Yesterday)
			setInteriorWAPsRootXFalse(inputF);
		if (inputF instanceof And)
			for (Formula f : ((And)inputF).getFormulae())
				setWAPsAssertedTimeInstants(f, nestedNextLevel);
		if (inputF instanceof Or)
			for (Formula f : ((Or)inputF).getFormulae())
				setWAPsAssertedTimeInstants(f, nestedNextLevel);
		if (inputF instanceof Iff) {
			setWAPsAssertedTimeInstants(((Iff)inputF).getFormula1(), nestedNextLevel);
			setWAPsAssertedTimeInstants(((Iff)inputF).getFormula2(), nestedNextLevel);
		}
		if (inputF instanceof Impl) {
			setWAPsAssertedTimeInstants(((Impl)inputF).getFormula1(), nestedNextLevel);
			setWAPsAssertedTimeInstants(((Impl)inputF).getFormula2(), nestedNextLevel);
		}
		if (inputF instanceof Not)
			setWAPsAssertedTimeInstants(((Not)inputF).getFormula(), nestedNextLevel);
		if (inputF instanceof Next)
			setWAPsAssertedTimeInstants(((Next)inputF).getFormula(), nestedNextLevel + 1);
		if (inputF instanceof WAP)
			((WAP)inputF).addAssertedTimeInstants(nestedNextLevel);
	}

	private void setInteriorWAPsRootXFalse(Formula inputF) {
		if (inputF instanceof Alw)
			setInteriorWAPsRootXFalse(((Alw)inputF).getFormula());
		if (inputF instanceof AlwF)
			setInteriorWAPsRootXFalse(((AlwF)inputF).getFormula());
		if (inputF instanceof AlwP)
			setInteriorWAPsRootXFalse(((AlwP)inputF).getFormula());
		if (inputF instanceof Iff) {
			setInteriorWAPsRootXFalse(((Iff)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Iff)inputF).getFormula2());
		}
		if (inputF instanceof Impl) {
			setInteriorWAPsRootXFalse(((Impl)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Impl)inputF).getFormula2());
		}
		if (inputF instanceof Next)
			setInteriorWAPsRootXFalse(((Next)inputF).getFormula());
		if (inputF instanceof Not)
			setInteriorWAPsRootXFalse(((Not)inputF).getFormula());
		if (inputF instanceof Release) {
			setInteriorWAPsRootXFalse(((Release)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Release)inputF).getFormula2());
		}
		if (inputF instanceof Since) {
			setInteriorWAPsRootXFalse(((Since)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Since)inputF).getFormula2());
		}
		if (inputF instanceof Until) {
			setInteriorWAPsRootXFalse(((Until)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Until)inputF).getFormula2());
		}
		if (inputF instanceof Trigger) {
			setInteriorWAPsRootXFalse(((Trigger)inputF).getFormula1());
			setInteriorWAPsRootXFalse(((Trigger)inputF).getFormula2());
		}
		if (inputF instanceof Som)
			setInteriorWAPsRootXFalse(((Som)inputF).getFormula());
		if (inputF instanceof SomF)
			setInteriorWAPsRootXFalse(((SomF)inputF).getFormula());
		if (inputF instanceof SomP)
			setInteriorWAPsRootXFalse(((SomP)inputF).getFormula());
		if (inputF instanceof Yesterday)
			setInteriorWAPsRootXFalse(((Yesterday)inputF).getFormula());
		if (inputF instanceof And)
			for (Formula f : ((And)inputF).getFormulae())
				setInteriorWAPsRootXFalse(f);
		if (inputF instanceof Or)
			for (Formula f : ((Or)inputF).getFormulae())
				setInteriorWAPsRootXFalse(f);
		if (inputF instanceof WAP)
			((WAP)inputF).setRootX(false);
	}

	private OLTLFormula expandAbbreviations(OLTLFormula inputF) {
		return expandXFutr(expandXInterval(inputF));
	}

	private OLTLFormula expandXInterval(OLTLFormula inputF) {
		if (inputF instanceof Alw)
			return new Alw(expandXInterval(((Alw)inputF).getFormula()));
		if (inputF instanceof AlwF)
			return new AlwF(expandXInterval(((AlwF)inputF).getFormula()));
		if (inputF instanceof AlwP)
			return new AlwP(expandXInterval(((AlwP)inputF).getFormula()));
		if (inputF instanceof Iff) {
			return new Iff(expandXInterval(((Iff)inputF).getFormula1()), expandXInterval(((Iff)inputF).getFormula2()));
		}
		if (inputF instanceof Impl) {
			return new Impl(expandXInterval(((Impl)inputF).getFormula1()), expandXInterval(((Impl)inputF).getFormula2()));
		}
		if (inputF instanceof Next)
			return new Next(expandXInterval(((Next)inputF).getFormula()));
		if (inputF instanceof Not)
			return new Not(expandXInterval(((Not)inputF).getFormula()));
		if (inputF instanceof Release) {
			return new Release(expandXInterval(((Release)inputF).getFormula1()), expandXInterval(((Release)inputF).getFormula2()));
		}
		if (inputF instanceof Since) {
			return new Since(expandXInterval(((Since)inputF).getFormula1()), expandXInterval(((Since)inputF).getFormula2()));
		}
		if (inputF instanceof Until) {
			return new Until(expandXInterval(((Until)inputF).getFormula1()), expandXInterval(((Until)inputF).getFormula2()));
		}
		if (inputF instanceof Trigger) {
			return new Trigger(expandXInterval(((Trigger)inputF).getFormula1()), expandXInterval(((Trigger)inputF).getFormula2()));
		}
		if (inputF instanceof Som)
			return new Som(expandXInterval(((Som)inputF).getFormula()));
		if (inputF instanceof SomF)
			return new SomF(expandXInterval(((SomF)inputF).getFormula()));
		if (inputF instanceof SomP)
			return new SomP(expandXInterval(((SomP)inputF).getFormula()));
		if (inputF instanceof Yesterday)
			return new Yesterday(expandXInterval(((Yesterday)inputF).getFormula()));
		if (inputF instanceof And) {
			And and = new And();
			for (OLTLFormula f : ((And)inputF).getFormulae())
				and.add(expandXInterval(f));
			return and;
		}
		if (inputF instanceof Or) {
			Or or = new Or();
			for (OLTLFormula f : ((Or)inputF).getFormulae())
				or.add(expandXInterval(f));
			return or;
		}
		if (inputF instanceof XInterval) {
			OLTLFormula f = expandXInterval(((XInterval)inputF).getFormula());
			int x1 = ((XInterval)inputF).getX1();
			int x2 = ((XInterval)inputF).getX2();
			And and = new And();
			for (int t = x1; t <= x2; t++) 
				and.add(new XFutr(f, t));
			return and;
		}

		return inputF;
	}

	private OLTLFormula expandXFutr(OLTLFormula inputF) {
		if (inputF instanceof Alw)
			return new Alw(expandXFutr(((Alw)inputF).getFormula()));
		if (inputF instanceof AlwF)
			return new AlwF(expandXFutr(((AlwF)inputF).getFormula()));
		if (inputF instanceof AlwP)
			return new AlwP(expandXFutr(((AlwP)inputF).getFormula()));
		if (inputF instanceof Iff) {
			return new Iff(expandXFutr(((Iff)inputF).getFormula1()), expandXFutr(((Iff)inputF).getFormula2()));
		}
		if (inputF instanceof Impl) {
			return new Impl(expandXFutr(((Impl)inputF).getFormula1()), expandXFutr(((Impl)inputF).getFormula2()));
		}
		if (inputF instanceof Next)
			return new Next(expandXFutr(((Next)inputF).getFormula()));
		if (inputF instanceof Not)
			return new Not(expandXFutr(((Not)inputF).getFormula()));
		if (inputF instanceof Release) {
			return new Release(expandXFutr(((Release)inputF).getFormula1()), expandXFutr(((Release)inputF).getFormula2()));
		}
		if (inputF instanceof Since) {
			return new Since(expandXFutr(((Since)inputF).getFormula1()), expandXFutr(((Since)inputF).getFormula2()));
		}
		if (inputF instanceof Until) {
			return new Until(expandXFutr(((Until)inputF).getFormula1()), expandXFutr(((Until)inputF).getFormula2()));
		}
		if (inputF instanceof Trigger) {
			return new Trigger(expandXFutr(((Trigger)inputF).getFormula1()), expandXFutr(((Trigger)inputF).getFormula2()));
		}
		if (inputF instanceof Som)
			return new Som(expandXFutr(((Som)inputF).getFormula()));
		if (inputF instanceof SomF)
			return new SomF(expandXFutr(((SomF)inputF).getFormula()));
		if (inputF instanceof SomP)
			return new SomP(expandXFutr(((SomP)inputF).getFormula()));
		if (inputF instanceof Yesterday)
			return new Yesterday(expandXFutr(((Yesterday)inputF).getFormula()));
		if (inputF instanceof And) {
			And and = new And();
			for (OLTLFormula f : ((And)inputF).getFormulae())
				and.add(expandXFutr(f));
			return and;
		}
		if (inputF instanceof Or) {
			Or or = new Or();
			for (OLTLFormula f : ((Or)inputF).getFormulae())
				or.add(expandXFutr(f));
			return or;
		}
		if (inputF instanceof XFutr) {
			OLTLFormula f = ((XFutr)inputF).getFormula();
			int x = ((XFutr)inputF).getX();
			if (x == 0)
				return expandXFutr(f);
			return new Next(expandXFutr(new XFutr(f, x - 1)));
		}

		return inputF;
	}

	public void removeAbbreviationsAndRedundantFFromLTLInstances() {
		ArrayList<OLTLFormula> updatedLTLInstances = new ArrayList<OLTLFormula>();
		ArrayList<OLTLFormula> currentLTLInstances = new ArrayList<OLTLFormula>();
		for (OLTLFormula f : OLTLFormula.ltlInstances)
			currentLTLInstances.add(f);
		for (OLTLFormula f : currentLTLInstances)
			if (!f.containsAbbreviation() && !isIn(f, updatedLTLInstances))
				updatedLTLInstances.add(f);
		OLTLFormula.ltlInstances = updatedLTLInstances;
	}

	private boolean isIn(OLTLFormula inputF, ArrayList<OLTLFormula> updatedLTLInstances) {
		for (OLTLFormula f : updatedLTLInstances)
			if (f.equals(inputF))
				return true;
		return false;
	}

	public String getDeltaAtTime(int t ) {
		return "(" + delta + " " + t + ")";
	}
	
	public String getDeltaAtTime(String t ) {
		return "(" + delta + " " + t + ")";
	}

	public String getRCDeltaAtTime(int t ) {
		return "(" + rcPrefix + "Delta " + t + ")";
	}

	public String getDeltaRoundAtTime(int t) {
		return "(+ " + getDeltaIntAtTime(t - 1) + " (ite " + getRCDeltaAtTime(t) + " 1 0))";
	}

	public String getDeltaIntAtTime(int t) {
		return "(to_int (" + delta + " " + t + "))";
	}

	public String getRCDeltaAtTime(String t ) {
		return "(" + rcPrefix + "Delta " + t + ")";
	}

	public static int getAPBVSize() {
		return bound + 2;
	}

	public static void updateCMax(int constant) {
		cMax = (constant > cMax) ? constant : cMax;
		//		m = 2 * cMax;
		if (! hasInputM)
			m = cMax + 1;
	}
	
	public String getDeltaFractionIsZeroAtTime(String t) {
		return "(= (" + delta + " " + t + ") (to_int (" + delta + " " + t + ")))";
	}
	
	public boolean getHasSoftConstraints() {
		return hasSoftConstraints;
	}
}