package com.constructor.level1;

//CourseDriver.java
public class CourseDriver {
 public static void main(String[] args) {

     // Creating course objects
     Course c1 = new Course("C++ Programming", 12, 5000);
     Course c2 = new Course("Python Programming", 6, 4500);

     // Display initial course details
     c1.displayCourseDetails();
     c2.displayCourseDetails();

     // Update institute name for all courses
     Course.updateInstituteName("DAVV Academy");

     // Display details after updating institute name
     c1.displayCourseDetails();
     c2.displayCourseDetails();
 }
}

