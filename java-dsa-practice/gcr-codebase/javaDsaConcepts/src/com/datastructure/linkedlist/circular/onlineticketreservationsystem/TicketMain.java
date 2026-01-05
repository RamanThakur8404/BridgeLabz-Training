package com.datastructure.linkedlist.circular.onlineticketreservationsystem;
import java.util.Scanner;

public class TicketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketService service = new TicketService();

        while (true) {
            System.out.println("\n1.Book Ticket");
            System.out.println("2.Cancel Ticket");
            System.out.println("3.Display Tickets");
            System.out.println("4.Search by Customer");
            System.out.println("5.Search by Movie");
            System.out.println("6.Count Tickets");
            System.out.println("7.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();
                    System.out.print("Movie Name: ");
                    String movie = sc.nextLine();
                    System.out.print("Seat Number: ");
                    int seat = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Booking Time: ");
                    String time = sc.nextLine();

                    service.addTicket(id, customer, movie, seat, time);
                    break;

                case 2:
                    System.out.print("Ticket ID: ");
                    service.removeTicket(sc.nextInt());
                    break;

                case 3:
                    service.displayTickets();
                    break;

                case 4:
                    System.out.print("Customer Name: ");
                    service.searchByCustomer(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Movie Name: ");
                    service.searchByMovie(sc.nextLine());
                    break;

                case 6:
                    service.countTickets();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
