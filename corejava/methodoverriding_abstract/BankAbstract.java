package corejava.methodoverriding_abstract;
//3. Bank Abstract Class
//Problem: Create an abstract class Bank with the following methods:
//deposit(double amount) — allows depositing an amount.
//withdraw(double amount) — allows withdrawing an amount.
//getBalance() — returns the current balance.
//Then, create two subclasses:
//SavingsBank — charges a fixed fee of $2 per transaction.
//CurrentBank — charges a fixed fee of $5 per transaction.
//Write a program that deposits and withdraws money from both types of banks and
//displays the balance after each transaction.
//Explanation:
//The abstract class Bank defines the common structure for the deposit, withdraw,
//and balance methods. Each subclass applies a different transaction fee.
//Logical operation: Use method overriding to show different transaction fees for
//each type of bank.

abstract class Bank{
    protected double amount=1000;
    abstract void deposit(double a);
    abstract void withdraw(double a);
    public void getBalance(){
        System.out.println("Balance is "+amount);
    }
}
class SavingsBank extends Bank{

    @Override
    void deposit(double a) {
        amount += (a-2);
        getBalance();
    }

    @Override
    void withdraw(double a) {
        amount =amount-a-2;
        getBalance();
    }
}
class CurrentBank extends Bank{

    @Override
    void deposit(double a) {
        amount += (a-5);
        getBalance();
    }

    @Override
    void withdraw(double a) {
        amount =amount-a-5;
        getBalance();
    }
}
public class BankAbstract {
    public static void main(String[] args) {
        SavingsBank sb= new SavingsBank();
        sb.deposit(20);
        sb.withdraw(400);

        CurrentBank cb= new CurrentBank();
        cb.deposit(333);
        cb.withdraw(12);
    }
}
