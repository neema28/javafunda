package com.controller.Q47;

public class Demo47 {

	
	  public void Animal() {
		System.out.println("Parent class");
	}
	  
	  public void legs()   {
		  System.out.println("Four class");
	  }
	  
	  public static void main(String[] args) {
		Demo47 d = new Demo47();
		d.Animal();
		Demo47 dc = new child47();
		dc.legs();
		child47 c = new child47();
		c.eye();
	}
}
