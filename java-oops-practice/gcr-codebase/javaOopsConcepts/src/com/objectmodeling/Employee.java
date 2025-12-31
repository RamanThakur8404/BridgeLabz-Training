package com.objectmodeling;

public class Employee {
	private String employeeName;
	
	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public void showEmployee() {
		System.out.println("Employee: " + employeeName);
	}
}
