package corejava.classandobject;
//1. Create a Rectangle class
//Create a Rectangle class with length and breadth as instance variables.
//Write a default constructor that assigns both values to 5.
//Add a method area() to calculate and display the area of the rectangle.
//Explanation: This practice teaches how to initialize instance variables using the default constructor and perform a calculation.

class Rectangle{
    private int length, breadth;
    public Rectangle(){
        length=breadth=5;
    }
    public void area(){
        System.out.println("Area of Rectangle is "+(length*breadth));
    }
}
public class RectangleOperation {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.area();
    }
}
