import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array age, take input for user
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//applying the logic
		int count = getCount(number);
		int []digit = getDigitArray(number,count);
		boolean isDuckNumber = checkDuckNumber(digit);
		boolean isArmStrong = checkArmstrongNumber(digit,number);
		int[] largestAndSecondLargest = findLargestAndSecondLargest(digit);
		int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digit);
		
		//print result
		System.out.println("The number of digit present: "+count);
		System.out.println("Digits are: ");
		printDigit(digit);
		System.out.println("Armstrong Number: "+ isArmStrong);
		System.out.println("Duck Number: "+ isDuckNumber);
		System.out.println("Largest number: "+ largestAndSecondLargest[0] + " Second Largest number: " + largestAndSecondLargest[1]);
		System.out.println("Smallest number: "+ smallestAndSecondSmallest[0] + " Second Smallest number: " + smallestAndSecondSmallest[1]);
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
	
	// check the number is duck number
	public static boolean checkDuckNumber(int []digit){
		for(int i=0; i<digit.length; i++){
		    if(digit[i] == 0){
				return false;
			}	
		}
		return true;
	}

	// store the digit
	public static boolean checkArmstrongNumber(int []digit,int number){
		int armStrong = 0;
		for(int i=0; i<digit.length; i++){
		    armStrong += Math.pow(digit[i],3);
		}
		return armStrong == number;
	}	
	
	// find large and secondLarge 
	public static int []findLargestAndSecondLargest(int []digit){
		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		for(int i=0; i<digit.length; i++){
		    large = Math.max(digit[i],large);
		}
		for(int i=0; i<digit.length; i++){
		    if(large!=digit[i]){
				secondLarge = Math.max(digit[i],secondLarge);
			}
		}
		return new int[]{large,secondLarge};
	}	
	
	//find small and secondSmall
	public static int []findSmallestAndSecondSmallest(int []digit){
		int small = Integer.MAX_VALUE;
		int secondsmall = Integer.MAX_VALUE;
		for(int i=0; i<digit.length; i++){
		    small = Math.min(digit[i],small);
		}
		for(int i=0; i<digit.length; i++){
		    if(small!=digit[i]){
				secondsmall = Math.min(digit[i],secondsmall);
			}
		}
		return new int[]{small,secondsmall};
	}	
	
}	