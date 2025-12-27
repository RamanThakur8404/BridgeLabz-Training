package com.constructor.level1;

public class EBook extends BookInfo {
    String fileFormat;

    // Constructor
    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Display ebook details
    public void displayEBookDetails() {
        System.out.println("ISBN       : " + ISBN);     
        System.out.println("Title      : " + title);   
        System.out.println("Author     : " + getAuthor()); 
        System.out.println("File Format: " + fileFormat);
        System.out.println("");
    }
}

