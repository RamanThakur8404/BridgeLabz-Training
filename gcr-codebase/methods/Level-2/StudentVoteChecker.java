import java.util.Scanner;
public class StudentVoteChecker{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int students=10;
		int age[]= new int[students];
		System.out.println("Enter age of 10 students:");
		for(int i=0;i<students;i++){
			age[i]=scanner.nextInt();
		}
		
		// check student vote, print the result
		StudentVoteChecker student = new StudentVoteChecker();
		for(int i=0;i<students;i++){
			if(student.canStudentVote(age[i])){
				System.out.println("This student is eligible to vote");
			}
			else{
				System.out.println("This student is not eligible to vote");
			}
		}
		scanner.close();
	}
	
	// check Student can Vote or not
	public boolean canStudentVote(int age){
		 if(age>=18){
			return true;
		}
		return false;
	}
}