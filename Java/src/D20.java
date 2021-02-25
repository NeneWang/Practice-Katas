
import java.util.*;

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
public class D20 {

	public static void main(String[] args) {
		System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
	}

	public static String highAndLow(String numbers) {
		// Code here or
		ArrayList<String> accumArr = new ArrayList<>(Arrays.asList(numbers.split(" ")));
		List<Integer> numbersArr = new ArrayList<>();
		Iterator it = accumArr.iterator();
		if (accumArr.size() < 1) {
			return "Error";
		}

		int max = Integer.parseInt(accumArr.get(0)), min = max;
		while (it.hasNext()) {
			int element = Integer.parseInt((String) it.next());
			if (element > max) {
				max = element;
			}
			if (element < min) {
				min = element;
			}
		}
		System.out.println(numbersArr);
		return String.format("%d %d", max, min);
	}

	public static String HighAndLowSmart(String numbers) {

		int min = Arrays.stream(numbers.split(" ")).mapToInt(i -> Integer.parseInt(i)).min().getAsInt();

		int max = Arrays.stream(numbers.split(" ")).mapToInt(i -> Integer.parseInt(i)).max().getAsInt();

		return String.format("%d %d", max, min);
	}

//    Summary Statistics
	public static String HighAndLow(String numbers) {
		IntSummaryStatistics stats = Arrays.stream(numbers.split("\\s")).
				mapToInt(Integer::parseInt)
				.summaryStatistics();

		return String.format("%d %d", stats.getMax(), stats.getMin());
	}

}
