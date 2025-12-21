import java.util.Scanner;
public class CompareNaturalNumberSum{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//take user input
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		//Applying the required logic and Printing the results
		boolean isNaturalNumber = checkNaturalNumber(number);
		if(isNaturalNumber){
			int formulaSum = byFormulaSum(number);
			int recursiveSum = findrecursiveSum(number);
			if(recursiveSum == formulaSum){
				System.out.println(" Both methods prints the same output " + recursiveSum);
			}
			else{
				System.out.println(" Both methods prints the different output " + recursiveSum + " and " + formulaSum);	
			}
		}
		else{
		 System.out.println(" The given input is not a natural number ");
		}
		
		//close the scanner object	
		scanner.close();
	}
	
	// by formula calculate sum
	public static int byFormulaSum(int number){
		return number * (number + 1) / 2;
	}
	
	// find recursive sum 
	public static int findrecursiveSum(int number){
	    if(number == 0){
			return 0;
		}
		return number + findrecursiveSum(number - 1);
	}	

	// check natural number 
    public static boolean checkNaturalNumber(int number){
		if( number >=1 ){
			return true;
		}
		else{
			return false;
		}
	}	
}	