package patternFinder;

public class Main {
	public static void dumpPatternCount(PatternFinder patternFinder) {

	}

	public static void main(String[] args) {
		int[] numbersArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 1, 2, 8, 9 };
		PatternFinder patternFinder = new PatternFinderImp();
		// Main.dumpPatternCount(patternFinder);
		System.out.println(patternFinder.countPattern(numbersArray, 1, 2) + " occurences");
	}

}
