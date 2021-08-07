package com.simplilean.java.HomeWork;

import java.util.Scanner;

public class HW6AgeValidate {

	public static void main(String[] args) {

		int age;
		boolean valid = false;
		Scanner obj = new Scanner(System.in);

		do {
			System.out.println("1. Please enter your Age : ");
			age = obj.nextInt();
			
			if(age <= 0 || age >= 100) {
				System.out.println("Please enter a valid age");
			}			
			else 
			{
				System.out.println("Valid age.");
				valid = true;
			}
		} while(!valid);
		
		valid = false;
		while(!valid) {
			System.out.println("2. Please enter your Age : ");
			age = obj.nextInt();
			
			if(age <= 0 || age >= 100) {
				System.out.println("Please enter a valid age");
				continue;
			}			
			else 
			{
				System.out.println("Valid age.");
				//valid = true;
				break;
			}
		};
		
		obj.close();

	}

}
