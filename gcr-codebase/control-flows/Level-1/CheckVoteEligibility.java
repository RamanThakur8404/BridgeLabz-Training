import java.util.Scanner;
public class CheckVoteEligibility {
	public static void main( String []args ) {
		
		Scanner input = new Scanner(System.in);
		//take input from the user
		System.out.println("Enter your current age : ");
		int age = input.nextInt();
		
		// check eligible by conditional statement
		if(age >= 18){
			System.out.println("If the  person's age is greater or equal to 18 then the output is");
			System.out.println("The person's age is "+ age +" can vote.");
		}
		else{
			System.out.println("The person cannot vote.");
		}	
	
		// close the scanner object
		input.close();
	}
}	
		
		