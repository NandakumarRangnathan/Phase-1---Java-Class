package com.simplilean.java.Class;

import java.util.Scanner;

public class CommonMaths {

	public static void main(String[] args) {

		int course = 0, a = 0, b = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Addition");
		System.out.println("2. Subtaction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Tables");

		System.out.println("Please enter course number from above list : ");
		course = sc.nextInt();

		if (course > 5 || course < 1) {
			System.out.println("Please enter correct option to go");
			course = sc.nextInt();
		} else {

			if (course != 5) {
				System.out.println("Enter 2 number ");
				a = sc.nextInt();
				b = sc.nextInt();
			} else {
				System.out.println("Enter the number for tables ");
				a = sc.nextInt();
			}

			switch (course) {

			case 1:
				System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
				break;
			case 2:
				System.out.println("Subtraction  of " + a + " and " + b + " is : " + (a - b));
				break;
			case 3:
				System.out.println("Multiplication  of " + a + " and " + b + " is : " + (a * b));
				break;
			case 4:
				System.out.println("Division  of " + a + " and " + b + " is : " + (a / b));
				break;
			case 5:
				System.out.println("Multiplication for " + a + " is :");
				for (int i = 0; i <= 10; i++)
					System.out.println(a + " X " + i + " = " + (a * i));
				break;
			default:
				System.out.println("Please enter correct option to go");
				break;

			}
		}

		sc.close();
	}

}
