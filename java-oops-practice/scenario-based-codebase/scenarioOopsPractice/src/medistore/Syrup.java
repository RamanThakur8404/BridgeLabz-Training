package medistore;

public class Syrup extends Medicine {
	 static int internalStock = 200;
    public Syrup(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity, internalStock);
    }

    @Override
    public boolean checkExpiry() {
        return true; // liquid medicines expire faster
    }

    @Override
    public double sell(int qty) {
        if (checkExpiry() || qty > getQuantity()) {
            System.out.println("Cannot sell Syrup");
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
        return amount > 300 ? amount * 0.05 : 0;
    }

    @Override
    double getFinalPrice(int qty) {
        double amount = totalPrice(qty);
        return amount - getDiscount(amount);
    }
}
