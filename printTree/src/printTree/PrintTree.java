package printTree;

public class PrintTree {

	public static void printNiceText(String text) {
		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length - i; j++)
				System.out.print(" ");
			for (int k = 0; k < (2 * i + 1); k++)
				System.out.print(chars[i]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printNiceText("apacuka");
	}

}
