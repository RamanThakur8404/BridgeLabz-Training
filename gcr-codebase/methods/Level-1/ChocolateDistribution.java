import java.util.Scanner;
public class ChocolateDistribution{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//take user input
		System.out.println("Enter the number of chocolate and number of children: ");
		int numberOfchocolates = scanner.nextInt();
		int numberOfChildren = scanner.nextInt();
		
		//declare array to store quotient and remainder
		int []chocolate = chocolateDistributed(numberOfchocolates,numberOfChildren); 
		
		//print the result and close the scanner object
		System.out.println("The number of chocolate each student has is: "+ chocolate[0]);
		System.out.println("The number of remaining chocolates are: "+ chocolate[1]);
		scanner.close();
	}
	
	//method definition
	public static int[] chocolateDistributed(int number,int divisor){
		int []store = new int[2];
		store[0] = number / divisor;
		store[1] = number % divisor;
		return store;
	}		
}	