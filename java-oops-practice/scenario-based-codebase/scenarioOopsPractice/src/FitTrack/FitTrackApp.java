package FitTrack;
import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();

        System.out.print("Enter daily calorie goal: ");
        int goal = sc.nextInt();

        UserProfile user = new UserProfile(name, age, weight, goal);

        // Workout selection
        System.out.println("\nSelect workout type:");
        System.out.println("1. Cardio");
        System.out.println("2. Strength");
        int choice = sc.nextInt();

        System.out.print("Enter workout duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;

        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        workout.startWorkout();
        int burned = workout.calculateCalories();
        workout.stopWorkout();

        // Operator usage
        int remaining = user.getDailyGoal() - burned;

        System.out.println("\n--- Daily Summary ---");
        System.out.println("User: " + user.getName());
        System.out.println("Calories Burned: " + burned);
        System.out.println("Remaining Target: " + remaining);

        sc.close();
    }
}

