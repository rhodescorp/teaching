package edu.rcc.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

	
	public static void writeFile(File f, ArrayList<String> fileContents) {
		if (f == null) {
			return;
		}
		
		if(f.getParentFile() != null) {
			f.getParentFile().mkdirs();
		}
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
			for (String line : fileContents) {
				writer.write(line + System.lineSeparator());
			}
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static ArrayList<String> readFile (File f) {
		if(!f.exists()) {
			return null;
		}
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String line = null;
			do {
				line = reader.readLine();
				if (line == null) {
					break;
				}
				result.add(line);
			} while (line != null);
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return result;
	}
	
	
	
	
	
	
}
