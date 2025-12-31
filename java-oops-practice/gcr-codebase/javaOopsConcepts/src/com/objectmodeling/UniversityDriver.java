package com.objectmodeling;

public class UniversityDriver {
    public static void main(String[] args) {

        // Independent Faculty objects
        Faculty faculty1 = new Faculty("Dr. Shami");
        Faculty faculty2 = new Faculty("Dr. Mehra");

        // Create University
        University uni = new University("Global University");

        // Add Departments (Composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        // Add Faculty (Aggregation)
        uni.addFaculty(faculty1);
        uni.addFaculty(faculty2);

        // Display
        uni.displayUniversityDetails();

        System.out.println("\nDeleting University...");
        uni = null;   // Departments are destroyed (composition)

        System.out.println("\nFaculty still exist:");
        faculty1.showFaculties();
        faculty2.showFaculties();
    }
}
