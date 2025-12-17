//Create a class PenDistribution which calculate the distributions of pen among the student and also showing the remaining pens.
public class PenDistribution {

	public static void main(String []args) {
		
		//Create a variable numberOfPens and assign value as 14
		int numberOfPens = 14;
		
		//Create a variable numberOfStudents and assign value as 3
		int numberOfStudents = 3;
		
		//Create a variable penPerStudent that indicate the quantity of pens per student.
		int penPerStudent = numberOfPens / numberOfStudents ;
		
		//Create a variable remainingPens that indicate the number of non-distributed pens.
		int remainingPens = numberOfPens % numberOfStudents ;
		
		//Display the Result
		System.out.println(" The Pen Per student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}
}	