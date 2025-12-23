import java.util.Scanner;
public class CheckStudentVoteEligibility {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of ages :");
        int number = scanner.nextInt();
		
		//applying logic
		int []age = generateRandomAge(number);
		String [][]result = checkVotingEligibility(age);
		
		//print the result
		System.out.println("\nAge\tCan Vote?");
        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
		scanner.close();
	}
	
	// generate random ages
	public static int[] generateRandomAge(int n){
		int []age = new int[n];
		for(int i=0;i<n;i++){
			age[i] = (int)(Math.random() * 90) + 10;
		}
		return age;
	}
	
	 // check voting eligibility and create a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
           if (age >= 18) {
                result[i][1] = "true";  
            }
			else {
                result[i][1] = "false";
            }
        }
        return result;
    }
}