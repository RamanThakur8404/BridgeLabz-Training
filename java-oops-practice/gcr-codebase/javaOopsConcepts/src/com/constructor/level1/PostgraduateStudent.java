package com.constructor.level1;

public class PostgraduateStudent extends Student {

private  String specialization;

 // Constructor
 PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
     super(rollNumber, name, CGPA);
     this.specialization = specialization;
 }

 // Display postgraduate student details
 public void displayPGDetails() {
     // Accessing protected member 'name' from superclass
     System.out.println("Roll Number    : " + rollNumber); 
     System.out.println("Name           : " + name);       
     System.out.println("Specialization : " + specialization);
     System.out.println("CGPA           : " + getCGPA()); 
     System.out.println();
 }
}

