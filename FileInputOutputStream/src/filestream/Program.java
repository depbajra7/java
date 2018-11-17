package filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class Program {
	
	public static void main(String[] args) throws Exception {
		
		
		File f = new File("C:/Users/Dep Bajracharya/Desktop/demo.txt");
		FileInputStream fis = new FileInputStream(f);
	
		
		int c;
		while((c=fis.read())!= -1) {
			char characterRead = (char)c;
			System.out.print(characterRead);
		}
	}
}
