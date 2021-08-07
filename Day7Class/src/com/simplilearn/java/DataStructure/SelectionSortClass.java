package com.simplilearn.java.DataStructure;

public class SelectionSortClass {

	public static void main(String[] args) {
		
		int[] data = new int[] {71, 68, 89, 92, 54, 99};
		int max = data.length;
		
		for(int i=0; i<max; i++) {
			
			int index = i;
			for(int j =i+1; j<max; j++) {
				if(data[j] < data[index]) {
					index = j;
				}
			}
			
			int smallNumber = data[index];
			data[index] = data[i];
			data[i] = smallNumber;
		}
		
		//System.out.println("done");
		
		for(var i : data)
			System.out.println(i);
	
	}

}
