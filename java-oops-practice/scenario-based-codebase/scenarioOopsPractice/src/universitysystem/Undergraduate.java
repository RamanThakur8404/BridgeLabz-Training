package universitysystem;

public class Undergraduate extends Student {

    public Undergraduate(int id, String name) {
        super(id, name);
    }

    public Undergraduate(int id, String name, Course elective) {
        super(id, name, elective);
    }
}