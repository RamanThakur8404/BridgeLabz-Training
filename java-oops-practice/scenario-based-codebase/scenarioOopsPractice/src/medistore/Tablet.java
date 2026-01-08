package medistore;

public class Tablet extends Medicine {
	private static int internalStock = 260;
    public Tablet(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity, internalStock);
    }

    @Override
    public boolean checkExpiry() {
        return false; // preserved medicine – strict expiry
    }

    @Override
    public double sell(int qty) {
        if (checkExpiry() || qty > getQuantity()) {
            System.out.println("Cannot sell Tablet");
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
        return amount > 500 ? amount * 0.10 : 0;
    }

    @Override
    double getFinalPrice(int qty) {
        double amount = totalPrice(qty);
        return amount - getDiscount(amount);
    }
}
