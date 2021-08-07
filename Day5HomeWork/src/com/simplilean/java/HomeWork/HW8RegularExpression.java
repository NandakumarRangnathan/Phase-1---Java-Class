package com.simplilean.java.HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW8RegularExpression {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\w[a-zA-z]");
		Matcher m = p.matcher("andc adadas");

		if(m.matches())
			System.out.println("Pattern Valid");
		else 
			System.out.println("Invalid Pattern");
	}

}
