import java.util.*;
public class StudentsGradeCalculator{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter number of students:");
		 int number = scanner.nextInt();
		 if (number <= 0) {
            System.err.println("Invalid number of students.");
            System.exit(0);
        }
		double[] physicsMarks = new double[number];
        double[] chemistryMarks = new double[number];
        double[] mathsMarks = new double[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];
		
		// Applying the required logic
		for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student "+ (i+1));
            System.out.print("Physics marks: ");
            physicsMarks[i] = scanner.nextDouble();
            System.out.print("Chemistry marks: ");
            chemistryMarks[i] = scanner.nextDouble();
			System.out.print("Maths marks: ");
            mathsMarks[i] = scanner.nextDouble();
            // Validate marks
            if (physicsMarks[i] < 0 || chemistryMarks[i] < 0 || mathsMarks[i] < 0) {
                System.err.println("Marks cannot be negative. Re-enter details.");
                i--;
                continue;
            }
        }
		for(int i=0;i<number;i++){
			 percentage[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;
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
            System.out.println("Physics Marks  =  " + physicsMarks[i]);
            System.out.println("Chemistry Marks = " + chemistryMarks[i]);
            System.out.println("Maths Marks     = " + mathsMarks[i]);
            System.out.println("Percentage      = " + percentage[i] + "%");
            System.out.println("Grade           = " + grade[i]);
        }
		scanner.close();
	}
}

