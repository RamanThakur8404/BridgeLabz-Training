import java.util.Scanner;
public class NaturalNumberSum {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		//declare variable number and user input 
		System.out.println("Enter the number : ");
		int number = read.nextInt();
		
		// check for natural number and sum of natural number 
		if(number > 0) {
			System.out.println("The number is a positive integer then the output is YES");
			int sum = 0;
			sum = number * (number + 1) / 2;
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		}
		else {
			System.out.println("If the number is a positive integer then the output is NO");
		}
		
		//close the Scanner object
		read.close();
	}
}	
		
		
	