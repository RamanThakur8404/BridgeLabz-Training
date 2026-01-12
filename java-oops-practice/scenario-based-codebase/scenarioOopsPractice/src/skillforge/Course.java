package skillforge;

import java.util.List;

class Course {
    private String title;
    private Instructor instructor;
    private double rating;           // protected logic
    private List<String> modules;
    private final String reviews;    // read-only

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = List.of("Introduction", "Basics");
        this.reviews = "Internal Reviews";
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = "Internal Reviews";
    }

    // Encapsulated rating logic
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = newRating;
        }
    }
    
    public void addRating(double newRating) {
        updateRating(newRating);
    }

    public double getRating() {
        return rating;
    }

    public String getReviews() {   // read-only access
        return reviews;
    }
}
