package com.sorting.eduresults;
import java.util.Scanner;

public class EduResults {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Score: ");
            int score = sc.nextInt();
            sc.nextLine(); 

            students[i] = new Student(name, score);
        }

        // Call merge sort
        RankGenerator.mergeSort(students, 0, students.length-1);

        System.out.println("\nFinal Rank List:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.score);
        }

        sc.close();
    }
}
