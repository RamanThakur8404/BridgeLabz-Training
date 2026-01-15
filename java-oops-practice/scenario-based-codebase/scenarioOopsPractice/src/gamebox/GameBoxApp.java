package gamebox;
import java.util.Scanner;

public class GameBoxApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.print("Enter game type (1-Arcade, 2-Strategy): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter game title: ");
        String title = sc.nextLine();

        System.out.print("Enter game price: ");
        double price = sc.nextDouble();

        System.out.print("Enter game rating: ");
        double rating = sc.nextDouble();

        Game game;

        if (choice == 1) {
            game = new ArcadeGame(title, price, rating);
        } else {
            game = new StrategyGame(title, price, rating);
        }

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        game.applyDiscount(discount);

        game.download();
        game.playDemo();

        user.buyGame(game);
        user.showOwnedGames();

        sc.close();
    }
}
