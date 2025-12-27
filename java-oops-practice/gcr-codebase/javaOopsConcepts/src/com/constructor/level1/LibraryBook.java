package com.constructor.level1;

public class LibraryBook {
	// Attribute
	private String title;
	private String author;
	private double price;
	private boolean availability;
	
	// parameterized constructor
	public LibraryBook(String title, String author, double price) {	
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = true;
	}
		
	// method to borrow a book
	public void borrowBook() {
		if(availability) {
			availability = false;
			System.out.println("Book borrowed Successfully");
		}
		else {
				System.out.println("Book is already sold or Book is not available right now.");
		}
	}
}
