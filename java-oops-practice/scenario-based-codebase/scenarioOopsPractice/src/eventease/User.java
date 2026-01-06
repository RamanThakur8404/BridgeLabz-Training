package eventease;

public class User {

    private String name;
    private String email;
    private String phone; // sensitive data

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}

