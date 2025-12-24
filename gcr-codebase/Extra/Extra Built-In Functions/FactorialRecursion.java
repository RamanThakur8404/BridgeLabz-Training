import java.util.Scnner;
public class FactorialRecursion{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find factorial: ");
		int number = scanner.nextInt();
		
		// applying the logic
		int factorial = findFactorial(number);
		
		//print the result
		System.out.println("The factorial of number is: "+ factorial;
		scanner.close();
	}
	
	// find factorial 
	public static int findFactorial(int number){
		if(number == 1){
			return 1;
		}	
		int fact = 1;
		return fact * findFactorial(number-1);
	}
}	