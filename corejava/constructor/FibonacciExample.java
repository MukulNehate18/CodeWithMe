package corejava.constructor;

import java.util.Scanner;
class Fibonacci{
    private int n;
    public Fibonacci(int a){
        n =a;
    }
    public void fibonacciExamp(){
            int a= 0;
            int b=1;

        for(int i= 1; i<=n;i++){
            int c= a+b;
            System.out.print(" "+a);
            a =b;
            b=c;

        }
    }
}

public class FibonacciExample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci(n);
        obj.fibonacciExamp();
    }
}
