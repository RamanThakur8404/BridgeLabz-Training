package swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    public double getDiscount(double total) {
        return total * 0.70; // 5% discount
    }
}

