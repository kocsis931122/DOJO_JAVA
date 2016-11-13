package filewriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			String oneLine;
			br = new BufferedReader(new FileReader("C:\\dev\\bfa\\javabigfinalassessment-kocsis931122\\persons.csv"));

			while ((oneLine = br.readLine()) != null) {
				System.out.println(oneLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
