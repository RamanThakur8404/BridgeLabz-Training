package gamebox;

class Game implements IDownloadable {
    private String title;
    private String genre;
    protected double price;
    private double rating;

    // Free game constructor
    public Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

    // Paid game constructor
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Apply seasonal offer (operator usage)
    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing demo of the game");
    }
}
