package corejava.methodoverriding_abstract;
//4. Customer Abstract Class
//Problem: Create an abstract class Customer with the following methods:
//addTransaction(double amount) — adds a transaction amount.
//getBalance() — returns the current balance.
//Then, create two subclasses:
//PremiumCustomer — offers a 10% discount on all transactions.
//RegularCustomer — no discount on transactions.
//Write a program that adds transactions for both types of customers and shows their
//final balance after applying the discount.
//Explanation:
//The abstract class Customer provides methods for adding transactions and checking
//balances.
//Each subclass implements the transaction logic differently by applying a discount.
//Logical operation: Method overriding to apply discounts and track customer balances.
abstract class Customer{
    protected double balance;
    abstract void addTransaction(double amount);
    public void getBalance(){
        System.out.println("Balance after billing is "+balance);
    }
}
class RegularCustomer extends Customer{

    @Override
    void addTransaction(double amount) {
        balance=amount-(amount*10)/100;
        System.out.println("Regular Customer");
        getBalance();
    }
}
class PremiumCustomer extends Customer{

    @Override
    void addTransaction(double amount) {
        balance=amount-(amount*15)/100;
        System.out.println("Premium Customer");
        getBalance();
    }
}
public class CustomerAbstract {
    public static void main(String[] args) {
        RegularCustomer rc= new RegularCustomer();
        rc.addTransaction(3000);

        PremiumCustomer pc=new PremiumCustomer();
        pc.addTransaction(3000);
    }
}
