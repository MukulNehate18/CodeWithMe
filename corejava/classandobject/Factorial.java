package corejava.classandobject;

import java.util.Scanner;

class FactorialNumber{
    private int x;
    public void setValue(int a){
        x=a;
    }
    public void factorial(){
        int fact =1;
        for(int i=1;i<=x;i++){
            fact *=i;
        }
        System.out.println("Factorial of "+x+" is "+fact);
    }
}

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int a= sc.nextInt();

        FactorialNumber fn = new FactorialNumber();
        fn.setValue(a);
        fn.factorial();
    }
}
