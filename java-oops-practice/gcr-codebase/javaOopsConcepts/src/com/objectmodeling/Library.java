package com.objectmodeling;
import java.util.ArrayList;

public class Library {
	//Attribute
	private String libraryName;
	private ArrayList<Book> books;
	
	public Library(String libraryName) {
		this.libraryName = libraryName;
		books = new ArrayList<Book>();
	}
	
	// method to add book
	public void addBooks(Book book) {
		books.add(book);
	}
	
	//method to display books
	public void displayBooks() {
		System.out.println("\nBooks present in " +libraryName+" :");
		for(Book book : books) {
			book.displayBookDetails();
		}
	}
}
