package com.constructor.level1;

public class StudentDriver {
    public static void main(String[] args) {

        // Base Student
        Student s1 = new Student(101, "Martin", 8.5);
        s1.displayStudentDetails();

        // Modify CGPA using public setter
        s1.setCGPA(9.6);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println("");

        // Postgraduate Student
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Prince", 9.2, "Data Science");
        pg1.displayPGDetails();
    }
}

