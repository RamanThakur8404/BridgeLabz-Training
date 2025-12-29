import java.util.Scanner;
public class PhoneRecharge{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Phone Recharge Simulator");
		int balance = 0;
		char options = 'N';
		boolean flag = false;
		do{
			System.out.println("Enter the type of sim do you have from the given options");
			System.out.println("1.Jio\n2.Vi\n3.Airtel\n4.BSNL");
			int simType = scanner.nextInt();
			
			switch(simType){
				case 1 -> {
					System.out.println("\n Jio Recharge Plans:");
					System.out.println("1. 198  - 2GB/day, 14 days");
					System.out.println("2. 299  - 1.5GB/day, Unlimited Calls");
					System.out.println("3. 666  - 2GB/day, 84 days");			
				}
				
				case 2 -> {
					System.out.println("\n Airtel Recharge Plans:");
					System.out.println("1. 199  - 1.5GB/day, 28 days");
					System.out.println("2. 299  - 2GB/day, Unlimited Calls");
					System.out.println("3. 499  - 3GB/day + OTT");
				}
				
				case 3 -> {
					System.out.println("\n VI Recharge Plans:");
					System.out.println("1. 199  - 1GB/day, 28 days");
					System.out.println("2. 249  - 1.5GB/day + Weekend Rollover");
					System.out.println("3. 399  - 2GB/day, Unlimited Calls");
				}
				
				case 4 -> {
					System.out.println("\n BSNL Recharge Plans:");
					System.out.println("1. 147  - 10GB total data, 30 days");
					System.out.println("2. 197  - Unlimited Calls, 18 days");
					System.out.println("3. 397  - 2GB/day, 60 days");
				}
				
				default -> {
					System.out.println("Invalid selection");
					continue;
				}
			}	
			// add recharge amount and calculate balance
			System.out.println("Enter the recharge amount");
			int amount = scanner.nextInt();
			balance += amount;
			
			// display result
			System.out.println("Recharge Done Successfully");
			System.out.println("Total Balance :" + balance);
			System.out.println("Do you want to do recharge again ?(Y/N)");
			options = Character.toUpperCase(scanner.next().charAt(0));
		}while(options == 'Y');

	System.out.println("Thank you for using our services. Visit again!");
	scanner.close();
	}
}	