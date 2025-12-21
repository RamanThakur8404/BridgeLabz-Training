import java.util.Scanner;
public class FindFactor{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
	
		// applying the logic
		int []factors = findFactors(number);
		int sum = sumOfFactor(factors);
		int product = productOfFactors(factors);
		int squareFactors = sumSquareFactors(factors);
		
		//Printing the result and close scanner close
		System.out.println("The sum of factors is " + sum);
		System.out.println("The product of factors is " + product);
		System.out.println("The sum of squares of factors is " + squareFactors);
		scanner.close();
	}

	// calculate the factors
	public static int []findFactors(int number){
		int originalNumber = number;
		int count = 0;
		while(number!=0){
			count++;
			number /= 10;
		}
		int []factors = new int[count];
		for(int i=0;i<count;i++){
			int digit = originalNumber % 10;
			factors[i] = digit;
			originalNumber /= 10;
		}
		return factors;
	}

	//sum of factors
	public static int sumOfFactor(int []factors){
		int sum = 0;
		for(int i=0;i<factors.length;i++){
			sum += factors[i];
		}
		return sum;
	}

	//product of factors
		public static int productOfFactors(int []factors){
		int product = 1;
		for(int i=0;i<factors.length;i++){
			product *= factors[i];
		}
		return product;
	}
	
	// sum of Square of factors
		public static int sumSquareFactors(int []factors){
		int squareSum = 0;
		for(int i=0;i<factors.length;i++){
			squareSum += Math.pow(factors[i],2);
		}
		return squareSum;
	}
}	