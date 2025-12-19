import java.util.Scanner;
public class CheckPrimeNumber {
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter number:");
		int number= read.nextInt();
		boolean isPrime= true;
		
		// Applying logic to check number is prime or not
		if(number<=1){
			isPrime=false;
		}
		else{
			for(int i =2;i<number;i++){
				if (number%i==0){
					isPrime=false;
					break;
				}
			}
		}
		
		// Printing the result and close the scanner object
		if(isPrime){
			System.out.println(number+" is a Prime Number");
		}else{
			System.out.println(number+" is not a Prime Number");
		}
		read.close();
	}
}