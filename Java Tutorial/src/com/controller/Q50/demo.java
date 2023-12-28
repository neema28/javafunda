package com.controller.Q50;

public   class demo implements test{

	
	public void dance() {
		System.out.print("Work continous...");
	}
	
	
	public static void main(String[] args) {
		test t = new demo();
		t.sing();
	}


	@Override
	public void sing() {
		System.out.print("Singing continous...");

		
	}
}
