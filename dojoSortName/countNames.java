package dojoSortName;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class countNames {
	static void fileToHashSet(String path, HashSet<String> set) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(path));
			while (in.readLine() != null) {
				String line = in.readLine();
				set.add(line);
			}
			in.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

	public static void main(String[] args) {
		// The name of the file to open.
		String fileName = "C:\\Users\\Vitya\\Desktop\\names.txt";
		List<String> myList = new ArrayList<String>();
		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				
				myList.add(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");

			// Or we could just do this:
			// ex.printStackTrace();

			// Scanner s = new Scanner(new
			// File("C:\\Users\\Vitya\\Desktop\\names.txt"));
			// ArrayList<String> list = new ArrayList<String>();
			// while (s.hasNext()) {
			// list.add(s.next());
			// }
			// s.close();
			// System.out.println(list);

			// BufferedReader br = null;
			//
			// try {
			//
			// String sCurrentLine;
			//
			// br = new BufferedReader(new
			// FileReader("C:\\Users\\Vitya\\Desktop\\names.txt"));
			//
			// while ((sCurrentLine = br.readLine()) != null) {
			// System.out.println(sCurrentLine);
			// }
			//
			// } catch (IOException e) {
			// e.printStackTrace();
			// } finally {
			// try {
			// if (br != null)
			// br.close();
			// } catch (IOException ex) {
			// ex.printStackTrace();
			// }
			// }
			//
			// File file = new File("C:\\Users\\Vitya\\Desktop\\names.txt");
			// try (Scanner sc = new Scanner(new FileInputStream(file))) {
			// int count = 0;
			// while (sc.hasNext()) {
			// sc.next();
			//
			// count++;
			// }
			// System.out.println("Number of names: " + count);
			// }

		}
	}
}
