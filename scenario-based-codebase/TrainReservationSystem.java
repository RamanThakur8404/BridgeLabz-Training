/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once TICKET reach zero (break).
*/

import java.util.Scanner;
public class TrainReservationSystem{
	public static final int TOTAL_TICKET = 5;
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Train Reservation System");
		int occupiedTicket = 0;

		while(occupiedTicket < TOTAL_TICKET){
			System.out.println("\nChoose the option from menu");
			System.out.println("1. Book Ticket\n2. Cancel Ticket \n3. Available Ticket");
			int option = scanner.nextInt();
			if(occupiedTicket == TOTAL_TICKET){
				System.out.println("No ticket available ");
				break;
			}	
			switch(option){
				case 1 -> {
					if(occupiedTicket < TOTAL_TICKET){
						System.out.println("Your ticket is booked successfully");
						occupiedTicket +=1;
					}
				}
					
				case 2 -> {
					if(occupiedTicket == 0){
						System.out.println("No Available ticket there");
						return;
					}
					else{
						System.out.println("Your ticket canceled successfully");
						occupiedTicket -=1;
					}
				}
				
				case 3 -> {
					System.out.println("The total available tickets are: " + (TOTAL_TICKET - occupiedTicket));
				}
				
				default -> {
					System.out.println("Invalid input, take input from the options");
				}
			}
		}
		
		System.out.println("Thank you for using our Train Reservation System service");
	}
}	
				