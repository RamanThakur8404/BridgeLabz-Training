import java.util.Scanner;
public class NumberCountDown {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		// take input from user
		System.out.println("Enter the input value of number: ");
		int counter = read.nextInt();
		
		//using looping statements
		System.out.println("Countdown start : "); 
		while(counter!=0) {
			System.out.println(counter);
			counter--;
		}

		//close the scanner object
		read.close();
	}
}	
		
		
		