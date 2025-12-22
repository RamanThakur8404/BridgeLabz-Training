import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker3 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array age, take input for user
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//applying the logic
		int count = getCount(number);
		int []digit = getDigitArray(number,count);
	
		//print result
		System.out.println("The given number is perfect number "+ isPerfectNumber(number));
		System.out.println("The given number is abundant number "+ isAbundantNumber(number));
		System.out.println("The given number is deficient number "+ isDeficientNumber(number));
		System.out.println("The given number is deficient number "+ isDeficientNumber(number));
		System.out.println("The given number is Strong number "+ isStrongNumber(number));
		input.close();
	}
	
	// method to sum of Divisors
	public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum;
    }
	
	// method to check perfect number
    public static boolean isPerfectNumber(int number) {
        return sumOfDivisors(number) == number;
    }
	
	// method to check abundant number
    public static boolean isAbundantNumber(int number) {
        return sumOfDivisors(number) > number;
    }
	
	// method to check deficient number
    public static boolean isDeficientNumber(int number) {
        return sumOfDivisors(number) < number;
    }

	//method to find factorial
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
	// method to check strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += factorial(digit);
            originalNumber /= 10;
        }
        return sum == number;
    }
}