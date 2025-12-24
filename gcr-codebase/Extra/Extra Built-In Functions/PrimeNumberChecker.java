import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check whether the number is prime? ");
		int number = scanner.nextInt();
		
		//applying the logic
		boolean isPrime = checkPrimeNumber(number);
		
		//print the result
		System.out.println("Given number is prime number ? " + isPrime);
	}
	
	// check the prime number
	public static boolean checkPrimeNumber(int number){
		if(number <= 1){
			return false;
		}
		for(int i=2; i<Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}	
}	