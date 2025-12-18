import java.util.Scanner;
// Create a basic calculator for addition, subtraction, multiplication and division.
public class Calculator {
	public static void main(String []args) {
		//declare variable and take user input with Scanner class
		Scanner input = new Scanner(System.in);
		float number1,number2;
		System.out.println("Enter two values :");
		number1 = input.nextFloat();
		number2 = input.nextFloat();
		
		//perform operations like addition,subtraction,multiplication and division
		float addition = number1 + number2;
		float subtraction = number1 - number2;
		float multiplication = number1 * number2;
		float division = number1 / number2;
		
		//Display the output
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + "," +subtraction + "," + multiplication + ", and" + division ); 
	}
}	