package com.constructor.level1;

public class LibraryDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryBook book1 = new LibraryBook("The Krishna Key","Ashwin Sanghi",1500);
		book1.borrowBook();
		// if we try borrowBook again
		book1.borrowBook();
		
		LibraryBook book2 = new LibraryBook("A Tale of Two Cities","Charles Dickens",1300);
		book2.borrowBook();
	}
}
