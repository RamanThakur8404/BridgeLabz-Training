package com.bookshelf;

import java.util.HashMap;
import java.util.HashSet;

public class BookShelf {
	private HashMap<String, BookList> catalog = new HashMap<>();
	private HashSet<Book> uniqueBook = new HashSet<>();

	public void addBook(Book book) {
		if(!uniqueBook.add( book)) {
			System.out.println("Duplicate Book ignored: " + book);
		}
		
		catalog.put(book.getGenre(), new BookList());
		catalog.get(book.getGenre()).add(book);
		
		System.out.println("Book added:");
		book.diplayDetails();
	}
	
	public void removeBook(Book book) {

        BookList list = catalog.get(book.getGenre());

        if (list != null && list.remove(book)) {
            uniqueBook.remove(book);
            System.out.println("Book removed: ");
            book.diplayDetails();
        } else {
            System.out.println("Book not found: ");
            book.diplayDetails();
        }
    }
	
	public void displayByGenre(String genre) {

	    BookList list = catalog.get(genre);

	    if (list == null) {
	        System.out.println("No books found for genre: " + genre);
	        return;
	    }

	    System.out.println("\nBooks in genre: " + genre);
	    list.display();
	}


    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            catalog.get(genre).display();
        }
    }
	
}
