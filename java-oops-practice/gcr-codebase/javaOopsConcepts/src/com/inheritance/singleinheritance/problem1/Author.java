package com.inheritance.singleinheritance.problem1;

public class Author extends Book{
	//attribute
	protected String name;
	protected String bio;
	
	// constructor
	public Author(String title, int publicationYear, String name, String bio) {
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	public void displayInfo() {
		 System.out.println("Book Title       : " + title);
	     System.out.println("Publication Year : " + publicationYear);
	     System.out.println("Author Name      : " + name);
	     System.out.println("Author Bio       : " + bio);
	}
}
