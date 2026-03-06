package Transactions;

public class UPIPayment implements Transaction {
    private double balance;

    public UPIPayment(double balance1) {
        this.balance = balance1;

    }
    @Override
    public void pay(double amount) {
        if (amount < 0 && amount > balance) {
            System.out.println("Invalid Amount " + amount);
        } else {
            System.out.println("Valid amount ");
        }
    }

    @Override
    public void refund(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Credit UPI Refund is :  $" + balance);

        } else {
            System.out.println("Invalid Wallet Refund  ");
        }

    }
}


