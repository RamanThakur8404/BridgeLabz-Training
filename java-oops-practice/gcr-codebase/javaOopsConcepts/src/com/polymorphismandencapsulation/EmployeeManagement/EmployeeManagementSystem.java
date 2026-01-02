package com.polymorphismandencapsulation.EmployeeManagement;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(101, "Aman", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Amisha", 500, 40);

        ((Department) emp1).assignDepartment("HR");
        ((Department) emp2).assignDepartment("IT Support");

        Employee[] employees = { emp1, emp2 };

        EmployeeService.processEmployees(employees);
    }
}