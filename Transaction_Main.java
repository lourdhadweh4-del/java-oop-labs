package Transactions;

public class Transaction_Main {
    public static void main(String[] args) {
        CreditCard A = new CreditCard(8738);
        UPIPayment B = new UPIPayment(87873);
        WalletPayment C = new WalletPayment(9388);

        A.pay(40000);
        A.refund(500);
        B.pay(900);
        B.pay(500);
        C.pay(700);
        C.pay(400.);


    }
}
