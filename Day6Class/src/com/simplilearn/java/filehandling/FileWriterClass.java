package com.simplilearn.java.filehandling;

import java.io.FileWriter;

public class FileWriterClass {

	public static void main(String[] args) {

		try {

			FileWriter fw = new FileWriter("C:\\Needs\\Simplilearn\\Day6Class\\src\\com\\simplilearn\\java\\filehandling\\Task.txt", true);
			fw.write("\n Gopal,95");
			fw.close();
			
		} catch (Exception e) {
		}

	}

}
