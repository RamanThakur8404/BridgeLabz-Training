package universitysystem;

public class Course {
	private String courseName;
	private String courseCode;
	private int courseDuration;
	private int credits;
	
	public Course(String couseName, String courseCode, int courseDuration, int credits) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseDuration = courseDuration;
		this.credits = credits;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public String CourseDetails() {
		return courseCode + " - " + courseName + "(" + courseDuration + "weeks)";
	}
	
}
