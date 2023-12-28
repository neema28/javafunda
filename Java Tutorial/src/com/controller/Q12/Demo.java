package com.controller.Q12;

public class Demo {

	  static int total =20;
	
	public void show() {
		total = 10;
		System.err.println( total);
	}
	
	
	public static void main(String[] args)  {
		 total=60;
		System.err.println(Demo.total);
		System.err.println( total);
		Demo d = new Demo();
		d.total=52;
		d.show();
		 
		
		 
		 
		 
		
	}
}
