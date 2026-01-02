package ewalletapplication;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {

    private double balance; // protected by encapsulation
    protected List<Transaction> history;

    // Constructor without referral bonus
    public Wallet() {
        this.balance = 0;
        this.history = new ArrayList<>();
    }

    // Constructor with referral bonus
    public Wallet(double referralBonus) {
        this();
        balance += referralBonus;
        history.add(new Transaction("Referral Bonus", referralBonus));
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    protected boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void loadMoney(double amount) {
        credit(amount);
        history.add(new Transaction("Money Loaded", amount));
    }

    public void showHistory() {
        for (Transaction t : history) {
            System.out.println(t.getDetails());
        }
    }
}
