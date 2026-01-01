package com.inheritance.multilevelinheritance.EducationalSystem;

public class PaidOnlineCourse extends OnlineCourse {
	//attribute
	protected int fee;
	protected double discount;
	
	//constructor
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, double discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}

	// method to display details
	public void displayCourseDetails() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration + "days");
		System.out.println("Platform: " + platform);
		System.out.println("Recorded: " + isRecorded);
		System.out.println("Fees: " + fee);
		System.out.println("Discount: " + discount);
		
		
		
		
	}
}
