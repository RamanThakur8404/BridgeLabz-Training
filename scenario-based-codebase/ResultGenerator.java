import java.util.Scanner;
public class ResultGenerator {
    public static void main(String[] args) {
		//take user input
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            sum += sc.nextInt();
        }

        int avg = sum / 5;
        char grade = findGrade(avg);

        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
	
	// method to find grade 
	public static char findGrade(int avg){
        int key;
		char grade;
        if (avg >= 90){
			key = 1;
        }
		else if (avg >= 75){
			key = 2;
        }
		else if (avg >= 60){
			key = 3;
        }
		else if (avg >= 40){
			key = 4;
        }
		else{
			key = 5;
		}
		
        switch (key) {
            case 1:
				grade = 'A';
				break;
            case 2:
				grade = 'B';
				break;
            case 3: 
				grade = 'C';
				break;
            case 4:
				grade = 'D';
				break;
            default:
				grade = 'F';
        }
		return grade;
	}
}
