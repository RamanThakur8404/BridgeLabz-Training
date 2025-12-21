import java.util.Scanner;
public class CheckLeapYear{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year= sc.nextInt();
		
		// Applying the required logic and Printing the results
		if(isLeapYear(year)){
			System.out.println("The Year "+year+" is a Leap Year");
		}else{
			System.out.println("The Year "+year+" is not a Leap Year");
		}
		sc.close();
	}
	
	// check for leap year
	public static boolean isLeapYear(int year){
		if(year>=1582){
			if((year % 4 == 0 && year % 100!=0) || year % 400 == 0){
				return true;
			}
			else{
				return false;
			}	
		}
		else{
			System.out.println("Leap year concept doesn't introduced before 1582");
		}
		return false;
	}
}