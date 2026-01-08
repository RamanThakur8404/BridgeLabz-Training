package medistore;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;
    private String expiryDate;
    private int quantity;
    
    private int internalStock;
    private double cost;

    public Medicine(String name, double price, String expiryDate, int quantity, int internalStock) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.internalStock = internalStock;
        this.cost = price * quantity; 
    }

    public String getName() {
        return name;
    }

    protected double getPrice() {
        return price;
    }

    protected String getExpiryDate() {
        return expiryDate;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void reduceStock(int qty) {
        this.quantity -= qty;
        this.internalStock -= qty;
    }

    // Abstract business methods
    abstract double totalPrice(int qty);
    abstract double getDiscount(double amount);
    abstract double getFinalPrice(int qty);

    public void costDetails(int qty) {
        System.out.println("Medicine: " + name);
        System.out.println("Total Price: " + totalPrice(qty));
        System.out.println("Discount: " + getDiscount(totalPrice(qty)));
        System.out.println("Final Price: " + getFinalPrice(qty));
    }
}
