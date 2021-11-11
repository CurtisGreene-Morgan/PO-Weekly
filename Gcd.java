public class Gcd {
	public static int gcd(int[] array) {
		boolean containsOdd = false;
		boolean lastClear = false;
		int min = Integer.MAX_VALUE;
		
		for (int i : array) {
			if (i < min) {
				min = i;
			}
			
			if (i % 2 != 0) {
				containsOdd = true;
			}
		}
		
		if (min == 1) {
			return 1;
		}
		
		//If the array contains an odd number and the minimum is even, then not only can the gcf not be even, the min
		//can't be even either.
		if (containsOdd && (min%2 == 0)) {
			min -= 1;
		}
		
		//Trying every number from min to 1, high to low, to see if it's the array's gcf.
		//Will skip by 2s if min is odd.
		for (int i = min; i > 0; i -= (containsOdd)? 1:2) {
			System.out.println(i);
			for (int current : array) {
				if (current % i != 0) {
					lastClear = false;
					break;
				}
				lastClear = true;
			}
			if (lastClear) {
				return i;
			}
		}
		//Control should never reach this point. This line is here to make the compiler stop complaining about a missing
		//return statement.
		return -1;
	}
}
