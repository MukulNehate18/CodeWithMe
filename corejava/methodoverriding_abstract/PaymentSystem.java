package corejava.methodoverriding_abstract;
//Problem: Payment Processing System
//You are building a payment system that supports different payment methods. Implement it using an abstract class.
//Steps:
//Create an abstract class Payment with the following:
//Attributes: double amount
//Constructor to initialize amount
//Abstract method void makePayment()
//Method void displayAmount() to print the amount
//Create two subclasses:
//CreditCardPayment: Implements makePayment(), prints "Processing credit card payment of $amount"
//PayPalPayment: Implements makePayment(), prints "Processing PayPal payment of $amount"
//Write a main method to:
//Create instances of both payment methods.
//Call makePayment() and displayAmount() for each.
abstract class Payment{
    protected double amount;
    public Payment(){
        amount=1000;
    }
    abstract void makePayment();
    public double displayAmount(){
        return amount;
    }
}
class CreditCardPayment extends Payment{

    @Override
    void makePayment() {
        System.out.println("Processing credit card payment of "+displayAmount());
    }
}
class PayPalPayment extends Payment{

    @Override
    void makePayment() {
        System.out.println("Processing PayPal payment of "+displayAmount());
        displayAmount();
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment c=new CreditCardPayment();
        c.makePayment();

        PayPalPayment ppp=new PayPalPayment();
        ppp.makePayment();
    }
}
