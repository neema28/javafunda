package com.controller.Q33;
 

import com.controller.Q7.Employee7;

public class Demo33 {
	public static void show(Employee7 e){
		 
		System.out.println(e.getId() +"--" +e.getName()+"---" +e.getPrice() ); 
		System.out.println("Its show method");
		
	}
	public static void process(){
		System.out.println("Its process method");
	}

	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		//add data into that empty object using process method
		//display employee object with data in show method
		
		
		process();
		Employee7 e = new Employee7();;
		 
		show(e);
		e.setId(14);
		e.setName("Retail");
		e.setPrice(6500);
		
		 
         System.out.println("Created empty immutable list: "+e);  
         //Try to add elements 
          
	}

}
