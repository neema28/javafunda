package com.controller.Q53;

import com.controller.Q48.superclass;

public class product {

	
	private int id;
	private String name;
	private int price;
	private int qnt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name= name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int  Qnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt=qnt;
	}
	
	public product() {
		super();
	}
	 
	public product(int id, String name, int price, int qnt) {
		super();
		this.id=id;
		this.name=name;
		this.price=price;
		this.qnt=qnt;
	}
	
	public String toString() {
		return "id "+ id +"name" + "price " +price +"qnt " +qnt ;
	}
	
	
	public static void main(String[] args) {
		product p = new product(1,"name",344, 35345);
		 System.out.print(p.getId() +"-- "+ p.getPrice()+"--"+ p.getPrice() + "--" + p.Qnt() );
		 }
}
