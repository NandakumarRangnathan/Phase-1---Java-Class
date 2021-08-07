package com.simplilearn.java.Thread;

public class ThreadClass extends Thread {

	public void run() {
		System.out.println("Therad is running");
	}
	
	public static void main(String[] args) {
		
		ThreadClass t = new ThreadClass();
		t.start();
		
	}

}
