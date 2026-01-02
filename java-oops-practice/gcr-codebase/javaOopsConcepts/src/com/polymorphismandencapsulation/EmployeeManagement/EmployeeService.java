package com.polymorphismandencapsulation.EmployeeManagement;

public class EmployeeService {
	
	public static void processEmployees(Employee[] employees) {
		
		for(Employee emp : employees) {
			emp.displayDetails();
		
			if(emp instanceof Department) {
				Department dept = (Department) emp;
				System.out.println(dept.getDepartmentDetails());
			}
			
			System.out.println("Calculated Salary: " + emp.calculateSalary());
		}
		
	}
}
