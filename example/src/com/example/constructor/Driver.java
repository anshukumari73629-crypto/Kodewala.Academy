package com.example.constructor;

public class Driver {
	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.prodcutName + " " + p.price + " " + p.quantity);
		
		Product p1 = new Product("macBook",120000,10);
		System.out.println(p1.prodcutName + " " + p1.price + " " + p1.quantity);
		
	}
}
