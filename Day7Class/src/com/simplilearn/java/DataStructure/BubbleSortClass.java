package com.simplilearn.java.DataStructure;

public class BubbleSortClass {

	public static void main(String[] args) {
		
		int[] dat = new int[] {34,55,12,45,24,90,87,88,45,100,93};
		int temp, k=1, max = dat.length;
		
		for(int i=max-1; i>=0; i--) {
			
			System.out.println("Iteration : "+k);
			
			for(int j=0; j<i; j++) {
				if(dat[j] > dat[j+1]) {
					temp = dat[j];
					dat[j]=dat[j+1];
					dat[j+1] = temp;
					
					System.out.print(j+" - "+temp+" ");
					System.out.print(j+" - "+dat[j]+" ");
					System.out.print(j+" - "+dat[j+1]+" ");
					System.out.println("\n");
					
				}
			}
			k++;
			//System.out.println("\n");
		}
		
		for(var i : dat)
			System.out.println(i);
		
	}

}
