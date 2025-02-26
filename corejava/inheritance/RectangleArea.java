package corejava.inheritance;

import java.util.Scanner;

class Length{
    protected int l;
    public void acceptL(int a){
        l=a;
    }
}

class Breadth extends Length{
    private int b;
    public void acceptB(int b){
        this.b=b;
    }
    public void area(){
        int area=l*b;
        System.out.println("Area of Rectangle is "+area);
    }
}
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int a= sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();

        Breadth al= new Breadth();
        al.acceptL(a);
        al.acceptB(b);
        al.area();
    }
}
