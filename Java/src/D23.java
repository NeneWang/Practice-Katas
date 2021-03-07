
//https://www.codewars.com/kata/5f0ed36164f2bc00283aed07/train/javascript

public class D23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(overTheRoad(1, 3)); // 6
		System.out.println(shortedOverTheRoad(3, 3)); // 4
		System.out.println(overTheRoad(2, 3)); // 5
		System.out.println(overTheRoad(3, 5)); // 8

	}

	public static long overTheRoad(long address, long n) {
		long answer, k;
		if (address % 2 == 0) {
			k = (address-2*n)/(-2);
			answer = 1 + 2*k;
		} else {
			k = (address - 1) / 2;
			answer = n*2- (2 * k);
		}
		return answer;
	}
	
	public static long shortedOverTheRoad(long address, long n) {
		return address%2==0?1 + 2*((address-2*n)/(-2)): (n*2- (2 * (address - 1) / 2));
	}

}
