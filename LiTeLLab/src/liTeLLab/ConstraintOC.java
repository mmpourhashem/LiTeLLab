package liTeLLab;

import java.util.HashSet;

public class ConstraintOC extends OLTLFormula{
	public static HashSet<ConstraintOC> instances = new HashSet<ConstraintOC>();
	private Predicate ap;
	private TemporalTerm tt1;
	private TemporalTerm tt2;
	private String comp = "";
	
	
	public ConstraintOC(String comp, TemporalTerm tt1, TemporalTerm tt2) {
		super();
		this.ap = new Predicate(getGeneratedName(comp, tt1, tt2));
		this.comp = comp;
		this.tt1 = tt1;
		this.tt2 = tt2;
		if (tt1 instanceof Constant && tt2 instanceof Constant)
			System.out.print("\n*****\nInvalid input formula ...\n*****\n There must be at least a clock inside a constraint over clock.");
		instances.add(this);
	}
	
	
	private String getGeneratedName(String comp, TemporalTerm tt1, TemporalTerm tt2) {
		String name = "eq";
		if (comp.equals(">"))
			name = "gt";
		if (comp.equals("<"))
			name = "lt";
		if (comp.equals(">="))
			name = "geq";
		if (comp.equals("<="))
			name = "leq";
		name = Model.prefix + "_" + name + "_" + tt1.getDataObjectName() + "_" + tt2.getDataObjectName(); 
		
		return name;
	}

	public Predicate getAp() {
		return ap;
	}

	@Override
	public String getSemantics() {
		String result = "", name = ap.getName();
//		String bvComp = comp;
//		switch (comp) {
//		case ">=": {
//			bvComp = "bvuge";
//			break;
//		}
//		case "<=": {
//			bvComp = "bvule";
//			break;
//		}
//		case ">": {
//			bvComp = "bvugt";
//			break;
//		}
//		case "<": {
//			bvComp = "bvult";
//			break;
//		}
//		case "=": {
//			bvComp = "=";
//			break;
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + comp);
//		}
		
		for (int t = 0; t <= Model.getBound() + 1; t++)
			result += "\n(= (= #b1 ((_ extract "+t+" "+t+") "+name+")) (" + comp + " " + tt1.getAtTime(t) + " " + tt2.getAtTime(t) + "))";
		return result;
	}

	@Override
	public String toString() {
		return "([" + comp +"] " + tt1 + " " + tt2 +")";
	}
	
	@Override
	public int hashCode() {
		try {
			return (ap.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof ConstraintOC)
			return (ap.equals(((ConstraintOC) o).getAp()));
		return false;
	}
	
	@Override
	public String getName() {
		return ap.getName();
	}

}
