package swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    public double getDiscount(double total) {
        return total * 0.40; // 10% discount
    }
}
