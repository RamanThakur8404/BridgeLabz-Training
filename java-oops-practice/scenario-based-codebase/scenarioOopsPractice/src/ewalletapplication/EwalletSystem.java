package ewalletapplication;

public class EwalletSystem {

    public static void main(String[] args) {

        User u1 = new User(1, "Ravi", new PersonalWallet(200));
        User u2 = new User(2, "Anita", new BusinessWallet());

        u1.getWallet().loadMoney(3000);
        u2.getWallet().loadMoney(10000);

        u1.getWallet().transferTo(u2, 1500);
        u2.getWallet().transferTo(u1, 2000);

        System.out.println("Ravi Balance: ₹" + u1.getWallet().getBalance());
        System.out.println("Ananya Balance: ₹" + u2.getWallet().getBalance());

        System.out.println("\nRavi Transaction History:");
        u1.getWallet().showHistory();

        System.out.println("\nAnanya Transaction History:");
        u2.getWallet().showHistory();
    }
}
