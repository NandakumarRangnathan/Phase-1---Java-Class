package com.simplilearn.java.LinkedList;

import java.util.LinkedList;

public class LinkedListClass {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}	
	
	public static LinkedList insert(LinkedList list, int data) {
		
		Node new_node = new Node(data);		
		
		
		
		return list;
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
