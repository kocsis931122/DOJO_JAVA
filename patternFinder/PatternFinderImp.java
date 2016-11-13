package patternFinder;

public class PatternFinderImp implements PatternFinder {
	@Override
	public int countPattern(int[] numbers, int... pattern) {
		int count = 0;
		int patternLength = pattern.length;
		if (pattern == null || numbers == null || pattern.length == 0 || numbers.length == 0
				|| (pattern.length > numbers.length)) {
			return count;
		}
		for (int i = 0; i <= numbers.length - patternLength; i++) {
			boolean match = true;
			for (int j = 0; j < patternLength; j++) {
				if (pattern[j] != numbers[i + j]) {
					match = false;
					break;
				}
			}
			if (match)
				count++;
			i += patternLength - 1;
		}
		return count;
	}
}
