package com.constructor.level1;

public class Course {
    // attribute
    private String courseName;
    private int duration; 
    private double fee;
    public static String instituteName = "XYZ Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " weeks");
        System.out.println("Fee         : " + fee);
        System.out.println("Institute Name  : " + instituteName);
        System.out.println();
    }

    // Class method to update institute name
   public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

