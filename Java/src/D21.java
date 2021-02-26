
import java.util.Arrays;
//https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
public class D21 {

	public static void main(String[] args) {
		System.out.println(sum(new int[] { 1, 2, 3, 4, 5 }));
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num > 0 ? num : 0;
		}

		return sum;
	}
	
    public static int sumUsingStream(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

}
