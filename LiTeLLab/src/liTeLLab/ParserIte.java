package liTeLLab;

import java.util.ArrayList;

public class ParserIte {

	private String iStr, tStr, eStr;
	private ParserIte eIte;
	public ParserIte(String iteStr) {
		super();
		if (!iteStr.startsWith("(ite"))
			throw new IllegalArgumentException("Wrong ite format.");
		if (iteStr.substring(4).contains("(ite")) {
			int firstIndex = iteStr.indexOf("(ite");
			int secondIndex = iteStr.indexOf("(ite", firstIndex + 1);
			String tmp = iteStr.substring(firstIndex + "(ite".length(), secondIndex);
			String[] s = tmp.split(" ");
			iStr = s[3].replaceAll("\\)", "");
			tStr = s[4].replaceAll("\\)", "");
			eIte = new ParserIte(iteStr.substring(secondIndex));
		}
		else {
			String[] s = iteStr.split(" ");
			iStr = s[3].replaceAll("\\)", "");
			tStr = s[4].replaceAll("\\)", "");
			eStr = s[5].replaceAll("\\)", "");
		}
	}

	public double[] getRealArray(int size) {
		double[] result = new double[size];
		ArrayList<Integer> indexes = new ArrayList<Integer>();

		double valueForOtherIndexes;
		ParserIte tmp = this;
		while(true) {
			int index = Integer.parseInt(tmp.getiStr());
			if (index >=0 && index < size)
				result[index] = Double.parseDouble(tmp.gettStr());
			indexes.add(Integer.parseInt(tmp.getiStr()));
			if (tmp.geteStr() != null && tmp.geteStr().length() > 0) {
				valueForOtherIndexes = Double.parseDouble(tmp.geteStr());
				break;
			}
			tmp = tmp.geteIte();
		}
		for (int i = 0; i < size; i++)
			if (! indexes.contains(i))
				result[i] = valueForOtherIndexes;

		return result;

	}
	
	public int[] getIntArrayFromBV(int size) {
		int[] result = new int[size];
		ArrayList<Integer> indexes = new ArrayList<Integer>();

		int valueForOtherIndexes;
		ParserIte tmp = this;
		while(true) {
			int index = Integer.parseInt(tmp.getiStr());
			if (index >=0 && index < size)
				result[index] = bvToInt(tmp.gettStr());
			indexes.add(Integer.parseInt(tmp.getiStr()));
			if (tmp.geteStr() != null && tmp.geteStr().length() > 0) {
				valueForOtherIndexes = bvToInt(tmp.geteStr());
				break;
			}
			tmp = tmp.geteIte();
		}
		for (int i = 0; i < size; i++)
			if (! indexes.contains(i))
				result[i] = valueForOtherIndexes;

		return result;
	}
	
	public static int bvToInt(String str) {
        if (str.startsWith("#b")) {
            return Integer.parseInt(str.substring(2), 2);
        } else if (str.startsWith("#x")) {
            return Integer.parseInt(str.substring(2), 16);
        } else {
            throw new IllegalArgumentException("Invalid format");
        }
    }
	
	public String getiStr() {
		return iStr;
	}

	public String gettStr() {
		return tStr;
	}

	public String geteStr() {
		return eStr;
	}

	public ParserIte geteIte() {
		return eIte;
	}

}
