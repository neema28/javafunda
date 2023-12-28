package com.controller.Q48;
 

public   class Demo48 extends superclass{
	
	 public void Animal() {
			System.out.println("Parent class");
		}
	 @Override
		  public void giant()   {
			  System.out.println("big class");
		  }
		  
		  public static void main(String[] args) {
			Demo48 d = new Demo48();
			d.Animal();
//			Demo48 dc = new child48();
//			dc.giant();
			child48 c = new child48();
			c.eye();
		}
}
