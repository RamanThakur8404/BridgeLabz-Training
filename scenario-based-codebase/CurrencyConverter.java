import java.util.Scanner;
public class CurrencyConverter{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Currency Exchange Kiosk");
        char chance ;		
		do{
			System.out.println("Enter the INR amount ");
			int amount = scanner.nextInt();
			System.out.println("Choose the option for currency name to convert the currency");
			System.out.println("1. US Dollar");
			System.out.println("2. Euro");			
			System.out.println("3. British Pound");
			System.out.println("4. Japanese Yen");
			int option = scanner.nextInt();
			
			double convertedAmount;

			switch (option) {
				case 1: 
					convertedAmount = amount / 89.86;
					System.out.println("Converted amount in US Dollar: " + convertedAmount);
					break;

				case 2: 
					convertedAmount = amount / 90.0;
					System.out.println("Converted amount in Euro: " + convertedAmount);
					break;

				case 3: 
					convertedAmount = amount / 105.0;
					System.out.println("Converted amount in British Pound: " + convertedAmount);
					break;

				case 4: 
					convertedAmount = amount / 0.56;
					System.out.println("Converted amount in Japanese Yen: " + convertedAmount);
					break;

				default:
					System.out.println("Invalid option selected");
			}
		
			System.out.println("Do you want another conversion ? (y/n): ");
			chance = scanner.next().toUpperCase().charAt(0);
		}while(chance == 'Y');
		
		System.out.println("Thank you for using our Services. \nVisit Again!");
		scanner.close();
	}		
}
					
		
		