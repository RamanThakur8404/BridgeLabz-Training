import java.util.Scanner;
public class SmartParkingSystem{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome To Smart Parking System");
		int defaultOccupancy = 10;
		int slotoccupied = 0;
		boolean isParking = false;
		System.out.println("The default Occupancy of parking: " + defaultOccupancy);
		System.out.println("Options:\n1.Park\n2.Exit Vehicle\n3.Show Occupancy\n4.Exit"); 
		System.out.println("Select the option: ");
		int option = scanner.nextInt();
		if(option == 4){
			System.out.println("Thank you for using our parking system");
		}			
		else{
			while(true)
			{
				switch(option){
					case 1:
						if(defaultOccupancy == 0){
							System.out.println("Parking is already full, Thank you visit again");
							return;
						}
						defaultOccupancy -=1;
						slotoccupied += 1;
						System.out.println("Your car is parked successfully");
						break;

					case 2:
						System.out.println("Your vehicle exit successfully");
						slotoccupied -=1;
						defaultOccupancy += 1;
						break;
						
					case 3:
						System.out.println("The occupied slots of car parking are " + slotoccupied);
						System.out.println("The remaining spaces of car parking are " + defaultOccupancy);
						break;
					
					case 4:
						System.out.println("Thank you for using our parking system");
						return;
						
					default:
						System.out.println("Invalid user input, choose from the options (String input)");
				}
				System.out.println("Options:\n1.Park\n2.Exit Vehicle\n3.Show Occupancy\n4.Exit");
				System.out.println("Select the option:");
				option = scanner.nextInt();
			}
		}
	}
}	
		