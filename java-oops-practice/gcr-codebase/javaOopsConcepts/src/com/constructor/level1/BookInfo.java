package com.constructor.level1;

public class BookInfo {
    public String ISBN;         
    protected String title;    
    private String author;       
    
    // Constructor
    BookInfo(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter method
    public String getAuthor() {
        return author;
    }

    // public setter method
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("");
    }
}
