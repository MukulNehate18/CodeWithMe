package corejava.inheritance;

import java.util.Scanner;

class Input{
    protected int x, y;
    public void accept(int a, int b){
        x= a;
        y=b;
        System.out.println("Before Swapping x is "+x+" and y is "+y);

    }
}
class SwapN extends Input{
    public void swapNumber(){
        int temp =x;
        x=y;
        y=temp;
        System.out.print("After Swapping x is "+x+" and y is "+y);
    }
}
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First value: ");
        int a= sc.nextInt();
        System.out.print("Enter Second value: ");
        int b = sc.nextInt();

         SwapN s= new SwapN();
         s.accept(a, b);
         s.swapNumber();
    }
}
