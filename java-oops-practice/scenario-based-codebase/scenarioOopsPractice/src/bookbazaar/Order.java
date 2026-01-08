package bookbazaar;
class Order {
    private String orderStatus = "PLACED"; // restricted

    public double calculateTotal(Book book, int quantity) {
        double discount = book.applyDiscount(quantity);
        double total = (book.price * quantity) - discount;
        book.reduceStock(quantity);
        return total;
    }

    protected void updateStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
