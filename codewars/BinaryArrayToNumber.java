package codewars;

import java.util.List;

public class BinaryArrayToNumber {
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		int result = 0;
		if (binary.get(0) == 1) {
			result += 8;
		}
		if (binary.get(1) == 1) {
			result += 4;
		}
		if (binary.get(2) == 1) {
			result += 2;
		}
		if (binary.get(3) == 1) {
			result += 1;
		}
		return result;

	}

}
