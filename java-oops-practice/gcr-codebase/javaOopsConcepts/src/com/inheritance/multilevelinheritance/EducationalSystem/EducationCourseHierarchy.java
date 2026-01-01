package com.inheritance.multilevelinheritance.EducationalSystem;

public class EducationCourseHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaidOnlineCourse course = new PaidOnlineCourse("JAVA PROGRAMMING",120,"Udemy", true, 12000,20);
		
		course.displayCourseDetails();
	}

}
