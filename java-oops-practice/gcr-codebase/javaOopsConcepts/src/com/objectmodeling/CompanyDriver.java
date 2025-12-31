package com.objectmodeling;

public class CompanyDriver {
	public static void main(String []args) {
		
		Company company = new Company("Tech Sparks");
		
		Department it = new Department("IT");
		Department hr = new Department("HR");
		Department finance = new Department("Finance");
		Department marketing = new Department("Marketing");
		Department sales = new Department("Sales");
		
		it.addEmployee("Amit");
		it.addEmployee("Neha");
		hr.addEmployee("Rahul");
		finance.addEmployee("Priya");
		marketing.addEmployee("Suresh");
		sales.addEmployee("Anjali");
		
		company.addDepartment(it);
		company.addDepartment(hr);
		company.addDepartment(finance);
		company.addDepartment(marketing);
		company.addDepartment(sales);
		
		company.displayCompanyDetails();
		

	}
}
