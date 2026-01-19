package com.sorting.smartlibrary;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartLibrary {
	
	public static void sortBooks(List<Book> books) {
        for (int i = 1; i < books.size(); i++) {
            Book currentBook = books.get(i);
            String currentTitle = currentBook.getTitle();
            int j = i - 1;
            while (j >= 0 && books.get(j).getTitle().compareTo(currentTitle) > 0) {
                books.set(j + 1, books.get(j));
                j--;
            }
            books.set(j + 1, currentBook);
        }
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title and author name: ");
            books.add(new Book(sc.nextLine(),sc.nextLine()));
        }
     
        sortBooks(books);
        
        // sorted book list
        System.out.println("Sorted Borrowed Books:");
        for (Book b : books)
            System.out.println(b.getTitle()+" -> " + b.getAuthor());
    }
}
