package com.objectmodeling;
import java.util.ArrayList;

public class University {
	private String universityName;
	private ArrayList<UniversityDepartment> departments = new ArrayList<>();
	private ArrayList<Faculty> faculties = new ArrayList<>();
	
	public University(String universityName) {
		this.universityName = universityName;
	}
	
	public String getUniversityName() {
		return universityName;
	}
	
	public void addDepartment(String name) {
		departments.add(new UniversityDepartment(name));
	}
	
	public void addFaculty(Faculty faculty) {
		faculties.add(faculty);
	}
	
	public void displayUniversityDetails() {
		System.out.println("University Name: " + universityName);
		System.out.println("Show Departments:");
		for(UniversityDepartment d : departments) {
			d.showDepartments();
		}
		
		System.out.println("Show Faculties: ");
		for(Faculty f : faculties) {
			f.showFaculties();
		}
	}

}
