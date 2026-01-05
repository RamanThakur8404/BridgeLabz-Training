package com.datastructure.linkedlist.doubly.librarymanagementsystem;

import java.util.Scanner;

public class LibraryDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryService library = new LibraryService();

        while (true) {
            System.out.println("\n1.Add at Beginning\n2.Add at End\n3.Add at Position");
            System.out.println("4.Remove by Book ID\n5.Search by Title\n6.Search by Author");
            System.out.println("7.Update Availability\n8.Display Forward\n9.Display Reverse");
            System.out.println("10.Count Books\n11.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    if (choice == 3) {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        sc.nextLine();
                        addBook(sc, library, choice, pos);
                    } else {
                        addBook(sc, library, choice, -1);
                    }
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    library.removeById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Title: ");
                    library.searchByTitle(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Author: ");
                    library.searchByAuthor(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    System.out.print("Available (true/false): ");
                    boolean status = sc.nextBoolean();
                    library.updateAvailability(id, status);
                    break;

                case 8:
                    library.displayForward();
                    break;

                case 9:
                    library.displayReverse();
                    break;

                case 10:
                    library.countBooks();
                    break;

                case 11:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addBook(Scanner sc, LibraryService library, int choice, int pos) {
        System.out.print("Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Genre: ");
        String genre = sc.nextLine();
        System.out.print("Available (true/false): ");
        boolean status = sc.nextBoolean();

        if (choice == 1)
            library.addAtBeginning(id, title, author, genre, status);
        else if (choice == 2)
            library.addAtEnd(id, title, author, genre, status);
        else
            library.addAtPosition(pos, id, title, author, genre, status);
    }
}
