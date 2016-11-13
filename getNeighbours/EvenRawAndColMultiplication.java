package getNeighbours;

import java.util.Arrays;
import java.util.List;

public class EvenRawAndColMultiplication {

	static int[][] field = new int[][] { { 2, 4, 8, 3 }, { -5, 6, 7, 9, 1, -8 }, { 10 }, { 11, 2, 7 }, { 12, 20, -1 },
			{ 1, 2, 4 }, };

	public int[] toIntArray(List<Integer> resultList) {
		int[] resultArray = new int[resultList.size()];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = resultList.get(i);
		}
		return resultArray;
	}

	public int[][] rowMultiplication(int[][] array) {
		for (int i = 1; i < field.length; i = i + 2) {
			for (int j = 0; j < field[i].length; j++) {
				array[i][j] *= -1;
			}

		}
		for (int i = 0; i < field.length; i++) {
			for (int j = 1; j < field[i].length; j = j + 2) {
				array[i][j] *= -1;
			}

		}

		return array;

	}

	public static void main(String[] args) {
		EvenRawAndColMultiplication nb = new EvenRawAndColMultiplication();
		int[][] result = nb.rowMultiplication(field);
		for (int[] is : result) {
			System.out.println(Arrays.toString(is));
		}
	}
}
