package com.controller.Q5;

import com.controller.Q7.Employee7;
import com.controller.Q9.Employee9;

public class Employee {

	private int id;
	private String name;
	private int price;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Employee(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public static void show(Employee7 e) {	       
         //System.out.println(e.getClass());
	}
	public static  void show(Employee9 e) {	       
        System.out.println(  e.getId() + "--" + e.getName() + "--" +e.getPrice());
	}
	 
	public static void main(String[] args) {
		//Employee e = new Employee(100, "sam", 1001);
         //show(100,"same", 10052);
         
	}
	 

	
}
