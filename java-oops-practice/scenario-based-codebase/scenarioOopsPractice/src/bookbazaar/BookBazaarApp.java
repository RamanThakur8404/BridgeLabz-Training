package bookbazaar;
import java.util.Scanner;

public class BookBazaarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        System.out.println("\n---Welcome to1 BookBazaar ---");
        while (choice != 0) {

            System.out.println("\nChoose Book Type:");
            System.out.println("1. EBook");
            System.out.println("2. Printed Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting BookBazaar. Thank you!");
                break;
            }

            sc.nextLine(); // consume newline

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            Book book = null;

            switch (choice) {
                case 1:
                    book = new EBook(title, author, price, stock);
                    break;
                case 2:
                    book = new PrintedBook(title, author, price, stock);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            Order order = new Order();
            double totalCost = order.calculateTotal(book, quantity);

            System.out.println("Total Cost: " + totalCost);
            System.out.println("Remaining Stock: " + book.getStock());
            System.out.println("Order Status: " + order.getOrderStatus());
        }

        sc.close();
    }
}
