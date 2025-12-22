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
		boolean prime = isPrime(number);
		boolean neonNumber = isNeon(number);
		boolean spyNumber = isSpy(digit);
		boolean automorphicNumber = isAutomorphic(number);
		boolean buzzNumber = isBuzz(number);
	
		//print result
		System.out.println("The given number is prime number "+prime);
		System.out.println("The given number is neon number "+neonNumber);
		System.out.println("The given number is spy number "+spyNumber);
		System.out.println("The given number is buzz number "+buzzNumber);
		System.out.println("The given number is automorphic number "+automorphicNumber);
		input.close();
	}
	
	// print the digit
	public static void printDigit(int []digit){
		System.out.println(Arrays.toString(digit));
	}
	// count the digit
	public static int getCount(int number){
		int count = 0;
		while(number!=0){
			number /= 10;
			count++;
		}
		return count;
	}
	// store the digit
	public static int []getDigitArray(int number,int count){
		int []digit = new int[count];
		for(int i=count-1; i>=0; i--){
		    digit[i] = number % 10;
			number /= 10;
		}
		return digit;
	}		

    //method to check Prime number
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //method to check Neon number
    public static boolean isNeon(int number) {

        int square = (int)Math.pow(number,2);
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    //method to check Spy number
    public static boolean isSpy(int[] digits) {

        int sum = 0;
        int product = 1;

        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }

        return sum == product;
    }

    //method to check Automorphic number
    public static boolean isAutomorphic(int number) {

        int square = (int)Math.pow(number,2);
		int count = getCount(number);
		int divisor = (int) Math.pow(10,count); 
		
		return square % divisor == number;
    }

    //method to check Buzz number
    public static boolean isBuzz(int number) {

        return number % 7 == 0 || number % 10 == 7;
    }
}
