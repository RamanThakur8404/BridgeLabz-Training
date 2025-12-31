package com.objectmodeling;
import java.util.ArrayList;
public class Department {
	//attribute
	private String departmentName;
	private ArrayList<Employee> employees;
	
	public Department(String departmentName) {
		this.departmentName = departmentName;
		employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(String employeeName) {
		employees.add(new Employee(employeeName));
	}
	
	public void displayDepartment() {
		System.out.println("Department: " + departmentName);
		for(Employee employee : employees) {
			employee.showEmployee();
		}
	}
	
}
