import java.util.Scanner;
public class ElectionBooth{
	public static void main(String []args){
		//take user input
		Scanner read = new Scanner(System.in);
		int candidate1 = 0,candidate2 = 0,candidate3 = 0;
		
		//applying the logic
		while(true){
			System.out.println("Enter the age(0 to exit) :");
			int age = read.nextInt();
			if(age == 0){
				break;
			}
			if(age>=18){
				System.out.println("Vote (vote1/vote2/vote3)");
				String vote = read.next().toLowerCase();
			
				if(vote.equals("vote1")){
					candidate1++;
				}
				else if(vote.equals("vote2")){
					candidate2++;
				}
				else if(vote.equals("vote3")){
					candidate3++;
				}
				else{
					System.out.println("Invalid vote");
				}
			}
			else{
				System.out.println("Not eligible to vote");
			}
		}
		
		//print the result
		System.out.println("\n Voting Result: ");
		System.out.println("Candidate 1: " + candidate1);
		System.out.println("Candidate 2: " + candidate2);
		System.out.println("Candidate 3: " + candidate3);
		read.close();	
	}
}	
			
			