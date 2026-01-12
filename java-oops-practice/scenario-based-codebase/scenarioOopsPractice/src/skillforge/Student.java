package skillforge;
class Student extends User implements ICertifiable {
    private int progress; // percentage

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    public void updateProgress(int value) {
        progress += value;   // operator usage
        if (progress > 100) progress = 100;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100) {
            System.out.println("Certificate generated for student: " + getName());
        } else {
            System.out.println("Complete course to get certificate");
        }
    }
}