package universitysystem;

public class UniversityEnrollmentSystem {
	    public static void main(String[] args) {

	        Course java = new Course("CS101", "Java Programming",6, 4);
	        Course ml = new Course("CS501", "Machine Learning",2, 3);

	        Student s1 = new Undergraduate(101, "Ravi", java);
	        Student s2 = new Postgraduate(201, "Anita", ml);

	        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");

	        // Assign grades
	        f1.assignGrade(s1.enrollments.get(0), 8.5);
	        f1.assignGrade(s2.enrollments.get(0), 9.0);

	        // Show transcripts
	        s1.showTranscript();
	        System.out.println();
	        s2.showTranscript();
	    }
}
