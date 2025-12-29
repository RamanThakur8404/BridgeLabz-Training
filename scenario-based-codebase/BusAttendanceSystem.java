import java.util.Scanner;
public class BusAttendanceSystem{
	public static final int TOTAL_STUDENT = 10;
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		String[] names = {"Maya", "Neil", "Zara", "Rohan", "Kiara", "Kian", "Meera", "Aryan", "Anika", "Arin"};
		int presentStudent = 0;
		int absentStudent = 0;

		// fetch the name
		for(String name:names){
			System.out.println(name + " is present or not ?(p/a)");
			char check = Character.toLowerCase(input.next().charAt(0));
			if(check == 'p'){
				presentStudent++;
			}
			else{
				absentStudent++;
			}
		}
		
		// display result
		displayAttendance(presentStudent, absentStudent);
		input.close();
	}
	
	// method to display result
	public static void displayAttendance(int present, int absent){
		System.out.println("-------Bus Attendance Record ---------");
		System.out.println("Total Student:\t\t\t" + TOTAL_STUDENT);
		System.out.println("Present Student:\t\t" + present); 
		System.out.println("Absent Student:\t\t\t" + absent); 
	}	
}	
		