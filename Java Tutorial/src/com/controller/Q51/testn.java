package com.controller.Q51;

 

public class testn implements simcard{
	 
	
	
	public static void main(String[] args) {
		testn t = new testn();
		t.sms();
		
		simcard a = new testn();
		a.sms();
	}


	@Override
	public  void sms() {
		// TODO Auto-generated method stub
		System.out.print("SMS continous...");
	}


	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.print("Call continous...");
	}
}
