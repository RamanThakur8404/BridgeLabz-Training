package FitTrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight;     // sensitive data → private
    private int dailyGoal;     // calorie target

    // Constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyGoal = 2000; // default calorie goal
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, int dailyGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyGoal = dailyGoal;
    }

    // Getter only (no setter → protected)
    public double getWeight() {
        return weight;
    }

    public int getDailyGoal() {
        return dailyGoal;
    }

    public String getName() {
        return name;
    }
}

