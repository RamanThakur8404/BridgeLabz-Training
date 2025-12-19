import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // take user input
        System.out.println("Enter a number:");
        int number = read.nextInt();
        int originalNumber = number;
        int count = 0;

		//count the digit for size of array, store the digit 
        while (number != 0) {
            count++;
            number /= 10;
        }
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = originalNumber % 10;
            originalNumber /=10;
        }
        int[] reverse = new int[digits.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        //display result 
        System.out.print("Reversed number: ");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
        }
        read.close();
    }
}
