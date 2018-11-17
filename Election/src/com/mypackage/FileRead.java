package com.mypackage;

import java.io.File;
import java.io.FileInputStream;

public class FileRead {

	public void readFileContent() {

		try {
		File f = new File("C:\\Users\\Dep Bajracharya\\Desktop\\voting.dat");
		FileInputStream obj = new FileInputStream(f);
		int c;
		while ((c=obj.read())!= -1){
			char characterRead = (char)c;
			System.out.print(characterRead);
		}	
		
		}catch(Exception e) {
			System.out.println("File not Found");
		}
		
	}

}
