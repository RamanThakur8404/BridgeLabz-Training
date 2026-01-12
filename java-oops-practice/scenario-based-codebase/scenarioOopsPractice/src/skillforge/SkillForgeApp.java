package skillforge;
import java.util.Scanner;

public class SkillForgeApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instructor
        System.out.print("Enter instructor name: ");
        String instName = sc.nextLine();

        System.out.print("Enter instructor email: ");
        String instEmail = sc.nextLine();

        Instructor inst = new Instructor(instName, instEmail);

        // Student
        System.out.print("Enter student name: ");
        String stuName = sc.nextLine();

        System.out.print("Enter student email: ");
        String stuEmail = sc.nextLine();

        Student stu = new Student(stuName, stuEmail);

        // Course
        System.out.print("Enter course title: ");
        String courseTitle = sc.nextLine();

        Course course = new Course(courseTitle, inst);
        inst.uploadCourse(courseTitle);

        // Progress
        System.out.print("Enter progress update 1 (%): ");
        stu.updateProgress(sc.nextInt());

        System.out.print("Enter progress update 2 (%): ");
        stu.updateProgress(sc.nextInt());

        // Rating
        System.out.print("Enter course rating (0–5): ");
        course.addRating(sc.nextDouble());

        // Certificate
        stu.generateCertificate();
        System.out.println("Course Rating: " + course.getRating());

        // Polymorphism
        BeginnerCourse bc = new BeginnerCourse("Beginner " + courseTitle, inst);
        AdvancedCourse ac = new AdvancedCourse("Advanced " + courseTitle, inst);

        bc.certificateFormat();
        ac.certificateFormat();

        sc.close();
    }
}
