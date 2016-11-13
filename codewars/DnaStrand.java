package codewars;

public class DnaStrand {
	public static String makeComplement(String dna) {
		char[] charArray = dna.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'A') {
				charArray[i] = 'T';
			} else if (charArray[i] == 'T') {
				charArray[i] = 'A';
			}
			if (charArray[i] == 'C') {
				charArray[i] = 'G';
			} else if (charArray[i] == 'G') {
				charArray[i] = 'C';
			}
		}
		return dna = new String(charArray);
	}

	public static void main(String[] args) {
		System.out.println(DnaStrand.makeComplement("ASDTT"));
	}
}
