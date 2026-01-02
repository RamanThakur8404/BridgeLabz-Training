package ewalletapplication;

public class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% tax

    public BusinessWallet() {
        super();
    }

    public BusinessWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * TAX_RATE;
        double totalDebit = amount + tax;

        if (debit(totalDebit)) {
            receiver.getWallet().credit(amount);
            history.add(new Transaction("Business Transfer", amount));
            history.add(new Transaction("Tax Deducted", tax));
            receiver.getWallet().history
                    .add(new Transaction("Transfer Received", amount));
        } else {
            System.out.println("Insufficient balance in business wallet");
        }
    }
}
