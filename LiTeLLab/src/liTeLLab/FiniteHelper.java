package liTeLLab;

public final class FiniteHelper {
	
	public static OLTLFormula getFiniteEndFormula(int bound) {
		return new XFutr(new Predicate("end"), bound);
	}
	
	public static OLTLFormula getFiniteNext(OLTLFormula f) {
		return new Next(new And(f, new Not(new Predicate("end"))));
	}

	public static OLTLFormula getFiniteUntil(OLTLFormula a, OLTLFormula b) {
		return new Until(a, new And(b, new Not(new Predicate("end"))));
	}
	
	public static OLTLFormula getFiniteAlwF(OLTLFormula f) {
		return new Until(f, new Predicate("end"));
	}
	
	public static OLTLFormula getFiniteSomF(OLTLFormula f) {
		return new Not(getFiniteAlwF(new Not(f)));
	}
	
	public static OLTLFormula getFiniteSom(OLTLFormula f) {
		return new Or(getFiniteSomF(f), new SomP(f));
	}
	
	public static OLTLFormula getFiniteAlw(OLTLFormula f) {
		return new And(getFiniteAlwF(f), new AlwP(f));
	}
}
