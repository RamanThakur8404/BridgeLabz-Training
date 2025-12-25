import java.util.Scanner;
public class CoffeeCounter{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("\nWhat type of coffee you want ? ");
			System.out.println("Menu Options:\n1. espresso\n2. latte\n3. cappuccino\n4. americano\n5. mocha");
			System.out.println("Enter the Coffee name or enter \"exit\" to stop");
			String coffeeName = scanner.next().toLowerCase();
		
			if(coffeeName.equals("exit")){
				System.out.println("Thank you! come again");
				break;
			}
			
			System.out.println("Enter the quantity: ");
			int quantity = scanner.nextInt();
			double price = 0.0;
			
			switch(coffeeName){
				case "espresso":
					price = 100;
					break;
			
				case "latte":
					price = 200;
					break;
				
				case "cappuccino":
					price = 250;
					break;
				
				case "americano":
					price = 350;
					break;
				
				case "mocha":
					price = 300;
					break;
				
				default:
					System.out.println("Invalid coffee type!");
					continue;	
			}
			
			double total = price * quantity;
			double gst = total * 0.05;
			double bill = total + gst;

			System.out.println("Base Amount: " + total);
			System.out.println("GST rate : " + gst);
			System.out.println("Total bill: " + bill);
		}	
		scanner.close();
	}		
}	