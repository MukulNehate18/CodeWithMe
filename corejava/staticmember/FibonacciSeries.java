package corejava.staticmember;

import java.util.Scanner;

class Fibo{
    private static int n;
    public static void accept(int a){
        n=a;
    }
    public static void series(){
        int a=0, b=1, c;
        for (int i=1;i<=n;i++){
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }
}
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int a= sc.nextInt();
        Fibo.accept(a);
        Fibo.series();
    }
}
