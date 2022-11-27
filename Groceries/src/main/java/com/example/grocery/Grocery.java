package com.example.grocery;




public class Grocery {

	
	private int Id;
	private String name;
	private double price;
	private String quantity;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Grocery(int id, String name, double price, String quantity) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Groceries [Id=" + Id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}