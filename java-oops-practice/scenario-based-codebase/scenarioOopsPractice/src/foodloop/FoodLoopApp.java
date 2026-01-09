package foodloop;
import java.util.*;

public class FoodLoopApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<FoodItem> cart = new ArrayList<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nItem " + i);
            System.out.print("Enter food name: ");
            String name = sc.nextLine();

            System.out.print("Veg or NonVeg (V/N): ");
            char type = sc.next().charAt(0);

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter stock: ");
            int stock = sc.nextInt();
            sc.nextLine();

            FoodItem item;
            if (type == 'V' || type == 'v') {
                item = new VegItem(name, price, stock);
            } else {
                item = new NonVegItem(name, price, stock);
            }

            if (item.isAvailable()) {
                item.reduceStock();
                cart.add(item);
            } else {
                System.out.println("Item out of stock!");
            }
        }

        Order order = new Order(cart);
        order.placeOrder();

        sc.close();
    }
}
