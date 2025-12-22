import java.util.Scanner;
import java.util.Arrays;
public class NumberFactors{
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array age, take input for user
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//Applying the logic
		int []factors = findFactor(number);
		int greatestFactor = findGreatestFactor(factors);
		int sum = findSum(factors);
		int product = findProduct(factors);
		int productCube = findProductCube(factors);
		
		//print the output
		System.out.println("The factors are: ");
		printFactor(factors);
		System.out.println("The greatest factor is " + greatestFactor);
		System.out.println("The sum of factors is " + sum);
		System.out.println("The product of factors is " + product);
		System.out.println("The product of cube of factors is " + productCube);
		input.close();
	}
	
	// print the factors
	public static void printFactor(int []factors){
		System.out.println(Arrays.toString(factors));
	}
	
	// method to find greatest factor
	public static int greatestFactor(int []factors){
		int greatest = Integer.MIN_VALUE;
		for(int i=0; i<factors.length; i++){
			greatest = Math.max(greatest, factors[i]);
		}
		return greatest;
	}
	
	// method to find sum of factor
	public static int findSum(int []factors){
		int sum = 0;
		for(int i=0; i<factors.length; i++){
			sum += factors[i];
		}
		return sum;
	}
	
	// method to find sum of factor
	public static int findProduct(int []factors){
		int product = 1;
		for(int i=0; i<factors.length; i++){
			product *= factors[i];
		}
		return product;
	}
	
	// method to find product cube of factor
	public static int findProductCube(int []factors){
		int product = 1;
		for(int i=0; i<factors.length; i++){
			product *= Math.pow(factors[i],3);
		}
		return product;
	}
}	