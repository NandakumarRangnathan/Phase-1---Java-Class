package com.simplilearn.java.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class LinearSearchClass {

	public static void main(String[] args) {

		@SuppressWarnings("serial")
		List<Integer> al = new ArrayList<Integer>() {
			{
				add(78);
				add(34);
				add(90);
				add(86);
				add(99);
				add(23);
				add(65);
				add(76);
				add(12);
				add(45);
				add(65);
				add(120);
			}
		};

		List<Integer> al1 = Arrays.asList(12, 45, 23, 43, 242, 56, 67, 232, 235, 674, 4223, 77, 90, 100);

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Search Element : ");
		int j = obj.nextInt();
		boolean isFound = false;
		
		for (var i : al) {
			//System.out.println(i);
			if(i == j) {
				System.out.println("Element found in list");
				isFound = true;
			    break;
			}
		}
		
		if(!isFound)
			System.out.println("Element not found");
	}

}
