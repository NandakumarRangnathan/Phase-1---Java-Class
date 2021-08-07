package com.simplilearn.java.Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LearnSerialize {
	
	public static void main(String []a) {
		
		Product p = new Product("LG", 50000);
		p = new Product("SamSung", 20000000);
		
		try {
			//Serailization
			FileOutputStream  fos = new FileOutputStream("C:\\Needs\\Simplilearn\\Day6Class\\src\\com\\simplilearn\\java\\Serialize\\Brands.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			
			oos.close();
			fos.close();
			
			//De-Serialization
			FileInputStream fis = new FileInputStream("C:\\Needs\\Simplilearn\\Day6Class\\src\\com\\simplilearn\\java\\Serialize\\Brands.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Product p1 = (Product) ois.readObject();
			
			System.out.println(p1.brand);
			System.out.println(p1.price);
			
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int price;
	String brand;
	
	Product(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
}