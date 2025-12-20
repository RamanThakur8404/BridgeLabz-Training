import java.util.Scanner;
public class HandShakes{
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		//take user input
		System.out.println("Enter the number of students ");
		int numberOfStudents = read.nextInt();
		
		// method call
		HandShakes obj = new HandShakes();
		int maximumhandShakes = obj.findTotalHandShakes(numberOfStudents);
		
		//print the result and close the scanner object
		System.out.println("The number of possible handshakes " + maximumhandShakes);
		read.close();
	}
	
	// method definition
	int findTotalHandShakes(int numberOfStudents){
		return (numberOfStudents * (numberOfStudents - 1) / 2);
	}	
}	