package com.constructor.level1;
public class Product{
	//attribute
	private String productName;
	private double price;
	public static int totalProducts = 0;

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	// method to display product details
	public void displayProductDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println();
	}
	
	//class method
	public static void displayTotalProducts() {
		System.out.println("Total Products Created: " + totalProducts);
	}	
}

