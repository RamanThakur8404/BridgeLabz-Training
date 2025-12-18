import java.util.Scanner;
public class NumberSumByWhileUntilZero {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		// taking user input and assign variable total as 0.0
		double total = 0.0;
		System.out.println("Enter the number: ");
		double value = input.nextDouble();
		
		//apply looping statement
		while(value!=0){
		total += value;
		System.out.println("Enter the number: ");
		value = input.nextDouble();
		}
		
		//printing the output and close the scanner object
		System.out.println("The total value is :" + total);
	}
}	
		
		
		