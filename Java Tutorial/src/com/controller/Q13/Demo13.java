package com.controller.Q13;

public class Demo13 {
	
	static int x = 10;
	int y=20;
	public void show(){
		int x = 100;
		int y = 200;
		System.out.println(x);//do required changes at this line but output should be 100
		System.out.println("---- "+Demo13.x);//do required changes at this line but output should be 10
		System.out.println("in--" +y);
		
		
	}
	public static void main(String[] args) {
		Demo13 d = new Demo13();
		d.show();		 
		System.out.println(d.y);
	}


}
