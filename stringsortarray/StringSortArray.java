package stringsortarray;

import java.util.Arrays;

public class StringSortArray {
	/*
	 * String -> only letters -> alphabetical order -> remove duplicates ->
	 * create char[] -> generate output like this: ['a', 'b', 'c', 'A', 'B']
	 * ['b', 'c', 'A', 'B', 'a'] ['c', 'A', 'B', 'a', 'b'] ['A', 'B', 'a', 'b',
	 * 'c'] ['B', 'a', 'b', 'c', 'A']
	 */

	static final String ALPHABET = "aábcdeéfghiíjklmnoóöõpqrstuúüûvwxyzAÁBCDEÉFGHIÍJLMNOÓÖÕPQRSTUÚÜÛVWXYZ";

	// public static String filterNonLetters(String yourString) {
	// StringBuilder stringWithOnlyLetters = new StringBuilder();
	//
	// for (int i = 0; i < yourString.length(); i++) {
	// char actualChar = yourString.charAt(i);
	// if (Character.isAlphabetic(actualChar)) {
	// stringWithOnlyLetters.append(actualChar);
	// }
	// }
	//
	// return stringWithOnlyLetters.toString();
	// }

	public static char[][] generateMatrix(char[] yourCharArray) {
		char[][] result = new char[yourCharArray.length][yourCharArray.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = yourCharArray[(j + i) % result[i].length];
			}
		}

		return result;
	}

	public static String toAlphabeticalOrder(String text) {
		StringBuilder alphabeticalString = new StringBuilder();
		for (int i = 0; i < ALPHABET.length(); i++) {
			if (text.contains(String.valueOf(ALPHABET.charAt(i)))) {
				alphabeticalString.append(ALPHABET.charAt(i));
			}
		}
		return alphabeticalString.toString();
	}

	public static void main(String[] args) {

		String yourString = "bcaABabaC?";
		char[] inputForGenerateMatrix = toAlphabeticalOrder(yourString).toCharArray();
		char[][] matrix = generateMatrix(inputForGenerateMatrix);
		for (char[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		// System.out.println(Arrays.toString(toAlphabeticalOrder(yourString).toCharArray()));

	}
}
