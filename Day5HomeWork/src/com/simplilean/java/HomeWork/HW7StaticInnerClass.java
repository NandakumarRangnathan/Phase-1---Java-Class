package com.simplilean.java.HomeWork;

import com.simplilean.java.HomeWork.Mathametics.Addition;

public class HW7StaticInnerClass {

	public static void main(String[] args) {

		//Mathametics m = new Mathametics();
		//Mathametics.Addition ma = new Addition();

		System.out.println(Mathametics.Addition.addition(1, 2));
		System.out.println(Addition.addition(10, 20));

		HW7StaticInnerClass ic = new HW7StaticInnerClass();
		HW7StaticInnerClass.course c = ic.new course();
		c.sysout();

	}

	class course {
		public void sysout() {
			System.out.println("welcome to Course");
		}
	}

}
