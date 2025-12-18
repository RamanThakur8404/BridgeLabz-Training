// Java Code to find quotient and remainder
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        // Creating variables, Scanner object and take user input
        int number1, number2;
		Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Displaying result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +" of two number " + number1 + " and " + number2);
		// Closing the Scanner object
        input.close(); 
    }
}