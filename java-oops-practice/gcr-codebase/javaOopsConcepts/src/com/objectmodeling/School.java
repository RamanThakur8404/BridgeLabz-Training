package com.objectmodeling;
import java.util.ArrayList;

public class School {
	private String schoolName;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public School(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void showStudents() {
		System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println(s.getName());
        }
	}
}
