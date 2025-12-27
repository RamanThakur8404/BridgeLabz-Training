package com.constructor.level1;

public class EmployeeDriver {
    public static void main(String[] args) {

        // Create base Employee object
        Employee e1 = new Employee("E001", "IT", 50000);
        e1.displayEmployeeDetails();

        // Update salary using public setter
        e1.setSalary(55000);
        System.out.println("Updated Salary: " + e1.getSalary());
        System.out.println("");

        // Create Manager object
        // Demonstrates subclass access to public and protected members
        Manager m1 = new Manager("M001", "HR", 75000, "Recruitment Team");
        m1.displayManagerDetails();
    }
}
