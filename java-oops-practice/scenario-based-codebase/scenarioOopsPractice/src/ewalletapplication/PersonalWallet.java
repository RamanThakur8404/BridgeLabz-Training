package ewalletapplication;


public class PersonalWallet extends Wallet {

    private static final double DAILY_LIMIT = 5000;

    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > DAILY_LIMIT) {
            System.out.println("Transfer exceeds personal wallet limit");
            return;
        }

        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            history.add(new Transaction("Transfer Sent", amount));
            receiver.getWallet().history
                    .add(new Transaction("Transfer Received", amount));
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

