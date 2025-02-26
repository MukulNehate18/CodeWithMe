package corejava.staticmember;

import java.util.Scanner;
class Swap{
    private static int x, y;
    public static void accept(int a, int b){
        x=a;
        y=b;
    }
    public static void number(){
        int temp =x;
        x=y;
        y=temp;
        System.out.println("After Swaping x is "+x+" and y is "+y);
    }
}
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int a= sc.nextInt();
        System.out.println("Enter a value:");
        int b= sc.nextInt();
        Swap.accept(a, b);
        Swap.number();
    }
}
