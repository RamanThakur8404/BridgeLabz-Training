// Create a class FeeCourseDiscount that calculate the discount and final fee
public class FeeCourseDiscount {
	
	public static void main(String []args) {

	// Create a variable studentFees and assign value as 12500	
	  double studentFees = 12500;
	
	// Create a variable discountPercent and assign value as 10  
	  int discountPercent = 10;
	  
	// Create a variable discount and assign the calculated discount   
	  double discount = (studentFees * discountPercent) / 100 ;
	
	//	 Create a variable discount and assign the calculated final fees
	  double finalFee = studentFees - discount;
	  
	// Dispaly the Result  
	  System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR "+finalFee);
	}
}	