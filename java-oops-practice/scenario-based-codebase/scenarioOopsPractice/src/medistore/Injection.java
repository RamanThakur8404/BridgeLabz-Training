package medistore;

public class Injection extends Medicine {
	private static int internalStock = 250;
    public Injection(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity, internalStock);
    }

    @Override
    public boolean checkExpiry() {
        return false;
    }

    @Override
    public double sell(int qty) {
        if (checkExpiry() || qty > getQuantity()) {
            System.out.println("Cannot sell Injection");
            return 0;
        }
        reduceStock(qty);
        return getFinalPrice(qty);
    }

    @Override
    double totalPrice(int qty) {
        return getPrice() * qty;
    }

    @Override
    double getDiscount(double amount) {
        return amount > 800 ? amount * 0.15 : 0;
    }

    @Override
    double getFinalPrice(int qty) {
        double amount = totalPrice(qty);
        return amount - getDiscount(amount);
    }
}
