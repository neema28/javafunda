package com.controller.Q35;

public class Demo35 {
	static int total = 90;

	public static void add() {  
		total = 10 + 30; // override the static variable //Q-36
		 int total = 10 + 30; // intialize new total variable
		   
	}

	public static void main(String[] args) {
		Demo35.add();
		System.out.println(total +"---total");
	}

}
