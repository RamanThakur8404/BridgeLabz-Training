import java.util.Scanner;
public class RemainderAndQuotient{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//take user input
		System.out.println("Enter two numbers: ");
		int numberOne = scanner.nextInt();
		int numberTwo = scanner.nextInt();
		
		//declare array to store quotient and remainder
		int []remainderAndQuotientNumber = findRemainderAndQuotient(numberOne,numberTwo); 
		
		//print the result and close the scanner object
		System.out.println("The Quotient of "+ numberOne +" and "+ numberTwo +" is : "+ remainderAndQuotientNumber[0]);
		System.out.println("The Remainder of "+ numberOne +" and "+ numberTwo +" is : "+ remainderAndQuotientNumber[1]);
		scanner.close();
	}
	
	//method definition
	public static int[] findRemainderAndQuotient(int number1,int number2){
		int []store = new int[2];
		store[0] = number1 / number2;
		store[1] = number1 % number2;
		return store;
	}		
}	