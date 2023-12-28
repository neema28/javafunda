package com.controller.Q7;

import com.controller.Q5.Employee;
import com.controller.Q9.Employee9;

public class Employee7 {

	private int id;
	private String name;
	private int price;

	public Employee7(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public Employee7() {
		super();
		// TODO Auto-generated constructor stub
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

	 
	
	@Override
	public String toString() {
		return "Employee7 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public   void show(Employee7 e) {	       
         System.out.println(  e.getId() + "--" + e.getName() + "--" +e.getPrice());
	}
	
	
	
	public static void main(String[] args) {
		Employee7 e1 = new Employee7(100, "sam", 1001);
		Employee7 e2 = new Employee7(102, "sam2", 1002);
		Employee.show(e1);
		Employee.show(e2);
		System.out.println(  e1.getId() + "--" + e1.getName() + "--" +e1.getPrice());
		System.out.println(  e2.getId() + "--" + e2.getName() + "--" +e2.getPrice());
         
	}
}
