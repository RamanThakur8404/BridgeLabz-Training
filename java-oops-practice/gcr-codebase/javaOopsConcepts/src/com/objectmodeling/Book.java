package com.objectmodeling;

public class Book {
	//Attribute
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//getter method
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	// display details
	public void displayBookDetails(){
		System.out.println("Book Title  --> "+ title);
		System.out.println("Book Author --> "+ author);
	}
}
