import java.util.Scanner;
public class LeapYear {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		// take user input 
		System.out.println("Enter the year: ");
		int year = read.nextInt();
		
		
		// check whether leap or not using conditional statement 
		// first part with multiple if-else
		if(year>=1582){
			System.out.println("Using first part with multiple if-else");
			if(year % 400 == 0){
				System.out.println("This year is leap year");
			}			
			else if(year % 100 == 0){
				System.out.println("This year is not a leap year");
			}
			else if(year % 4 == 0){
				System.out.println("This year is leap year");
			}
			else{
				System.out.println("This year is not a leap year");
			}
			
			//second part with single if and multiple logic
			System.out.println("Using second part with single if and multiple logic");
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
				System.out.println("This year is leap year");
			}
			else{
				System.out.println("This year is not a leap year");
			}
        }
		else{
		System.out.println("There is no leap year before 1582 according to Gregorian calendar");
		}
		
		//scanner object close
		read.close();
	}	
			
}	