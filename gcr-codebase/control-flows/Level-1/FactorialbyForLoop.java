import java.util.Scanner;
public class FactorialbyForLoop {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		//declare variable number and user input 
		System.out.println("Enter the value : ");
		int value = read.nextInt();
		int factorial = 1;
		boolean isPositive = false;
		
		// check value is positive and compute the factorial
		if(value >= 0){
			isPositive = true;
			for(int number= 1;number<=value;number++){
				factorial *= number;
			}
		}
		
		// print the result and close the scanner
		if(isPositive) {
			System.out.println("The factorial of "+ value + " is : "+ factorial);
		}
		else {
			System.out.println("Value is negative, Can't find factorial");
		}
		read.close();
	}
}	