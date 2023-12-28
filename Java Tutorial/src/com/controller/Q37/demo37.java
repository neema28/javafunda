package com.controller.Q37;

import java.util.ArrayList;

public class demo37 {
	public static String reverseString(String str){
		//reverse str string here and return
		 
//		StringBuilder sb = new StringBuilder(str);
//		sb.reverse();
//		return sb.toString();
		 
		
		
		char[] resultarray = str.toCharArray();
		int sl = str.length();
		for(sl=sl; sl>0; sl--) {
			 
			System	.out.print(str.charAt(sl-1));			
			 
		}
		System	.out.println( );
		return str;
		
		
		
		
	}
	public static void main(String[] args) {
		String str = "Hello Welcome";
		String reversedString = reverseString(str);
		System.out.println (reversedString);
	}

}
