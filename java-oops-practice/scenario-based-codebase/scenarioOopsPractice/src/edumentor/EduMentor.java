package edumentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EduMentor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
     // Learner input
        System.out.println("Enter Learner Name:");
        String name = sc.nextLine();

        System.out.println("Enter Learner Email:");
        String email = sc.nextLine();

        System.out.println("Enter Learner ID:");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Course Type: ");
        String courseType = sc.nextLine();
        
        System.out.println("Is learner full-time? (true/false):");
        boolean fullTime = sc.nextBoolean();
        sc.nextLine();

        
        Learner learner = new Learner(name, email, courseType,id, fullTime);
        
     // ---------- Instructor Input ----------
        System.out.println("\nEnter Instructor Name:");
        String iname = sc.nextLine();

        System.out.println("Enter Instructor Email:");
        String iemail = sc.nextLine();

        System.out.println("Enter Instructor ID:");
        int iid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Instructor Specialization:");
        String specialization = sc.nextLine();

        Instructor instructor = new Instructor(iname, iemail, iid, specialization);
        
        System.out.println("Select Difficulty Level:");
        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");
        int difficulty = sc.nextInt();
        sc.nextLine();

        List<String> questions;
        List<String> correctAnswers;

        // -------- Difficulty-wise Question Bank --------
        if (difficulty == 1) { // EASY
            questions = Arrays.asList("Java is a programming language?","Java supports OOP?","JVM stands for Java Virtual Machine?","Java code runs on JVM?","Java is case sensitive?");
            correctAnswers = Arrays.asList(
                    "yes", "yes", "yes", "yes", "yes"
            );

        } else if (difficulty == 2) { // MEDIUM
            questions = Arrays.asList("Java is platform independent?","OOP supports inheritance?","JVM converts bytecode to machine code?","Method overloading is compile-time polymorphism?","Java supports interfaces?");
            correctAnswers = Arrays.asList("yes", "yes", "yes", "yes", "yes");

        } else if (difficulty == 3) { // HARD
            questions = Arrays.asList("Java supports multiple inheritance using classes?","JVM is platform dependent?","Garbage collection is manual in Java?","Abstract class can have constructors?","JIT compiler improves performance?");
            correctAnswers = Arrays.asList("no", "yes", "no", "yes", "yes");

        } else {
            System.out.println("Invalid difficulty level");
            sc.close();
            return;
        }

        // -------- Create Quiz --------
        Quiz quiz = new Quiz(questions, correctAnswers, difficulty);

        // -------- 1 Question → 1 Answer Flow --------
        List<String> userAnswers = new ArrayList<>();

        System.out.println("\n--- QUIZ START ---");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions.get(i));

            System.out.print("Your Answer: ");
            userAnswers.add(sc.nextLine());
        }

        // -------- Evaluation --------
        quiz.attemptQuiz(userAnswers);

        // -------- Result --------
        System.out.println("\n--- RESULT ---");
        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.calculatePercentage() + "%");
        System.out.println("Learner Certificate:");
        System.out.println(learner.generateCertificate(quiz.calculatePercentage()));

        System.out.println("\nInstructor Certificate:");
        System.out.println(instructor.generateCertificate(quiz.calculatePercentage()));
        sc.close();
    }
}
