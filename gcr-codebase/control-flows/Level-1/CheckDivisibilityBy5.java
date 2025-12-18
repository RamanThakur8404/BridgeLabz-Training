//Create a class CheckDivisibilityBy5 to check whether the number is divisible by 5 or not
import java.util.Scanner;
public class CheckDivisibilityBy5 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare variable and input from the user
		System.out.println("Enter the number:");
		int number = input.nextInt();
		
		//check whether number is divisible or not 
		//by number % 5 is true then if will executed otherwise else
		boolean check = (number % 5 == 0);
		if(check){
			System.out.println("Is the number " + number + " divisible by 5? "+ check);
		}
		else {
			System.out.println("Is the number " + number + " divisible by 5? "+ check);
		}
	
		// close scanner object
		input.close();
	}
}	
	