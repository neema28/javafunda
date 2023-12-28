package com.controller.Q43;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo43 {
	
	public static int calculateLength(String str){
		//calculate length here and don't use length function of string class
//		Matcher m = Pattern.compile("$").matcher(str);
//		m.find();
//		int length = m.end();
//		return length;
		str = str + '\0';
		System.err.println(str.length());
		int count = 0;

	    for (int i = 0; str.charAt(i) != '\0'; i++) {
	        count++;
	    }

	    return count;
	}
	public static void main(String[] args) {
		String str = "Hello how are you shyam?";
		int len = calculateLength(str);
		System.out.println(len);
	}

}
