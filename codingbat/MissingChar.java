package codingbat;

public class MissingChar {
	public static String removeCharAt(String s, int pos) {
		System.out.println(s.substring(0, 1) + s.substring(1 + 1));
		return s.substring(0, pos) + s.substring(pos + 1);
	}

	public static void main(String args[]) {
		String str = "this is Java";
		System.out.println(removeCharAt(str, 3));
	}

}
