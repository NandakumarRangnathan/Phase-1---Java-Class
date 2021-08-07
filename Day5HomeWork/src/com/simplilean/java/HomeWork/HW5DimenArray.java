package com.simplilean.java.HomeWork;

public class HW5DimenArray {

	public static void main(String[] args) {

		int[][] array = new int[][] {{1,2},{3,4},{5,6}};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<2; j++)
				System.out.print(array[i][j] +" ");
			System.out.println("\n");
		}

		System.out.println("If we dont know the Dimensional array size :\n");
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++)
				System.out.print(array[i][j] +" ");
			System.out.println("\n");
		}
	}

}
