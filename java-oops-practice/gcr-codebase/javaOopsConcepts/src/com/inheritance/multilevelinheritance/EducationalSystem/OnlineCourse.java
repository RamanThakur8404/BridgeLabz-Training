package com.inheritance.multilevelinheritance.EducationalSystem;

public class OnlineCourse extends Course{
//	attribute
	protected String platform;
	protected boolean isRecorded;
	
//	constructor
	public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
		super(courseName,duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}

}
