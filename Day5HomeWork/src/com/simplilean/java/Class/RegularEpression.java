package com.simplilean.java.Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEpression {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[A-Za-z]{2,3}");
		Matcher m = p.matcher("INd");
		
		if(m.matches()){
			System.out.println("Pattern Matched");
		}
		else {
			System.out.println("Pattern not matched");
		}
		
		
		Pattern p1 = Pattern.compile("nan[0-9]+");
		Matcher m1 = p1.matcher("nan3");
		
		if(m1.matches()){
			System.out.println("1. Pattern Matched");
		}
		else {
			System.out.println("2. Pattern not matched");
		}
	}

}
