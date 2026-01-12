package skillforge;
class BeginnerCourse extends Course {
    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public void certificateFormat() {
        System.out.println("Beginner Level Certificate ");