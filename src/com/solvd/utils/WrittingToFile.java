package com.solvd.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WrittingToFile {
	
	
	public void writeTorFile(String path, String value) {
		
		File file = new File(path);
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.println(value);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
 
}
