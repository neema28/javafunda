package com.controller.Q38;

public class Demo38 {
	public static void main(String[] args) {
		String str = "Hello Welcome";
		//here print second character of str string for example e
		  
		System.out.println(str.charAt(6) );
		String stri = "boomoboomisthefoodom?";
		//Q-39 here print the index of 'o' character from str string
		System.out.println(stri.indexOf("o") );
		//Q-40 here print the index of last 'o' character from str string
		System.out.println(stri.lastIndexOf("o") );
		
		//Q-41 here print the index of third occurrence 'o' character from str string
		System.out.println(stri.indexOf("o",stri.indexOf("o") +2 ));
		
		//Q-42 here print number of occurrences of 'o' character from str string
 		 char co = 'o';
//		 int count = 0;
//		 for(int i =0; i<stri.length(); i++) {
//		 if(stri.charAt(i) == co) {
//			count++; 
//		 }
//		 }
//		System.out.println(count);
		
		System.err.println(stri.chars().filter(v->v == co).count());
	}


}
