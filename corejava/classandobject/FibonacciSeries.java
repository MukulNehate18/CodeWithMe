package corejava.classandobject;

import java.util.Scanner;

class Fibonacci{
    private int x;
    public void setValue(int a){
        x=a;
    }
    public void fibonacci(){
        int a=0, b=1, c;
        System.out.print("Fibonacci series till "+x+" is: "+a+", "+b);
        for(int i=0;i<=x; i++){
            c = a+b;
            System.out.print(", "+c);
            a=b;
            b=c;
        }
    }
}

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Till Fibonacci series want: ");
        int i= sc.nextInt();

        Fibonacci fb = new Fibonacci();
        fb.setValue(i);
        fb.fibonacci();
    }
}
