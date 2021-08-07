package com.simplilean.java.HomeWork;

public class HW1Arrays {

	public static void main(String[] args) {
		 
		int[] array = new int[] {1,2,3,4,5};

		System.out.print("Norml for loop iteration : ");
		for(int i =0 ; i<5; i++) {
			System.out.print(array[i]+ " ");
		}
		
		System.out.println("\n");
		System.out.print("Norml for loop iteration using array.length(): ");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		
		System.out.println("\n");
		System.out.print("for each loop iteration using int : ");
		for(int i : array)
			System.out.print(i+" ");
		
		System.out.println("\n");
		System.out.print("for each loop iteration using var : ");
		for(var i : array)
			System.out.print(i+" ");
	}

}
