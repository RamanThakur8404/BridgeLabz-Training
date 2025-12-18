import java.util.Scanner;
public class FactorialbyWhileLoop {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		//declare variable number and user input 
		System.out.println("Enter the value : ");
		int value = read.nextInt();
		int factorial = 1;
		
		boolean isPositive = false;
		
		// check value is positive and compute the factorial
		int input = value;
		if(value >= 0){
			isPositive = true;
			while(value!=0){
				factorial *= value;
				value--;
			}
		}
		
		// print the result and close the scanner
		if(isPositive) {
			System.out.println("The factorial of "+ input + " is : "+ factorial);
		}
		else {
			System.out.println("Value is negative, Can't find factorial");
		}
		read.close();
	}
}	