package com.simplilearn.java.DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class BinarySearchClass {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

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
		}};

//		for(var i : ts)
//			System.out.println(i);
		
		
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
		
		Collections.sort(al);
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter search number : ");
		int search = obj.nextInt();
		
		int low=0, high=al.size(), mid = (low+high)/2;
		boolean isFound = false;
		
		while(true) {//al.contains(search)
			
			if(al.get(mid) == search) {
				System.out.println("Found "+search+" at : "+mid);
				break;
			}
			
			if(low == mid || high == mid) {
				System.out.println("Element not found");
				break;
			}
							
			if(search > al.get(mid))
				low = mid;
			else 
				high = mid;
			
			isFound = true;
			mid = (low+high)/2;
		}
		
		if(!isFound)
			System.out.println("We dont find the search element");
	}

}
