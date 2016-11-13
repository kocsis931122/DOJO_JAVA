package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		// HashSet<String> set = new HashSet<String>();
		// for (int i = 0; i < array1.length; i++) {
		// for (int j = 0; j < array2.length; j++) {
		// if (array1[i].equals(array2[j])) {
		// set.add(array1[i]);
		// }
		// }
		// }
		// return set;
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(array1));
		System.out.println("list1: " + list1);
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(array2));
		System.out.println("list2: " + list2);
		list1.retainAll(list2);
		for (String string : list2) {
			System.out.println(string);
		}
		return null;
	}

}
