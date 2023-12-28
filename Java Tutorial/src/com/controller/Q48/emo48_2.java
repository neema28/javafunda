package com.controller.Q48;

public   class emo48_2 extends superclass {
	 public void Animal() {
			System.out.println("Parent class");
		}
	 @Override
		  public void giant()   {
			  System.out.println("giant Four class");
		  }
		  
		  public static void main(String[] args) {
			  emo48_2 d = new emo48_2();
			d.Animal();
			   
			child48 c = new child48();
			c.eye();
		}
}
