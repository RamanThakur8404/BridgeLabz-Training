import java.util.Scanner;

// Create a class ConvertFeetIntoInches that compute the conversion of feet to inches
public class ConvertFeetIntoInches {
	public static void main(String []args) {
		// Create Scanner class variable input
		Scanner input = new Scanner(System.in);
		double heightInCm;
		System.out.println("Enter the value of height : ");
		heightInCm = input.nextDouble();
	
		// convert cm into inches and calculating feet and remaining inches
		double totalInches = heightInCm /2.54;
		int feet = (int)(totalInches/12);
		double inches = totalInches % 12;
 	
		// Dispaly the Result  
	    System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " inches is " + inches);
	
	    // closing the scanner object 
	    input.close();
	}
}	