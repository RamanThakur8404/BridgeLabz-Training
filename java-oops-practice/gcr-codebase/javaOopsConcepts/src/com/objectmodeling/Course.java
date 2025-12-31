package com.objectmodeling;
import java.util.ArrayList;
public class Course {
	// attribute
	private String courseName;
	private ArrayList<Student> students;
	
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<Student>();
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void displayStudents() {
		System.out.println("Course: " + courseName);
		for(Student s :students) {
			System.out.println(s.getName());
		}
	}
}
