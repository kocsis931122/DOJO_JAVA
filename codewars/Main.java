package codewars;

import java.io.File;

public class Main {

	public File[] getExecutables(File directory) throws Exception {
		if (!directory.isDirectory()) {
			throw new Exception();
		}
		return directory.listFiles(new ExeFilter());
	}

	public static void main(String[] args) {
		Main m = new Main();
		try {
			File[] executables = m.getExecutables(new File("C:\\Windows"));
			for (File file : executables) {
				System.out.println(file.getAbsolutePath());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
