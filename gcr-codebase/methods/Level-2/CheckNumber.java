import java.util.*;
public class CheckNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int numbers[]=new int[5];
		System.out.println("Enter 5 numbers :");
		for(int i =0;i<numbers.length;i++){
			numbers[i]=sc.nextInt();
		}
		
		// check number positive,even and print the results
		for(int i =0;i<numbers.length;i++){
			if(isPositive(numbers[i])){
				if(isEven(numbers[i])){
					System.out.println("The given number is positive and even");
				}
				else{
					System.out.println("The given number is positive and odd");
				}
			}
			else{
				System.out.println("The given number is negative");
			}
		}
		if(compare(numbers) == 0){
			System.out.println("The first and last number are equal");
		}
		else if(compare(numbers) == 1){
			System.out.println("The first number is greater than last number ");
		}
		else {
			System.out.println("The first number is less than last number ");
		}
		sc.close();
	}
	
	// Check whether the number is positive or negative
	public static boolean isPositive(int number){
		if(number<0){
			return false;
		}
		return true;
	}
	
	// check whether the number is even or odd
	public static boolean isEven(int number){
           if (number%2==0) {
              return true;
           }
		return false;
	}
	
	// compare the first and last element of the array
	public static int compare(int numbers[]){
		int firstElement = numbers[0];
		int lastElement = numbers[numbers.length-1];
		if(firstElement == lastElement){
			return 0;
		}
		else if (firstElement > lastElement){
			return 1;
		}
		else{
			return -1;
		}
	}
}