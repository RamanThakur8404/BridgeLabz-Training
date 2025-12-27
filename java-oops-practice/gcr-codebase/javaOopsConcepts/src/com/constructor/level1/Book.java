package com.constructor.level1;

public class Book {
	// Attribute
	private String title;
	private String author;
	private double price;
	
	// parameterized constructor
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// default constructor
	public Book() {
		title = "THE KRISHNA KEY";
		author = "Ashwin Sanghi";
		price = 1200;
	}
	
	// display book Details
	void displayBookDetails() {
		System.out.println("Book Title: "+ title);
		System.out.println("Book Author: "+ author);
		System.out.println("Book Price: "+ price);
		System.out.println();
	}
}
