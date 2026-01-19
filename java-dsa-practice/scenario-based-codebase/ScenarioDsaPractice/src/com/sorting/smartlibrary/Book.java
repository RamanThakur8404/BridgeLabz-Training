package com.sorting.smartlibrary;
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return "Book Title:" + title;
    }

    public String getAuthor() {
        return "Author Name: " + author;
    }

}
