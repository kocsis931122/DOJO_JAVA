package splitarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*1. Generate n random integers(between 0 and 20) and store them in an array
2. Write a method which gets an array of integers and splits
 it to as few sub-arrays (keeping the order) as possible, but
  these sub-arrays must not contain duplications
*/
public class SplitArrays {
	public static int[] generateRandomNums(int n) {

		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 20);
		}
		return numbers;
	}

	public static Integer[][] splitter(int[] array) {
		List<Integer[]> resultList = new ArrayList<>();
		List<Integer> subList = new ArrayList<>();
		for (int i : array) {
			if (!subList.contains(i)) {
				subList.add(i);
			} else {
				Integer[] subArray = subList.toArray(new Integer[1]);
				resultList.add(subArray);
				subList.clear();
				subList.add(i);
			}
		}
		Integer[] subArray = subList.toArray(new Integer[1]);
		resultList.add(subArray);
		return resultList.toArray(new Integer[1][]);
	}

	public static void main(String[] args) {
		int[] randoms = generateRandomNums(20);
		System.out.println(Arrays.toString(randoms));
		Integer[][] result = splitter(randoms);
		for (Integer[] is : result) {
			System.out.println(Arrays.toString(is));
		}
	}
}
