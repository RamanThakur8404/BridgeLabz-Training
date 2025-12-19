import java.util.Scanner;
public class VoteEligibility {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array age, take input for user
		System.out.println("Enter the number of students: ");
		int numberOfStudent = input.nextInt();
		System.out.println("Enter the age of this " + numberOfStudent +" students: ");
		int age[] = new int[numberOfStudent];
		for(int i=0;i<age.length;i++) {
			age[i] = input.nextInt();
		}
		
		// applying the logic
		for(int i=0;i<age.length;i++){
			if(age[i] < 0){
			System.out.println("Invalid age");
			}
			else if(age[i] >= 18 ){
				System.out.println("The student with the age " + age[i] + " can vote."); 
			}
			else{
				System.out.println("The student with the age " + age[i] + " cannot vote."); 
			}
		}

		// close scanner object
		input.close();
	}	
}		
		