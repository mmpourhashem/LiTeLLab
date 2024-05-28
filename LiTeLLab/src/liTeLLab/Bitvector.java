package liTeLLab;

public class Bitvector {
	private String name;
	private String value;

	public Bitvector(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public boolean getAtTime(int time) {
		if ((value.length() - time - 1) < 0)
			return false;
		char ch = value.charAt(value.length() - time - 1);
		if (ch == '0')
			return false;
		if (ch == '1')
			return true;
		throw new IllegalArgumentException("Error in parsing Z3 output.");
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + "=" + value;
	}
}
