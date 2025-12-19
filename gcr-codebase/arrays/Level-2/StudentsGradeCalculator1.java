import java.util.*;
public class StudentsGradeCalculator1{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter number of students:");
		 int number = scanner.nextInt();
		 if (number <= 0) {
            System.err.println("Invalid number of students.");
        }
		double [][] marks = new double[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];
		
		// Applying the required logic
		for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for Student "+ (i+1));
            System.out.print("Physics marks: ");
            marks[i][0] = scanner.nextDouble();
            System.out.print("Chemistry marks: ");
            marks[i][1] = scanner.nextDouble();
			System.out.print("Maths marks: ");
            marks[i][2] = scanner.nextDouble();
            // Validate marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.err.println("Marks cannot be negative. Re-enter details.");
                i--;
            }
        }
		for(int i=0;i<number;i++){
			 percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
			if (percentage[i]>=80) {
				grade[i] ='A';
			} 
			else if(percentage[i]>= 70) {
				grade[i] = 'B';
			}
			else if(percentage[i]>= 60) {
				grade[i] ='C';
			} 
			else if(percentage[i]>= 50) {
				grade[i] ='D';
			}
			else if(percentage[i]>= 40) {
				grade[i] ='E';
			}
			else {
				grade[i] ='R';
			}
		}
		
		// Printing the results and close scanner object
		for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics Marks  =  " + marks[i][0]);
            System.out.println("Chemistry Marks = " + marks[i][1]);
            System.out.println("Maths Marks     = " + marks[i][2]);
            System.out.println("Percentage      = " + percentage[i] + "%");
            System.out.println("Grade           = " + grade[i]);
        }
		scanner.close();
	}
}

