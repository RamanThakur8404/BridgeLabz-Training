package com.constructor.level1;

public class BookDriverInfo {
    public static void main(String[] args) {

        // Base BookInfo
        BookInfo b1 = new BookInfo("978-0135166307", "Java Basics", "Raman Thakur");
        b1.displayDetails();

        // Modify author using setter
        b1.setAuthor("Martin Jonny");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println("");

        // EBook object
        EBook e1 = new EBook("978-0135166307", "Java Basics", "Ashwin Sharma", "PDF");
        e1.displayEBookDetails();
    }
}
