package jÄ¿Â¼¿½±´×÷Òµ;

import java.io.File;

public class ContentCopy {
	
	
	static File[] files;
	
	public static void getFile(File file) {
		
		files = file.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			if (files[i].isDirectory()) {
			getFile(file);
		}
		}
		
		
	}
	public static void main(String[] args) {
		
		File file = new File("F:\\Internship");
		
		getFile(file);
		
		for (File f : files) {
			System.out.println(f.getName());
		}
	}

}
