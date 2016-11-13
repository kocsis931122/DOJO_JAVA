package shuffleinstring;

import java.util.Random;

public class ShuffleInString {
	public static String shuffle(String input) {
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			if (word.length() > 3) {
				char firstChar = word.charAt(0);
				char lastChar = word.charAt(word.length() - 1);
				word = shuffleWord(word.substring(1, word.length() - 1));
				word = firstChar + word + lastChar;
			}
			result.append(word);
			result.append(" ");
		}
		return result.toString();
	}

	public static String shuffleWord(String word) {
		Random rand = new Random();
		String result = word;
		for (int i = 0; i < result.length(); i++) {
			result = swapChars(result, i, rand.nextInt(result.length()));

		}
		return result;
	}

	public static String swapChars(String word, int charIndex1, int charIndex2) {
		if (charIndex1 == charIndex2) {
			return word;
		}
		char[] chars = word.toCharArray();
		char temp = chars[charIndex1];
		chars[charIndex1] = chars[charIndex2];
		chars[charIndex2] = temp;
		String result = new String(chars);

		return result;
	}

	public static void main(String[] args) {
		// String result = "hányingerem van, 1956-os kiírt Zsigmond.";
		String result = "A film elkészítéséhez az 1956os emlékévre kiírt Zsigmond Vilmos pályázat";
		System.out.println(shuffle(result));
	}
}
