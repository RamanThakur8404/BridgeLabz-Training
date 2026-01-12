package skillforge;
class Instructor extends User {
    public Instructor(String name, String email) {
        super(name, email);
    }

    public void uploadCourse(String title) {
        System.out.println(getName() + " uploaded course: " + title);
    }
}
