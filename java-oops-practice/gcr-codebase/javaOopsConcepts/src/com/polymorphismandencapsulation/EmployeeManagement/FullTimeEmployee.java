package com.polymorphismandencapsulation.EmployeeManagement;

public class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary(); // Fixed monthly salary
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}