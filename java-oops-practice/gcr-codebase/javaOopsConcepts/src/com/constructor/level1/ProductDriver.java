package com.constructor.level1;

public class ProductDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product("Laptop",56000);
		Product product2 = new Product("Iphone",89000);
		Product product3 = new Product("Headphones",15000);
		
		// call display product details
		product1.displayProductDetails();
		product2.displayProductDetails();
		product3.displayProductDetails();
		
		Product.displayTotalProducts();
	}
}
