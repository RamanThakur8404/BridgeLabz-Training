package com.constructor.level1;

public class Manager extends Employee {
    String team;  // Team managed by the manager

    // Constructor to initialize manager details
    Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    // Display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);       
        System.out.println("Department  : " + department);     
        System.out.println("Salary      : " + getSalary());  
        System.out.println("");
    }
}

