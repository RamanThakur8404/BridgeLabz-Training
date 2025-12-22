import java.util.Scanner;
import java.util.Arrays;
public class Calendar{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month and year: ");
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		
		// generate month name, number of days and  first day of month
		String monthName = getMonthName(month);
		int daysInMonth = getDay(month,year);
		int firstDay = getFirstDay(month,year);
		
		System.out.println(monthName+ " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
        // Print initial spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
		
		// Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
	}

	//method to generate the name of month
	public static String getMonthName(int month){

		String []months = {"January","February","March","April", "May","June","July","August","September","October","November","December"};
				
		return months[month - 1];	
	}
	
	// method get the day of the month
	public static int getDay(int month,int year){
	
		int []days = {31, 28, 31, 30, 31, 30,31,31,30,31,30,31};
		if(month == 2){
			if(isLeapYear(year)){
				days[1] = 29;
			}	
		}
	return days[month - 1];		
    }
	
	public static boolean isLeapYear(int year){
		return (year % 4 == 0 && year % 100!=0 ) || year % 400 == 0;
	}	

    // Method to get first day of month (0 = Sunday)
    static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }
}

