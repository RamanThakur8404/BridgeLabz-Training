import java.util.Scanner;
public class CheckLargest {
	public static void main(String []args) {
		
		Scanner input = new Scanner(System.in);
		//take 3 variable numbers as input from user
		int number1, number2, number3;
		number1 = input.nextInt();
		number2 = input.nextInt();
		number3 = input.nextInt();
			
		//check whether number is largest or not 
		if((number1 > number2) && (number1 > number3)){
			System.out.println("Is the first number the largest? Yes");
		}
		else {
			System.out.println("Is the first number the largest? No");
		}	
		if((number2 > number1) && (number2 > number3)){
			System.out.println("Is the second number the largest? Yes");
		}
		else {
			System.out.println("Is the second number the largest? No");
		}
		if((number3 > number2) && (number3 > number1)){
			System.out.println("Is the third number the largest? Yes");
		}
		else {
			System.out.println("Is the third number the largest? No");
		}
		
		//closing scanner object
		read.close();
	}
}	