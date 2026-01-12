package skillforge;
class AdvancedCourse extends Course {
    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public void certificateFormat() {
        System.out.println("Advanced Level Certificate with Project Badge for Java Programming.");
    }
}
