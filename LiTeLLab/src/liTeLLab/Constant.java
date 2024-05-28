/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public class Constant extends TemporalTerm{

	private int value;
	
	public Constant() {
	}

	public Constant(int value) {
		this.value = value;
		Model.updateCMax(value);
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return Integer.toString(value) + ".0";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Constant)
			return (value != ((Constant) o).getValue());
		
		return false;
	}    

	@Override
	public int hashCode() {
		try {
			return Integer.toString(this.value).toUpperCase().hashCode();
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
		return Integer.toString(value);
	}

//	@Override
//	public String getAtTime(int t) {
//		return "(concat (_ bv" + value + " " + Model.getClockBVSize() + ") (_ bv0 " + Model.getFrBVSize() + "))";   
//	}
	
//	@Override
//	public String getAtTime(int t) {
//		return "(_ bv" + value + " " + Model.getClockBVSize() + ")";   
//	}
	
	@Override
	public String getAtTime(int t) {
		return Integer.toString(value);
	}

}
