import java.util.Scanner;

public class OnlineQuizApplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           String[] questions = {
            "1. Java is a _____ language.",
            "2. Which keyword is used to create an object?",
            "3. Which symbol is used for single-line comment?",
            "4. Which loop runs at least once?",
            "5. JVM stands for?"
        };

        String[][] options = {
            {"A. low-level", "B. high-level", "C. machine", "D. assembly"},
            {"A. new", "B. create", "C. object", "D. class"},
            {"A. /* */", "B. //", "C. <!-- -->", "D. #"},
            {"A. for", "B. while", "C. do-while", "D. if"},
            {"A. Java Virtual Machine", "B. Java Variable Method", "C. Java Verified Mode", "D. None"}
        };

        char[] correctAnswers = {'B', 'A', 'B', 'C', 'A'};
        int score = 0;

        System.out.println(" Online Quiz Application Started");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char answer = scanner.next().toUpperCase().charAt(0);

           switch (answer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (answer == correctAnswers[i]) {
                        score++;
                        System.out.println(" Correct Answer");
                    } 
					else {
                        System.out.println(" Wrong Answer");
                    }
                    break;
                default:
                    System.out.println("❗ Invalid option (No marks awarded)");
            }
        }

        System.out.println("\n Quiz Completed!");
        System.out.println(" Your Score: " + score + " / 5");

        scanner.close();
    }
}

