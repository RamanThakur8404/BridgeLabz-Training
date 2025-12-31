package com.objectmodeling;

public class SchoolDriver {
	public static void main(String []args) {
		//create school
		School school = new School("Holy Cross School");
		
		// Create students
		Student rohan = new Student("Rohan");
		Student sohan = new Student("Sohan");
		Student mohit = new Student("Mohit");
		Student vevik = new Student("Vevik");
		
		// Add student to school
		school.addStudent(vevik);
		school.addStudent(mohit);
		school.addStudent(sohan);
		school.addStudent(rohan);
		
		Course pcm = new Course("Physics, Maths, Chemistry(PCM)");
		Course pcb = new Course("Physics, Chemistry, Biology(PCB)");
		
		vevik.addCourse(pcm);
		mohit.addCourse(pcm);
		sohan.addCourse(pcm);
		vevik.addCourse(pcb);
		
		school.showStudents();
		vevik.showCourses();
		rohan.showCourses();
		sohan.showCourses();
		
		pcm.displayStudents();
		pcb.displayStudents();
		
	}
}
