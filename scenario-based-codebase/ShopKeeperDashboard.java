/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/
import java.util.Scanner;
public class ShopKeeperDashboard{
	// create constant for discount
	private static final double  DISCOUNT_50 = 0.50;
	private static final double  DISCOUNT_75 = 0.75;
	private static final double  DISCOUNT_45 = 0.45;
	
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to RedTape Showroom");
		
		
		System.out.println("\n Enter number of pairs:");
		int itemCount = scanner.nextInt();
		double totalPrice = 0;
		for(int i=1; i<=itemCount; i++){
			System.out.println("Enter the shoes types from given options: ");
			System.out.println("1.Formal Shoes\n2.Casual Shoes\n3.Sports & Athleisure Shoes");
			int category = scanner.nextInt();
            double price = 0;
		
			switch(category){
				//formal shoes
				case 1 -> {
					System.out.println("Under Formal Shoes we have different varieties:");
					System.out.println("1.Oxford shoes\n2.Derby shoes\n3.Monk shoes\n4.Loafer shoes");
					int shoesType = scanner.nextInt();
					switch(shoesType){
						case 1 -> price = 3500;
						case 2 -> price = 3200;
						case 3 -> price = 4600;
						case 4 -> price = 5400;
						default -> {
							System.out.println("Invalid input choice");
						    i--;
							continue;
						}
					}
				}

				// Casual shoes
				case 2 -> {
					System.out.println("Under Casual Shoes we have different varieties:");
					System.out.println("1.Sneakers\n2.Slip-ons\n3.Boat Shoes\n4.Moccasins shoes");
					int shoesType = scanner.nextInt();
					switch(shoesType){
						case 1 -> price = 699;
						case 2 -> price = 1299;
						case 3 -> price = 1500;
						case 4 -> price = 1800;
						default -> {
							System.out.println("Invalid input choice");
						    i--;
							continue;
						}
					}
				}
				
				// Sports / Athleisure 
				case 3 -> {
					System.out.println("Under Sports / Athleisure Shoes we have different varieties:");
					System.out.println("1.Running Shoes\n2.Walking shoes\n3.Gym Shoes");
					int shoesType = scanner.nextInt();
					switch(shoesType){
						case 1 -> price = 999;
						case 2 -> price = 2299;
						case 3 -> price = 2599;
						default -> {
							System.out.println("Invalid input choice");
						    i--;
							continue;
						}
					}
				}
			
				default -> {
					System.out.println("Invalid user choice");
					i--;
					continue;
				}	
			}
			totalPrice += price; 
			System.out.println("Total purchased item price " + totalPrice);
		}

		double discount = getDiscount(totalPrice);
		double finalDiscountBill = totalPrice - discount;
		
		// display the result
		displayShopKeeperDashboard(totalPrice, discount, finalDiscountBill);
		scanner.close();
	}
	
	// method to get discount 
	public static double getDiscount(double totalPrice){
		if(totalPrice >= 5000){
			return totalPrice * DISCOUNT_75;
		}
		else if(totalPrice >= 3000){
			return totalPrice * DISCOUNT_50;
		}
		else if(totalPrice >= 1500){
		 return totalPrice * DISCOUNT_45;
		}
		return 0.0;
	}

	public static void displayShopKeeperDashboard(double totalPrice, double discount, double finalAmount){
	 System.out.println("\n--------- BILL SUMMARY -----------");
        System.out.println("Total Bill Amount : " + totalPrice);
        System.out.println("Discount Applied  : " + discount);
        System.out.println("Final Amount      : " + finalAmount);
        System.out.println("---------------------------------");
	}	
}	
				
				
					
				