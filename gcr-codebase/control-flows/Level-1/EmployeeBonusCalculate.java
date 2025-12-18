import java.util.Scanner;
public class EmployeeBonusCalculate {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare variable and take user input 
		System.out.print("Enter the year of service : ");
		int yearOfService = input.nextInt();
		System.out.print("and salary : ");
		int salary = input.nextInt();
		
		//check if year of service of employee is more than 5 years 
		double bonus = 0.0;
		if(yearOfService > 5 ){
			bonus = (salary * 5.0) / 100.0;
		}	
		
		//print the bonus and close the scanner object
		System.out.println("The bonus amount : " + bonus);
		input.close();
	}
}	