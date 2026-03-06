package Transactions;

public class CreditCard implements Transaction {
    private double balance;


    public CreditCard(double balance1) { // Constructor Card
        this.balance = balance1;
    }

    @Override
    public void pay(double amount) {
        if (amount < 0 && amount > balance) {
            System.out.println("Invalid Amount " );
        } else {
            System.out.println("Valid amount " + amount);
        }
    }

    @Override
    public void refund(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Credit Card Refund is :  $" + amount);
        }
    }
    public double getBalance() {
        return balance;
    }
}

