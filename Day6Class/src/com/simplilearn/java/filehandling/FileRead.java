package com.simplilearn.java.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		File fl = new File("C:\\Needs\\Simplilearn\\Day6Class\\src\\com\\simplilearn\\java\\filehandling\\Task.txt");
		
		System.out.println(fl.getName()); // Getting file name
		System.out.println(fl.getAbsolutePath());// Getting full path of file
		System.out.println(fl.getPath());
		
		FileReader fr = new FileReader(fl); // Reads character by character
		
		int i = fr.read();
		while(i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
		
		BufferedReader br = new BufferedReader(fr); // Reads line by line from file
		
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		fr.close();
		br.close();
	}

}
