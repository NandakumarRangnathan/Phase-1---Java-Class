package com.simplilean.java.Class;


public class InnerClass {

	public static void main(String[] args) {
		
		Mathametics m = new Mathametics();
		Mathametics.Addition  ma = m.new Addition();

		System.out.println(Mathametics.Addition.addition(1, 2));
		
		InnerClass ic = new InnerClass();
		InnerClass.course c = ic.new course();
		c.sysout();
		
		
	}

	class course{
		public void sysout() {
			System.out.println("welcome to Course");
		}
	}
}
