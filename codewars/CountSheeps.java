package codewars;

public class CountSheeps {
	public int countSheeps(Boolean[] arrayOfSheeps) {
		int count = 0;
		for (Boolean b : arrayOfSheeps) {
			if (b != null && b.booleanValue()) {
				count++;
			}
		}
		return count;
	}
}
