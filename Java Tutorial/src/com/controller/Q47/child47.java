package com.controller.Q47;

import com.controllr.Q14.demo14;

public class child47 extends Demo47{
	
	
	public void eye() {
		System.out.println("Two");
	}
	public void legs() {
		System.out.println("four");
	}
	  public static void main(String[] args) {
			Demo47 d = new Demo47();
			d.Animal();
			child47 c = new child47();
			c.eye();
			Demo47 dc = new child47();
			dc.legs();
		}
}
