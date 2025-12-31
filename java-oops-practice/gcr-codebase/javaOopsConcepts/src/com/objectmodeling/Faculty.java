package com.objectmodeling;

public class Faculty {
	private String facultyName;
	
	public Faculty(String facultyName) {
		this.facultyName = facultyName;
	}
	
	public void showFaculties() {
		System.out.println("Faculties: " + facultyName);
	}
}
