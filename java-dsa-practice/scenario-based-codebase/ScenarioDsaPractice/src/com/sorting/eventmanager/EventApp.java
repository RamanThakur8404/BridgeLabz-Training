package com.sorting.eventmanager;
import java.util.Scanner;

public class EventApp {

	public static void quickSort(Ticket []tickets, int start, int end) {
		if(start >= end) return;
		int pivotIdx = partition(tickets,start,end);
		quickSort(tickets,start,pivotIdx-1);
		quickSort(tickets,pivotIdx+1,end);
	}
	
	public static int partition(Ticket []tickets, int start, int end) {
		double pivot = tickets[end].price;
		int i = start - 1;
		for(int j = start ; j < end; j++) {
			if(tickets[j].price <= pivot) {
				i++;
				swap(tickets, i, j);
			}
		}
		swap(tickets, i+1,end);
		return i+1;
	}
	
	public static void swap(Ticket []tickets, int low, int high) {
		Ticket temp;
		temp = tickets[low];
		tickets[low] = tickets[high];
		tickets[high] = temp;
	}
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();

        Ticket[] tickets = new Ticket[n];

        // User-defined input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of ticket " + (i + 1) + ": ");
            double price = sc.nextDouble();
            tickets[i] = new Ticket(price);
        }

        // Quick Sort
        quickSort(tickets, 0, n - 1);

        // Display sorted ticket prices
        System.out.println("\nSorted Ticket Prices:");
        for (Ticket t : tickets) {
            System.out.println("₹" + t.price);
        }

        sc.close();
    }
}
