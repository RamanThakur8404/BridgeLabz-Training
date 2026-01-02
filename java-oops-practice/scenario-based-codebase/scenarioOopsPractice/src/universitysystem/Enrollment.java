package universitysystem;

public class Enrollment {
	 private Student student;
	    private Course course;
	    private double grade;
	    private boolean graded;

	    public Enrollment(Student student, Course course) {
	        this.student = student;
	        this.course = course;
	        this.graded = false;
	    }

	    public void setGrade(double grade) {
	        this.grade = grade;
	        this.graded = true;
	    }

	    public boolean isGraded() {
	        return graded;
	    }

	    public double getGrade() {
	        return grade;
	    }

	    public Course getCourse() {
	        return course;
	    }
}
