package com.constructor.level1;
public class BookApp {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// created reference with default constructor
		Book book1 = new Book();
		book1.displayBookDetails();
		
		//created reference with parameterized constructor
		Book book2 = new Book("A Tale of Two Cities","Charles Dickens",1300);
		book2.displayBookDetails();
	}
}
