package com.datastructure.linkedlist.doubly.librarymanagementsystem;

public class LibraryService {
    private BookNode head;
    private BookNode tail;

    // Add at beginning
    public void addAtBeginning(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Book added at beginning");
    }

    // Add at end
    public void addAtEnd(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Book added at end");
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean status) {
        if (pos == 1) {
            addAtBeginning(id, title, author, genre, status);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, status);
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, status);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Book added at position " + pos);
    }

    // Remove by Book ID
    public void removeById(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                System.out.println("Book removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by Title
    public void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by Author
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No books found for this author");
    }

    // Update availability status
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability status updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }
        System.out.println("Books (Forward):");
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }
        System.out.println("Books (Reverse):");
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books in library: " + count);
    }

    private void displayBook(BookNode b) {
        System.out.println(
            "ID: " + b.bookId +
            ", Title: " + b.title +
            ", Author: " + b.author +
            ", Genre: " + b.genre +
            ", Available: " + (b.isAvailable ? "Yes" : "No")
        );
    }
}

