package com.simplilearn.java.features;


interface ISalary {
	
	int getHRA(int basic);
	int getBonus();
	int a = 23_34_45;
	default void MyCompany() {
		System.out.println("Default method");
	};
	
	static void TestCompany() {
		System.out.println("static method");
	}
}


class TSPL implements ISalary{

	@Override
	public int getHRA(int basic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


public class InterfaceClass {

	public static void main(String[] args) {

		TSPL tspl = new TSPL();
		tspl.MyCompany();
		
		ISalary.TestCompany();
		System.out.println(ISalary.a);

	}

}
