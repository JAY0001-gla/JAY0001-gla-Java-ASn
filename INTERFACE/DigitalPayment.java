package Interfaces;

interface Payment{
    void pay(double amount);
}
class UPI implements Payment{
    public void pay(double amount){
        System.out.println("Paid Rs. "+amount+" via UPI");
    }
}
class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Paid Rs. "+amount+" via Credit Card");
    }
}
class Wallet implements Payment{
    public void pay(double amount){
        System.out.println("Paid Rs. "+amount+" via Wallet");
    }
}
public class DigitalPayment {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(250.25);
    }
}
