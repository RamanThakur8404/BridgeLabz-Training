import java.util.Scanner;

public class DigitFrequencyCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//take user input
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
		// count of digits
        long temp = number;
        int count = 0;
		
		// count digit, store them and increase the frequency count of digit
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        if (count == 0){
		count = 1;
		}
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }
		int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        //display the frequency count of digits
        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
			}
		}
		scanner.close();
	}	
}
