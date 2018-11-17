package inheritance;

import java.io.File;
import java.io.PrintWriter;


public class Program {
	public static void main(String[] args) {
		
		try {
			File file = new File("filename.txt");
			if (!file.exists()) {
				file.createNewFile();
				}
			
			PrintWriter pw = new PrintWriter(file);
			pw.println("this is my file content");
			pw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
