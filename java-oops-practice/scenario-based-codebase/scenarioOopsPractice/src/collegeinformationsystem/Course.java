package collegeinformationsystem;

import java.util.ArrayList;

public class Course{
	ArrayList<Student> students;
	Faculty faculty;
	private String courseName;
	private int courseId;
	private int duration;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Course(String courseName, int courseId, int duration, Faculty faculty) {
		this.setCourseId(courseId);
		this.setCourseName(courseName);
		this.setDuration(duration);
		this.faculty = faculty;
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
		System.out.println(student.getName() + "enrolled in course" + getCourseName() + "with course id" + getCourseId() + " and of " + getDuration() + "weeks");
	}
	
	public void removeStudent(Student student) {
        students.remove(student);
        System.out.println(student.getName() + " dropped from " + courseName);
    }

    public void printCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Total Students: " + students.size());
    }
	
	
	
	
}
