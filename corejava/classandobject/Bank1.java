package corejava.classandobject;

import java.util.Scanner;

//1. Create a BankAccount class
//Create a BankAccount class with fields accountNumber and balance.
//The default constructor should assign a fixed account number and balance.
//Add a method deposit() that increases the balance by a fixed amount, e.g., 100.
//Explanation: This teaches object initialization and the concept of modifying instance variables through methods.
class BankAccount1{
    private int accountnumber, balance;

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public int getBalance() {
        return balance;
    }
    public BankAccount1(){
        accountnumber=12345;
        balance=2000;
    }
    public void deposit(int a){
        balance += a;
    }
}

public class Bank1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        int a= sc.nextInt();
        BankAccount1 ba= new BankAccount1();
        ba.deposit(a);
        System.out.println(ba.getAccountnumber()+": "+ba.getBalance());
    }
}
