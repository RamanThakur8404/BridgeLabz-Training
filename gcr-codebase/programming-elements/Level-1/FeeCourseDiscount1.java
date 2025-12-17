import java.util.Scanner;
// Create Create a class FeeCourseDiscount that calculate the discount and final fee
public class FeeCourseDiscount1 {
	public static void main(String []args) {
		// Take input from user using Scanner class 
		Scanner input = new Scanner(System.in);	
		double studentFees = input.nextDouble();  
		int discountPercent = input.nextInt();  
		
		// Calculate the discount and finalFee
		double discount = (studentFees * discountPercent) / 100 ;
		double finalFee = studentFees - discount;
	  
		// Dispaly the Result  
		System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR "+finalFee);
	
	input.close(); // closing the scanner object
	}
}	