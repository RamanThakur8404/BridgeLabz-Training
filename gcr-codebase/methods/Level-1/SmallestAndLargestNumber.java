import java.util.Scanner;
public class SmallestAndLargestNumber{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//take user input
		System.out.println("Enter three numbers: ");
		int numberOne = scanner.nextInt();
		int numberTwo = scanner.nextInt();
		int numberThird = scanner.nextInt();
		
		//declare array to store largest and smallest number
		int []largeAndSmallNumber = findSmallestAndLargest(numberOne,numberTwo,numberThird); 
		
		//print the result and close the scanner object
		System.out.println("The smallest number is : "+largeAndSmallNumber[0]);
		System.out.println("The largest number is : "+largeAndSmallNumber[1]);
		scanner.close();
	}
	
	//method definition
	public static int[] findSmallestAndLargest(int number1,int number2,int number3){
		int []store = new int[2];
		if(number1 < number2 && number1 < number3){
			store[0] = number1;
		}
		else if(number2 < number1 && number2 < number3){
			store[0] = number2;
		}
		else if(number3 < number1 && number3 < number2){
			store[0] = number3;
		}			
		else{
			if(number1 == number2 || number1 == number3){
				store[0] = number1;
			}
			else if(number2 == number3){
				store[0] = number2;
			}
		}
		if(number1 > number2 && number1 > number3){
			store[1] = number1;
		}
		else if(number2 > number1 && number2 > number3){
			store[1] = number2;
		}
		else if(number3 > number1 && number3 > number2){
			store[1] = number3;
		}			
		else{
			if(number1 == number2 || number1 == number3){
				store[1] = number1;
			}
			else if(number2 == number3){
				store[1] = number2;
			}
		}		
			return store;
	}		
}	