package com.bookshelf;
public class LibraryApp {

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1  = new Book("1984", "George Orwell", "Fiction");
        Book b2  = new Book("Animal Farm", "George Orwell", "Fiction");
        Book b3  = new Book("The Alchemist", "Paulo Coelho", "Fiction");
        Book b4  = new Book("Clean Code", "Robert C. Martin", "Programming");
        Book b5  = new Book("Effective Java", "Joshua Bloch", "Programming");
        Book b6  = new Book("Head First Java", "Kathy Sierra", "Programming");
        Book b7  = new Book("Data Structures", "Seymour Lipschutz", "Education");
        Book b8  = new Book("Operating System", "Galvin", "Education");
        Book b9  = new Book("Deep Learning", "Ian Goodfellow", "AI");
        Book b10 = new Book("Artificial Intelligence", "Stuart Russell", "AI");

        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);
        shelf.addBook(b4);
        shelf.addBook(b5);
        shelf.addBook(b6);
        shelf.addBook(b7);
        shelf.addBook(b8);
        shelf.addBook(b9);
        shelf.addBook(b10);

        System.out.println("\n📚 Library Catalog:");
        shelf.displayCatalog();

//        System.out.println("\n📕 Borrowing a book...");
//        shelf.removeBook(b2);
//
//        System.out.println("\n📚 Updated Catalog:");
//        shelf.displayCatalog();
        
        System.out.println("\n📘 Fiction Books:");
        shelf.displayByGenre("Fiction");

        System.out.println("\n💻 Programming Books:");
        shelf.displayByGenre("Programming");

    }
}
