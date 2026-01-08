package bookbazaar;
class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.05; // 5% discount
    }
}
