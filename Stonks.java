import java.util.Arrays;

public class Stonks {
	public static int maxProfit(int[] array) {
		
		/*int min = Integer.MAX_VALUE;
		int minCompromise = Integer.MAX_VALUE;
		int minCompromiseIndex = -1;
		int minIndex = -1;
		int max = Integer.MIN_VALUE;
		int maxCompromise = Integer.MIN_VALUE;
		int maxCompromiseIndex = -1;
		int maxIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
				minCompromise = min;
				minCompromiseIndex = minIndex;
			} else if (array[i] >= max) {
				//else if will pass over the first number, but the first number can't be max anyways or else you'd lose money
				//>= because we want the final index of the max if the max appears twice
				max = array[i];
				maxIndex = i;
				maxCompromise = max;
				maxCompromiseIndex = maxIndex;
			}
		}
		
		//Prevent time-traveling
		while (minIndex > maxIndex) {
			
			//Find the next lowest min
			for (int i = minIndex; i < 0; i--) {
				if (array[i] > min && array[i] < minCompromise) {
					minCompromise = array[i];
					minCompromiseIndex = i;
				}
			}
			
			//Find the next highest max
			for (int i = maxIndex; i < array.length; i++) {
				if (array[i] < max && array[i] < maxCompromise) {
					maxCompromise = array[i];
					maxIndex = i;
				}
			}
			
			if (max - maxCompromise > minCompromise - min) {
				max = maxCompromise;
				maxIndex = maxCompromiseIndex;
			} else {
				min = minCompromise;
				minIndex = minCompromiseIndex;
			}
		}
		
		return max-min;*/
		
		int maxProfit = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] - array[i] > maxProfit) {
					maxProfit = array[j] - array[i];
				}
			}
		}
		
		return maxProfit;
	}
}
