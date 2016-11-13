package codewars;

import java.io.File;
import java.io.FileFilter;

public class ExeFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		return (pathname.getName().toLowerCase().endsWith(".exe") && pathname.isFile());
			
		
	}

}
