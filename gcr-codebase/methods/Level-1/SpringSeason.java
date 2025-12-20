import java.util.Scanner;
public class SpringSeason{
	public static void main(String []args) {
		//take input from command line
		System.out.println("Enter the values of month and day :");
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]); 
		
		// method called , print the output
		boolean isSpring = checkSpringSeason(month,day);
		
		//print the result
		if(isSpring){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}	
	}
	// check if spring season
	public static boolean checkSpringSeason(int month, int day){
		if(month == 3 && (day >= 20 && day <= 31) || month == 4 && (day >= 1 && day <= 30) || month == 5 && (day >= 1 && day <= 31) || (month == 6 && (day >= 1 && day <= 20))){
			return true;
		}
		else{
			return false;
		}	
	}
}	