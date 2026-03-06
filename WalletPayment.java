package Transactions;

public class WalletPayment implements Transaction {
    private double balance;

    public WalletPayment (double balance1) {
        this.balance = balance1;
    }
    @Override
    public void pay(double amount) {
        if (amount > 0) {
            balance = balance - amount;
            System.out.println("Wallet Payment " + amount);
        }
        else {
            System.out.println("Invalid Wallet Payment ");
        }

    }
    @Override
    public void refund(double amount) {
        if ( amount > 0) {
            balance = balance + amount;
            System.out.println("Wallet Refund is " + balance);
        }
        else {
            System.out.println("Invalid Wallet Refund  ");
        }

    }

}

