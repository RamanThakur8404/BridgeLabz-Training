// Create a class CheckSmallest to find is the first number is the smallest one.
import java.util.Scanner;
public class CheckSmallest {
	public static void main( String []args ) {
		Scanner read = new Scanner(System.in);
			//take 3 variable as input from user
			System.out.println("Enter three numbers : ");
			int number1 = input.nextInt();
			int number2 = input.nextInt();
			int number3 = input.nextInt();
		
			//check if first number is smallest or not
			if((number1 < number2) && (number1 < number3)) {
				System.out.println(" Is the first number the smallest? Yes ");
			}
			else {
				System.out.println(" Is the first number the smallest? No ");
			}
		
		//close the scanner object
		input.close();
	}
}	