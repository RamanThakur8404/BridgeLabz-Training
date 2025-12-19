import java.util.*;
public class ArmstrongNumber {
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Applying logic using while loop
        while(originalNumber!= 0) {
            int digit= originalNumber%10;
            sum= sum +(digit*digit*digit);
            originalNumber= originalNumber/10;
        }

        // Printing the result and scanner object close
        if (sum==number) {
            System.out.println(number+" is an Armstrong Number");
        } 
		else {
            System.out.println(number+" is not an Armstrong Number");
        }
        scanner.close();
	}
}