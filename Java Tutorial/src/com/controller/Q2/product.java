package com.controller.Q2;

public class product {

	private int id;
	private String name;
	private int price;
	
	public product(int id,String name, int price) {
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(Integer id) { this.id =id; } public String getName() {
	 * return name; } public void setName(String name) { this.name = name; }
	 * 
	 * 
	 * public int getPrice() { return price; }
	 * 
	 * public void setPrice(int price) { this.price = price; }
	 */
		public String toString() {
			return getClass().getName()+"[id  " + id + " " + name + " " + price +"]";
		}
	public static void main(String[] args) {
		/* using setter
		 * product p = new product(); p.setId(1); p.setName("Neema"); p.setPrice(318);
		 */
		//using constructor
		product p = new product(100, "sam", 1001);	 
		
		System.out.println(p.id );
		
	}
}
