package printNames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PrintNames {
	public enum Language {
		EN, HU
	}

	public static void main(String[] args) {
		try {

			// write object to file
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Vitya\\Desktop\\person.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// oos.writeObject(persons);
			oos.close();

			// read object from file
			FileInputStream fis = new FileInputStream("C:\\Users\\Vitya\\Desktop\\person.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person result = (Person) ois.readObject();
			ois.close();

			System.out.println(result);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
