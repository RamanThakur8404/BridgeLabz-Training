package collegeinformationsystem;

public class Student extends Person implements ICourseActions{
	private int []grades;
	private double grade;
	
	public Student(String name, String email, int id,int []grades) {
		super(name,email,id);
		this.grades = grades;
		calculateGPA();
	}
	
	private void calculateGPA() {
        int total = 0;
        for (int g : grades) {
            total += g;
        }
        this.grade = (double) total / grades.length / 10; // GPA logic
    }

    @Override
    public void enrollCourse(Course course) {
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        course.removeStudent(this);
    }

	public double getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Student id: " + getId());
		System.out.println("Student name: " + getName());
		System.out.println("Student email: " + getEmail());
		System.out.println("Student Grade: " + getGrade());
	}
	
}
