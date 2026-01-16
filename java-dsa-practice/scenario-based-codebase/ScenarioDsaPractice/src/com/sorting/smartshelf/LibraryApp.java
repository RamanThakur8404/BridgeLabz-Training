package com.sorting.smartshelf;
import java.util.Scanner;

public class LibraryApp {
	
	public static void sortBooks(Book []books) {
		for(int i= 1; i<books.length; i++) {
			Book key = books[i];
			int j = i-1;
			while( j>=0 && books[j].title.compareTo(key.title) > 0) {
				books[j+1] = books[j];
				j--;
			}
			books[j+1] = key;
		}
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

        // Taking user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title " + (i + 1) + ": ");
            String title = sc.nextLine();
            books[i] = new Book(title);
        }

        // Sorting books alphabetically
        sortBooks(books);

        // Display sorted list
        System.out.println("\nSorted Book List:");
        for (Book book : books) {
            System.out.println(book.title);
        }
        sc.close();
    }
}
