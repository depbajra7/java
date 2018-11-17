package fileOutputStream;

import java.io.File;
import java.io.FileOutputStream;

public class Program {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:/Users/Dep Bajracharya/Desktop/demo.txt");
		FileOutputStream fos = new FileOutputStream(f);
		
		String s = "This is a demo again. ";
		byte[] b = s.getBytes();
		fos.write(b);
		
	}

}
