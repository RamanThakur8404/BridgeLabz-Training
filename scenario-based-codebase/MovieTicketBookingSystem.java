/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/
import java.util.Scanner;
public class MovieTicketBookingSystem{
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		System.out.println(" Welcome To Movie Ticket Booking System ");
		System.out.println("-----------------------------------------");
		char choice = 'Y';
		int totalBill = 0;
		do{
			int ticketPrice = 0;
			int seatPrice = 0;
			int snackPrice = 0;
	
			System.out.println(" Choose the movie type :\n1.Comedy\n2.Drama\n3.Action\n4.Romance\n5.Horror");
			int option = read.nextInt();
			switch(option){
				case 1 -> {	
					ticketPrice = 149;
				}
				
				case 2 -> {
					ticketPrice = 189;
				}
				
				case 3 -> {
					ticketPrice = 159;
				}

				case 4 -> {
					ticketPrice = 179;
				}
				
				case 5 -> {
					ticketPrice = 139;
 				}	
				
				default -> {
					System.out.println("Invalid ticket type, try again");
					continue;
				}
			}
				
			seatPrice = getSeatPrice(read);
			
			System.out.println("Do you want snacks ?(Y/N)");
			char snackType = Character.toUpperCase(read.next().charAt(0));
			if(snackType == 'Y'){
				snackPrice = getSnackPrice(read);
			}
			else{
				snackPrice = 0;
			}	
			
			System.out.println("Do you want to buy another ticket ? (Y/N)");
			choice = Character.toUpperCase(read.next().charAt(0));
			int bill = 0;
			bill = ticketPrice + seatPrice + snackPrice;
			totalBill += bill;
			System.out.println("------------------Final Bill Summary ---------------");
			System.out.println("Ticket Price :       " + ticketPrice);
			System.out.println("Seat Price :         " + seatPrice);
			System.out.println("Snack Price :        " + snackPrice);
			System.out.println("Customer Bill:   	 " + bill);
		}while(choice == 'Y');
		System.out.println("Total Bill Price :   " + totalBill);
		System.out.println("Thank you for using services, visit again!");
		
	}
	
	public static int getSeatPrice(Scanner read){
		do{
			System.out.println("Choose the seat type: ");
			System.out.println("1.Gold seat");
			System.out.println("2.Silver seat");
			int seatType = read.nextInt();
			switch(seatType){
				case 1 : 
					return 260;
				
				case 2 :
					return 200;

				default :
					System.out.println("Invalid seat type,try again");	
			}
		}while(true);	
	}
	
	public static int getSnackPrice(Scanner read){
		do{
			System.out.println("select the snacks: ");
				System.out.println("\n1.Cold Drink\n2.Pizza\n3.Pop-Corn\n4.Sandwich");
				int snack = read.nextInt();
				switch(snack){
					case 1 :
						return 50;
					
					case 2 :
						return 89;
					
					case 3 :
						return 80;

					case 4 :
						return 60;
					
					default :
						System.out.println("Invalid snack type");
				}	
		}while(true);	
	}		
}	