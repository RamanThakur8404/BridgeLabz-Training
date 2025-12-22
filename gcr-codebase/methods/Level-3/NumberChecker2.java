import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker2{
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array age, take input for user
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//applying the logic
		int count = getCount(number);
		int []digit = getDigitArray(number,count);
		boolean isDuckNumber = checkDuckNumber(digit);
		int[] reverseArray = reverse(digit); 
		boolean isPalindrome = checkPalindromeNumber(digit,reverseArray);
		boolean compare = compareArray(reverseArray,digit);
		
		//print result
		System.out.println("The number of digit present: "+count);
		System.out.println("Digits are: ");
		printDigit(digit);
		System.out.println("Duck Number: "+ isDuckNumber);
		System.out.println("Reversed Array is ");
		printReversedArray(reverseArray);
		System.out.println("Both Arrays are same: "+ compare);
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

	// check palindrome
	public static boolean checkPalindromeNumber(int []digit,int []reverseArray){
		return compareArray(reverseArray,digit);
	}	
	
	// reverse the array
	public static int []reverse(int []digit){
		int []reverse = new int[digit.length];
		for(int i=0; i<digit.length; i++){
		    reverse[reverse.length-1-i] = digit[i];
		}
		return reverse;
	}	
	
	//check if two array are equal
	public static boolean compareArray(int []reverseArray,int []digit){
		for(int i=0; i<digit.length; i++){
		    if(digit[i] != reverseArray[i]){
				return false;
			}	
		}
		return true;
	}

	//print reverse array
	public static void printReversedArray(int []reverse){
		System.out.println(Arrays.toString(reverse));
	}	
}	