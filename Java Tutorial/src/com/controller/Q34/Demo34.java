package com.controller.Q34;

import java.util.Scanner;

public class Demo34 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username=  s.nextLine();
		System.out.println("username--  "+username);
		show(username);
	}
	
	public static void show(String username ) {
		  System.out.print("show--" + username.toString());
	}
	
	
}
