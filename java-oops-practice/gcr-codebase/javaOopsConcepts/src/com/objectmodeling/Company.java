package com.objectmodeling;
import java.util.ArrayList;
public class Company {
	// attribute
	private String companyName;
	private ArrayList<Department> departments;
	
	public Company(String companyName) {
		this.companyName = companyName;
		departments = new ArrayList<Department>();
	}
	
	public void  addDepartment(Department department) {
		departments.add(department);
	}
	
	public void displayCompanyDetails() {
		System.out.println("Company Name: " + companyName);
		for(Department department : departments) {
			department.displayDepartment();
			System.out.println();
		}
		
	}
}
