package com.example.constructor;

public class Product {
	String prodcutName;
	int price;
	int quantity;
	
	static int totalprice;

	public Product() {
		
	}

	Product(String prodcutName, int price, int quantity) {
		this.prodcutName = prodcutName;
		this.price = price;
		this.quantity = quantity;
	}

	void print() {
		System.out.println(prodcutName + " " + price + " " + quantity);
	}
}
