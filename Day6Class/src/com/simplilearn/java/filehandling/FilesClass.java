package com.simplilearn.java.filehandling;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilesClass {

	public static void main(String[] args) {

		try {
			
			/*
			 * var allLines = Files.readAllLines(Paths.get(
			 * "C:\\Needs\\Simplilearn\\Day6Class\\src\\com\\simplilearn\\java\\filehandling\\Task.txt"
			 * ));
			 * 
			 * for(var i : allLines) System.out.println(i);
			 */
			
			//varaible declaration
			boolean isValid = false;
			Scanner sc = new Scanner(System.in);
			String name = null;
			//int score = 0;
			List<Integer> al = new ArrayList<Integer>();
			var scoreList = Files.readAllLines(Paths.get("C:\\Needs\\Simplilearn\\Day6Class\\src\\com\\simplilearn\\java\\filehandling\\ScoreFile.txt"));
			
			//Reading from console
			System.out.println("Enter the Student Name : ");
			name = sc.nextLine();
			
			//Looping through to identify the student name
			for(var i : scoreList) {
				var data = i.split(",");
				/*
				 * if(name.equalsIgnoreCase(data[0])) { score = Integer.parseInt(data[1]);
				 * isValid = true; break; }
				 */
				
				if(name.equalsIgnoreCase(data[0])) {
					al.add(Integer.parseInt(data[1]));
					isValid = true;
				}
			}
			
			//Printing output
			if(isValid) {
				System.out.println("Score of "+name+" is : ");
				for(int i : al) {
					System.out.println(i);
				}
			} else {
				System.out.println("we dont find the student named : "+name+" OR student might be ABSENT for exam");
			}
			
			sc.close();
			
		}catch(Exception e) {}

	}

}
