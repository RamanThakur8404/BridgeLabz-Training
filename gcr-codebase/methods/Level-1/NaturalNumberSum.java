import java.util.Scanner;
public class NaturalNumberSum{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//take user input
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		//method call to find sum
		int sum = numberSum(number);
		
		//print the result and close the scanner object
		System.out.println("The sum of " + number +" natural numbers is "+ sum);
		scanner.close();
	}
	public static int numberSum(int number){
		int sum = 0;
		for(int i=1;i<=number;i++){
			sum += i;
		}
		return sum;
	}		
}	