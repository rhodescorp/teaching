package edu.rcc.main;

import java.io.File;
import java.util.ArrayList;

import edu.rcc.fileio.FileHandler;

public class TestFiles {

	public static void main(String[] args) {

		String fileName = "c:/foo.txt";
		ArrayList<String> fileContents = 
				FileHandler.readFile(new File(fileName));
		for (String line : fileContents) {
			System.out.println(line);
		}
		//print a specific line
		System.out.println("Third line = " + fileContents.get(3));
		
		//find a line that contains a word
		String line = null;
		for (int i = 0; i < fileContents.size(); ++i) {
			if (fileContents.get(i).contains("thursday")) {
				line = fileContents.get(i);
				break;
			}
		}
		if (line == null) {
			System.out.println("no line contains thursday");
		} else {
			System.out.println(line);
		}
		
		File outFile = new File("c:/bar/foobar.txt");
		FileHandler.writeFile(outFile, fileContents);
		
	}

}
