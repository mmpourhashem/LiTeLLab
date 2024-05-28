/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;


import java.util.HashSet;

public class Variable extends TemporalTerm{

	public static HashSet<Variable> instances = new HashSet<Variable>();

	private String variableName;

	public Variable() {
	}

	public Variable(String variableName) {
		this.variableName = variableName;
		instances.add(this);
		if (! variableName.startsWith("Old_") && ! containsClock("Old_" + variableName))
			instances.add(new Variable("Old_" + variableName));
		else if (! containsClock(getNameWOOld()))
			instances.add(new Variable(getNameWOOld()));
	}

	public String getName() {
		return variableName;
	}

	public String getIntAtTime(int t) {
		return "(to_int (" + variableName + " " + t + "))";
	}

	public String getIntAtTime(String t) {
		return "(to_int (" + variableName + " " + t + "))";
	}

	public String getRCAtTime(int t) {
		return "(" + Model.rcPrefix + variableName + " " + t + ")";
	}
	
	public String getRCAtTime(String t) {
		return "(" + Model.rcPrefix + variableName + " " + t + ")";
	}

	public String getFractionAtTime(String t) {
		return "(- (" + variableName + " " + t + ") (to_int (" + variableName + " " + t + ")))";
	}

	public String getFractionAtTime(int t) {
		return "(- (" + variableName + " " + t + ") (to_int (" + variableName + " " + t + ")))";
	}
	
	public String getFractionIsZeroAtTime(int t) {
		return "(= (" + variableName + " " + t + ") (to_int (" + variableName + " " + t + ")))";
	}
	
	public String getFractionIsZeroAtTime(String t) {
		return "(= (" + variableName + " " + t + ") (to_int (" + variableName + " " + t + ")))";
	}

	public String getRoundAtTime(int t) {
		return "(+ " + getIntAtTime(t) + " (ite " + getRCAtTime(t) + " 1 0))";
	}

	public String getResetAPAtTime(int t) {
		return "(= #b1 ((_ extract " + t + " " + t + ") " + Model.prefix + "_eq_" + variableName + "_0))";
	}

	public String getResetAPName() {
		return Model.prefix + "_eq_" + variableName + "_0";
	}

	public String getAtTime(String t) {
		return "(" + variableName + " "+ t + ")";
	}

	public String getNameWOOld() {
		if (variableName.startsWith("Old_"))
			return variableName.substring("Old_".length());
		return variableName;
	}
	
	public String getNameWOld() {
		if (! variableName.startsWith("Old_"))
			return "Old_" + variableName;
		return variableName;
	}

	public static Variable getVByName(String name) {
		for (Variable v : instances)
			if (v.getName().equals(name))
				return v;
		return null;
	}
	
	public boolean containsClock(String name) {
		for (Variable v: instances)
			if (v.getName().equals(name))
				return true;
		return false;
	}

	public static boolean sameClock(Variable v1, Variable v2) {
		return (v1.getName().equals("Old_" + v2.getName()) || v2.getName().equals("Old_" + v1.getName()));
	}
	
	@Override
	public String toString() {
		//		return "(-V- " + variableName + ")";
		return variableName;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Variable)
			if (variableName.length() != ((Variable) o).getName().length())
				return false;
			else
				return (variableName.toUpperCase().equals(((Variable) o).getName().toUpperCase()));

		return false;
	}    

	@Override
	public int hashCode() {
		try {
			return this.variableName.toUpperCase().hashCode();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public String getSemantics() {
		return null;
	}

	@Override
	public String getDataObjectName() {
		return variableName;
	}

	//	@Override
	//	public String getAtTime(int t) {
	//		return getIntAtTime(t);
	//	}
	@Override
	public String getAtTime(int t) {
		return "(" + variableName + " "+ t + ")";
	}

}
