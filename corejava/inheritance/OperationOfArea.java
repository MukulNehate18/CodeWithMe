package corejava.inheritance;

import java.util.Scanner;

class Shape{
    protected int x, y;
    public void accept(int a, int b){
        x=a;
        y=b;
    }
}

class Rectangle extends Shape{
    public void areaRectangle(){
        System.out.println("Area of Rectangle is "+(x*y));
    }
}

class Triangle extends Shape{
    public void areaRectangle(){
        System.out.println("Area of Triangle is "+(0.5*x*y));
    }
}

public class OperationOfArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int a= sc.nextInt();
        System.out.print("Enter a breadth: ");
        int b = sc.nextInt();

        Rectangle r= new Rectangle();
        r.accept(a, b);
        r.areaRectangle();
        Triangle t= new Triangle();
        t.accept(a, b);
        t.areaRectangle();
    }
}
