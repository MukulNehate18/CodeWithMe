package corejava.classAndObject;

import java.util.Scanner;

class SwapNumber{
    private int x, y;
    public void setValue(int a, int b){
        x=a;
        y=b;
        System.out.println("X before swapping is "+x+" and Y before swapping is "+y);
    }
    public void swap(){
        int temp= x;
        x= y;
        y= temp;
        System.out.println("X after swapping is "+x+" and Y after swapping is "+y);
    }
}

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value1: ");
        int a= sc.nextInt();
        System.out.print("Enter a value2: ");
        int b= sc.nextInt();

        SwapNumber sn = new SwapNumber();
        sn.setValue(a, b);
        sn.swap();
    }
}
