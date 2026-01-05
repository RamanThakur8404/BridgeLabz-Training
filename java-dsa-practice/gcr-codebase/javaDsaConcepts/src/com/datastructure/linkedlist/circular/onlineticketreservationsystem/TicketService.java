package com.datastructure.linkedlist.circular.onlineticketreservationsystem;

public class TicketService {
    private TicketNode tail;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          int seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (tail == null) {
            tail = newNode;
            tail.next = tail; // circular
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Ticket booked successfully");
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (tail == null) {
            System.out.println("No tickets available");
            return;
        }

        TicketNode curr = tail.next;
        TicketNode prev = tail;

        do {
            if (curr.ticketId == id) {

                if (curr == tail && curr.next == tail) {
                    tail = null; // only one node
                } else {
                    prev.next = curr.next;
                    if (curr == tail)
                        tail = prev;
                }

                System.out.println("Ticket cancelled");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    public void displayTickets() {
        if (tail == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = tail.next;
        System.out.println("Current Booked Tickets:");
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != tail.next);
    }

    // Search by customer name
    public void searchByCustomer(String name) {
        if (tail == null) {
            System.out.println("No tickets available");
            return;
        }

        boolean found = false;
        TicketNode temp = tail.next;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != tail.next);

        if (!found)
            System.out.println("No ticket found for this customer");
    }

    // Search by movie name
    public void searchByMovie(String movie) {
        if (tail == null) {
            System.out.println("No tickets available");
            return;
        }

        boolean found = false;
        TicketNode temp = tail.next;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != tail.next);

        if (!found)
            System.out.println("No tickets found for this movie");
    }

    // Count total tickets
    public void countTickets() {
        if (tail == null) {
            System.out.println("Total booked tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = tail.next;
        do {
            count++;
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("Total booked tickets: " + count);
    }

    private void displayTicket(TicketNode t) {
        System.out.println("Ticket ID: " + t.ticketId +
                ", Customer: " + t.customerName +
                ", Movie: " + t.movieName +
                ", Seat: " + t.seatNumber +
                ", Time: " + t.bookingTime);
    }
}
