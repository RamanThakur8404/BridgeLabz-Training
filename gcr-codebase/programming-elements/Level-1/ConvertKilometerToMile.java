// import the Scanner class to take user input from the keyboard
import java.util.Scanner;

// Create a class ConvertKilometerToMile that compute the conversion of kilometers to miles
public class ConvertKilometerToMile {
	
	public static void main(String []args) {

	// Create Scanner class variable input
	Scanner input = new Scanner(System.in);

	// Create a variable km and take input from user	
	System.out.println("Enter the value of km : ");
	  double km = input.nextInt();
	
	// Create a variable mile and calculate the mile
	double mile = km/1.6;

	// Dispaly the Result  
	  System.out.println("The total miles is " + mile +" mile for the given " + km + " km");
	}
}	