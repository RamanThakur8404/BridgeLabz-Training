package artify;
import java.util.Scanner;

public class ArtifyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter user name: ");
        String userName = sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();
        sc.nextLine(); // consume newline

        User user = new User(userName, balance);

        // Artwork input
        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();

        System.out.print("Enter artist name: ");
        String artist = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter license type: ");
        String license = sc.nextLine();

        System.out.print("Is it Digital or Print? (D/P): ");
        char type = sc.next().charAt(0);

        Artwork artwork;

        if (type == 'D' || type == 'd') {
            System.out.print("Preview available? (true/false): ");
            boolean preview = sc.nextBoolean();
            artwork = new DigitalArt(title, artist, price, license, preview);
        } else {
            artwork = new PrintArt(title, artist, price, license);
        }

        System.out.println("\n--- Purchase Details ---");
        artwork.purchase(user);
        artwork.license();

        System.out.println("\nRemaining Wallet Balance: ₹" + user.getWalletBalance());

        sc.close();
    }
}
