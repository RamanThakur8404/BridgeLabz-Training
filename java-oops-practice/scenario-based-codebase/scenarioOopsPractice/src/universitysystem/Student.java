package universitysystem;
import java.util.*;

public class Student {
	private String name;
	private int studentId;
	private double gpa;
	protected List<Enrollment> enrollments;
	
	public Student(int studentId,String name) {
		this.name = name;
		this.studentId = studentId;
		enrollments = new ArrayList<>();
	}

	public Student(int studentId, String name, Course elective) {
		this(studentId,name);
		enrolledCourse(elective);
	}
	
	public void enrolledCourse(Course course) {
		enrollments.add(new Enrollment(this,course));
	}
	
	 protected void calculateGPA() {
	        double totalPoints = 0;
	        int totalCredits = 0;

	        for (Enrollment e : enrollments) {
	            if (e.isGraded()) {
	                totalPoints += e.getGrade() * e.getCourse().getCredits();
	                totalCredits += e.getCourse().getCredits();
	            }
	        }

	        if (totalCredits > 0) {
	            gpa = totalPoints / totalCredits;
	        }
	    }

	    // Public access to transcript
	    public void showTranscript() {
	        calculateGPA();
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Name      : " + name);
	        System.out.println("GPA       : " + gpa);
	    }
}

