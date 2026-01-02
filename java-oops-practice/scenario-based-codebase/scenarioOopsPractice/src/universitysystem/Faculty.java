package universitysystem;

public class Faculty implements Graded {

    private String name;
    private String department;

    public Faculty(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void assignGrade(Enrollment enrollment, double grade) {
        enrollment.setGrade(grade);
    }
}   
