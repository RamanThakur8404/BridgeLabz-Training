package com.inheritance.assistedprobems.EmployeeSystem;

public class EmployeeHierarchy {
	public static void main(String []args) {
		//create object
		Employee developer = new Developer("Raman",21,425000);
		developer.displayDetails();
		
		Employee manager = new Manager("Yashraj",23,600000);
		manager.displayDetails();
		
		Employee intern = new Intern("Utkarsh",20,25000);
		intern.displayDetails();
	}
}