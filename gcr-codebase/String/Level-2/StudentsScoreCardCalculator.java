import java.util.Scanner;

public class StudentsScoreCardCalculator {
    // method to generate random PCM scores
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10; // Physics
            scores[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }
        return scores;
    }

    // method to calculate total, average, percentage
    public static double[][] calculateResult(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // method to calculate grade
    public static String[] calculateGrade(double[][] result) {
        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];

            if (percent >= 80)
                grade[i] = "A";
            else if (percent >= 70)
                grade[i] = "B";
            else if (percent >= 60)
                grade[i] = "C";
            else if (percent >= 50)
                grade[i] = "D";
            else if (percent >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }
        return grade;
    }

    // method to display scorecard 
    public static void displayScoreCard(int[][] scores, double[][] result, String[] grade) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("\nStudent " + (i+1));
            System.out.println("Physics Marks   = " + scores[i][0]);
            System.out.println("Chemistry Marks = " + scores[i][1]);
            System.out.println("Maths Marks     = " + scores[i][2]);
            System.out.println("Total           = " + (int)result[i][0]);
            System.out.println("Average         = " + result[i][1]);
            System.out.println("Percentage      = " + result[i][2] + "%");
            System.out.println("Grade           = " + grade[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();
		// ask to take input manually or randomly
        System.out.print("Do you want to enter marks manually? (yes/no): ");
        sc.nextLine(); 
        String choice = sc.nextLine();
        int[][] scores = new int[number][3];
        if (choice.equalsIgnoreCase("yes")) {
            for (int i = 0; i < number; i++) {
                System.out.println("\nEnter marks for Student " + (i+1));
                System.out.print("Physics marks: ");
                scores[i][0] = sc.nextInt();
                System.out.print("Chemistry marks: ");
                scores[i][1] = sc.nextInt();
                System.out.print("Maths marks: ");
                scores[i][2] = sc.nextInt();

                if (scores[i][0] < 0 || scores[i][1] < 0 || scores[i][2] < 0) {
                    System.err.println("Marks cannot be negative. Re-enter details.");
                    i--;
                }
            }
        } 
		else {
            scores = generateScores(number);
        }

		//applying the logic
        double[][] result = calculateResult(scores);
        String[] grade = calculateGrade(result);

        // Display scorecard
        displayScoreCard(scores, result, grade);
        sc.close();
    }
}
