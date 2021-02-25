import java.util.ArrayList;
import java.util.Arrays;

public class D19 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(accum("ZpglnRxqenUss"));

	}

	public static String accum(String s) {
		ArrayList<String> accumArr = new ArrayList<>(Arrays.asList(s.split("")));
		String stringToReturn = "";

		for (int indexAcumArr = 0; indexAcumArr < accumArr.size(); indexAcumArr++) {
			String appendThis = accumArr.get(indexAcumArr).toUpperCase();
			stringToReturn += appendThis;
			appendThis = appendThis.toLowerCase();
			for (int repeatXTimes = 0; repeatXTimes < indexAcumArr; repeatXTimes++) {
				stringToReturn += appendThis;
			}

			stringToReturn += "-";
		}

		return stringToReturn.substring(0, stringToReturn.length() - 1);

	}

	public static String accumSimple(String s) {
		String result = "";
		for (int i = 0; i != s.length(); i++) {
			for (int j = 1; j != i + 2; j++)
				result = result + (j == 1 ? s.toUpperCase().charAt(i) : s.toLowerCase().charAt(i));
			result = result + (i != s.length() - 1 ? '-' : "");
		}
		return result;
	}
}
