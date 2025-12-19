import java.util.Scanner;

public class LargestAndSecondLargestDigits1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //take user input
		System.out.println("Enter a number:");
        int number = read.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
		int largest = 0, secondLargest = 0;
		
		// storing digit in array, and checking for largest and secondLargest
        while (number != 0) {
			if(index == maxDigit){
				maxDigit = maxDigit + 10;
				int []temp = new int [maxDigit];
				for(int i = 0; i < digits.length;i++){
					temp[i] = digits[i];
				}
				digits = temp;
			}
			digits[index] = number % 10;
            number /= 10;
			index++;			
        }
        for (int i = 0; i < index; i++) {
           if(digits[i] > largest){
			largest = digits[i];
			}
        }
		for (int i = 0; i < index; i++) {
           if(digits[i] != largest && secondLargest < digits[i]){
			secondLargest = digits[i];
			}
        }
		
		// print the result
        System.out.println("Largest number is = " + largest);
        System.out.println("Second Largest number is = " + secondLargest);
        read.close();
    }
}
