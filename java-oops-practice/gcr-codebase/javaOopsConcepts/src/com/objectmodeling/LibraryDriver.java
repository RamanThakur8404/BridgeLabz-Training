package com.objectmodeling;

public class LibraryDriver {
	public static void main(String []args) {
		
		// independent book object
		Book book1 = new Book("Harry Potter", "J.K. Rowling");
		Book book2 = new Book("The Alchemist", "Paulo Coelho");
		Book book3 = new Book("Atomic Habits", "James Clear");
		Book book4 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki");
		Book book5 = new Book("Think and Grow Rich", "Napoleon Hill");

		// independent library object
		Library lib1 = new Library("Central Library");
        Library lib2 = new Library("City Public Library");
        Library lib3 = new Library("University Library");
        
        // adding book to library
        lib1.addBooks(book3);
        lib1.addBooks(book2);
        lib1.addBooks(book4);
        
        lib2.addBooks(book4);
        lib2.addBooks(book1);
        lib2.addBooks(book5);
        lib2.addBooks(book2);
        
        lib3.addBooks(book5);
        lib3.addBooks(book4);
        lib3.addBooks(book2);
        lib3.addBooks(book1);
        lib3.addBooks(book3);
        
        // display library details
        lib1.displayBooks();
        lib2.displayBooks();
        lib3.displayBooks();
	}
}
