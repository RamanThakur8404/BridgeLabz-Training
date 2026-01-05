package collegeinformationsystem;

import java.util.Scanner;

public class CampusConnect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faculty Input
        System.out.println("Enter Faculty ID:");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Faculty Name:");
        String fname = sc.nextLine();

        System.out.println("Enter Faculty Email:");
        String femail = sc.nextLine();

        System.out.println("Enter Faculty Department:");
        String dept = sc.nextLine();

        System.out.println("Enter Faculty Department ID:");
        int deptId = sc.nextInt();

        Faculty faculty = new Faculty(fname, femail, fid, deptId, dept);

        // Course Input
        sc.nextLine();
        System.out.println("Enter Course Name:");
        String courseName = sc.nextLine();

        System.out.println("Enter Course ID:");
        int courseId = sc.nextInt();

        System.out.println("Enter Course Duration (weeks):");
        int duration = sc.nextInt();

        Course course = new Course(courseName, courseId, duration, faculty);

        // Student Input
        sc.nextLine();
        System.out.println("Enter Student ID:");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String sname = sc.nextLine();

        System.out.println("Enter Student Email:");
        String semail = sc.nextLine();

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            grades[i] = sc.nextInt();
        }

        Student student = new Student(sname, semail, sid, grades);

        student.enrollCourse(course);

        System.out.println("\n--- STUDENT DETAILS ---");
        student.printDetails();

        System.out.println("\n--- FACULTY DETAILS ---");
        faculty.printDetails();

        System.out.println("\n--- COURSE DETAILS ---");
        course.printCourseDetails();

        sc.close();
    }
}
