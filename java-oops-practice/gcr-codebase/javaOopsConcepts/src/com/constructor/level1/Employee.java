package com.constructor.level1;

public class Employee {
    public String employeeID;       
    protected String department;    
    private double salary;        

    // Constructor to initialize employee details
    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public setter to update salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        System.out.println("");
    }
}

