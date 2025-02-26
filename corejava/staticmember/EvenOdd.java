package corejava.staticmember;

import java.util.Scanner;
class Check{
    private static int n;
    public static void accept(int a){
        n=a;
    }
    public static void check(){
        if (n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int a= sc.nextInt();
        Check.accept(a);
        Check.check();
    }
}
