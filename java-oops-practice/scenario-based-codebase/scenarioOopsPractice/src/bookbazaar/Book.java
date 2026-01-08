package bookbazaar;
class Book implements IDiscountable {
    protected String title;
    protected String author;
    protected double price;
    private int stock;   // encapsulated

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    // inventory update only through method
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Insufficient stock");
        }
    }

    @Override
    public double applyDiscount(int quantity) {
        return 0; // base book has no discount
    }
}
