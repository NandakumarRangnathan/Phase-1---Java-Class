package com.simplilearn.java;

import java.util.ArrayList;

public class Variables {

	
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    
	    for(int n : numbers)
	    	System.out.println("n= "+n);
	}

}
