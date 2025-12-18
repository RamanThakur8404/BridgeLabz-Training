import java.util.Scanner;
public class NumberCountDown {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		// take input from user
		System.out.println("Enter the input value of number: ");
		int counter = scanner.nextInt();
		
		//using looping statements
		System.out.println("Countdown start : "); 
		while(counter!=0) {
			System.out.println(counter);
			counter--;
		}

		//close the scanner object
		scanner.close();
	}
}	
		
		
		