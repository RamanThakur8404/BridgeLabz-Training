/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class LibraryReminderApp{
	public static final int FINE_PER_DAY = 5;
	public static void main(String []args){
		Scanner scanner	= new Scanner(System.in);
		System.out.println(" Welcome to Rohan's Library Remainder App ");
		
		for(int i=0; i<5; i++){
			System.out.println("\n Book " + (i+1));
			System.out.println("Enter issue date (dd-MM-yyyy): ");	
			String issueDate = scanner.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate issuedDate = LocalDate.parse(issueDate, formatter);
			
			System.out.println("Enter last date (dd-MM-yyyy): ");
			String dueDate = scanner.nextLine();
			LocalDate lastDate = LocalDate.parse(dueDate, formatter);
			
			System.out.println("Enter the date when you have submitted the book (dd-MM-yyyy): ");
			String submitDate = scanner.nextLine();
			LocalDate submittedDate = LocalDate.parse(submitDate, formatter);
			
			if(submittedDate.isAfter(lastDate)){
				long latedays = ChronoUnit.DAYS.between(lastDate,submittedDate);
				long fine = latedays * FINE_PER_DAY;
				System.out.println("Late by " + latedays +" days so the total fine is " + fine);
			}
			else{
				System.out.println("No fine, returned before it");
			}
		}	
		scanner.close();
	}
}	