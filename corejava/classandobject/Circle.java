package corejava.classandobject;

import java.util.Scanner;

class Operation{
    private int r;
    public void setValue(int a){
        r = a;
        System.out.println("Radius of Circle is "+r);
    }
    public void area(){
        System.out.println("Area of Circle is "+(3.14*r*r));
    }
    public void circumference(){
        System.out.println("Circumference of circle is "+(2*3.14*r));
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle:");
        int a= sc.nextInt();

        Operation op = new Operation();
        op.setValue(a);
        op.area();
        op.circumference();
    }
}
