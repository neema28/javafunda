package com.controller.Q44;

public class Demo44 {
	public static void main(String[] args) {
		String str = "Hello Welcome";
		//print index of first 'l' after 'W'
		 
		 
		str = str.substring(str.indexOf(" ")+1,str.length()-1);
		 System.out.print(str.indexOf("l"));
	}

}
