package com.simplilearn.java.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {

	int id;
	String name;

	Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

public class LamdaExpClass {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(56, 72, 98, 89, 100, 44, 57, 76);

		for (var i : al)
			System.out.print(i + " ");

		System.out.println("\n");

		// ForEach method with Lambda expression. (->)
		al.forEach(i -> System.out.print(i + " "));

		List<Product> pl = new ArrayList<Product>() {
			{
				add(new Product(1, "Nanda"));
				add(new Product(2, "Nandakumar"));
				add(new Product(3, "Nadhiya"));
				add(new Product(4, "NadhiyaNanda"));
				add(new Product(5, "Kashvi"));
				add(new Product(6, "Tarun"));
			}
		};
		
		/*
		 * for(Product p : pl) System.out.println(p.id +" = "+p.name);
		 */
		
		
		pl.forEach(i -> System.out.println(i.id +" = "+i.name));

	}

}
