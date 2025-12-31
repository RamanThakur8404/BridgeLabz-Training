package com.objectmodeling;
import java.util.ArrayList;

public class Student {
	// attribute
	private String studentName;
	private ArrayList<Course> courses;
	
	public Student(String studentName) {
		this.studentName = studentName;
		courses = new ArrayList<Course>();
	}
	
	public String getName() {
		return studentName;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		course.addStudent(new Student(studentName));
	}
	
	public void showCourses() {
		System.out.println("\nStudent " + studentName + " taken course is:");
		if(courses.size()==0) {
			System.out.println("not enrolled to any courses");
		}
		else {
			for(Course course: courses) {
				System.out.println(course.getCourseName());
			}
		}	
	}	
}
