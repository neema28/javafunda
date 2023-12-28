package com.controller.Q9;

import com.controller.Q5.Employee;

public class Employee9 {

	private int id;
	private String name;
	private int price;

	public Employee9(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
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
	public static void main(String[] args) {
		Employee9 emp = new Employee9(101, "sam", 1000);
		Employee.show(emp);
		System.out.println("main----- " + emp.getId()+" " + emp.getName() + " "+ emp.getPrice());
	}

	public static void show(Employee9 ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getPrice());
		ex.setId(102);
	}


}
