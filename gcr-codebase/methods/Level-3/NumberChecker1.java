import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker1 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array age, take input for user
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//applying the logic
		int count = getCount(number);
		int []digit = getDigitArray(number,count);
		int sum = findSum(digit);
		int squareSum = findSquareSum(digit);
		boolean isharshadNumber = checkHarshadNumber(number,sum);
		int[][] frequency = storeFrequency(digit);
		
		//print result
		System.out.println("The number of digit present: "+count);
		System.out.println("Digits are: ");
		printDigit(digit);
		System.out.println("Sum: "+ sum);
		System.out.println("Square Sum: "+ squareSum);
		System.out.println("The given number is harshad number: "+ isharshadNumber);
		frequencyOfNumber(frequency);
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
	
	// check the number is harshad number
	public static boolean checkHarshadNumber(int number , int sum){
		return number % sum == 0 ;
	}

	//find sum
	public static int findSum(int []digit){
		int sum= 0;
		for(int i=0; i<digit.length; i++){
			sum += digit[i];
		}
		return sum;
	}
	
	//find sqaure sum
	public static int findSquareSum(int []digit){
		int sum= 0;
		for(int i=0; i<digit.length; i++){
			sum += Math.pow(digit[i],2);
		}
		return sum;
	}
	
	//get store frequency
	public static int [][]storeFrequency(int []digit){
		int[][] frequency = new int[10][2]; // 10 digits, 2 columns
		for (int i = 0; i < 10; i++) {
			frequency[i][0] = i;   
			frequency[i][1] = 0;
		}
		for (int i = 0; i < digit.length; i++) {
			int d = digit[i];
			if (d >= 0 && d <= 9) {
				frequency[d][1]++;
			}
		}
    return frequency;		
	}	
	
	// frequency Of Number
	public static void frequencyOfNumber(int [][]frequency){
		for(int i=0; i<frequency.length; i++){
			for(int j=0; j<frequency[0].length; j++){
					System.out.print(frequency[i][j]+" ");
			}
			System.out.println();
		}
	}	
}	