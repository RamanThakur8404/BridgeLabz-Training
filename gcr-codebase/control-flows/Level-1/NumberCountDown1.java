import java.util.Scanner;
public class NumberCountDown1 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		// take input from user
		System.out.println("Enter the input value of number: ");
		int counter = input.nextInt();
		
		//using looping statements
		System.out.println("Countdown start : "); 
		for(int count = counter; count>=1; count--) {
			System.out.println(count);
		}
		
		//close the scanner object
		input.close();
	}
}	