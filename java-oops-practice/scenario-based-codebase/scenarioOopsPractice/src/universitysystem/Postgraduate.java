package universitysystem;

public class Postgraduate extends Student {

    public Postgraduate(int id, String name) {
        super(id, name);
    }

    public Postgraduate(int id, String name, Course elective) {
        super(id, name, elective);
    }
}
