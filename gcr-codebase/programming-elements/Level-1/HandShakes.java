import java.util.Scanner;
// Create a class HandShakes to compute the maximum number of handshakes among students.
public class HandShakes {
	public static void main(String []args) {
		// take user input
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		
		// calculate maximum number of possible handshakes
		int totalHandShakes = ( numberOfStudents * (numberOfStudents - 1)) / 2;
		
		//Display the ouput 
		System.out.println("The number of possible handshakes " + totalHandShakes);
	
	input.close();
	}	
}	