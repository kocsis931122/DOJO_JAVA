package dojoStringSplitter;

import java.util.ArrayList;
import java.util.List;

public class StringSplitter {

	public static String[] stringSplitter(String text, int rowLength) {
		String[] splitted = text.split(" ");
		List<String> resultList = new ArrayList<>();
		String row = "";

		for (String string : splitted) {
			if (string.length() + row.length() > rowLength) {
				resultList.add(row.trim());
				row = string + " ";
			} else {
				row += string + " ";
			}
		}
		resultList.add(row);
		return (String[]) resultList.toArray(new String[resultList.size()]);

	}

	public static void main(String[] args) {
		String[] splitted = StringSplitter.stringSplitter("I am a codecooler", 4);
		for (String string : splitted) {
			System.out.println(string);
		}
	}
}
