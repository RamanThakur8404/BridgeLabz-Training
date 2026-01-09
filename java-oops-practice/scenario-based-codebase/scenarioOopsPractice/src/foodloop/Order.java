package foodloop;
import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // Constructor for combo meals
    public Order(List<FoodItem> comboItems) {
        this.items = comboItems;
    }

    public void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        total -= applyDiscount();   // operator used
    }

    // Polymorphism
    public double applyDiscount() {
        if (total >= 1000) {
            return total * 0.25;
        } else if (total >= 500) {
            return total * 0.5;
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully!");
        System.out.println("Final Amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}
