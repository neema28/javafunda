package com.controller.Q8;

import com.controller.Q9.Employee9;

public class Demo {
	
	public static void  show(Employee9 es) {		 
		es.setId(101);
		es.setPrice(es.getPrice()+100);
	    System.err.println("show--" +es.getPrice());
	}

	
	 public static void main(String[] args) {
		 Employee9 e3 = new Employee9(100, "sam", 200);
		 //e3.setPrice(0);	
		 //Demo.show(e3);		 	 
		 System.out.println(e3.getPrice()+100);
		//Demo d = new Demo();	//Q-10
		 //d.show(e3);
		//  show(e3); //Q-11
		
	 }
}
