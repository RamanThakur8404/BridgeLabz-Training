package com.polymorphismandencapsulation.EmployeeManagement;

abstract class Employee {
	
	private int employeeId;
	private String name;
	private double baseSalary;
	
	//constructor
	public Employee(int employeeId, String name,double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		setBaseSalary(baseSalary);
	}
	
	public void setBaseSalary(double baseSalary) {
		if(baseSalary >= 0) {
			this.baseSalary = baseSalary;
		}
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee Id: " + employeeId);
		   System.out.println("Name: " + name);
	        System.out.println("Base Salary: " + baseSalary);
	}
}
