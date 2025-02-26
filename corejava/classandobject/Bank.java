package corejava.classandobject;
//3. Create a BankAccount class
//Create a BankAccount class with fields accountNumber and balance.
//The default constructor should assign a fixed account number and balance.
//Add a method deposit() that increases the balance by a fixed amount, e.g., 100.
//Explanation: This teaches object initialization and the concept of modifying instance variables through methods.

import java.util.Scanner;

class BankAccount{
    Scanner sc= new Scanner(System.in);
    private int accountNumber, balance;
    public BankAccount(){
        accountNumber= 9876543;
        balance=2000;
    }
    public void deposit(){
        System.out.println("Enter amount to deposit: ");
        balance += sc.nextInt();
        System.out.println("Balance of Account "+accountNumber+" is "+balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.deposit();
    }
}
