package corejava.classandobject;
//2. Create a Circle class
//Create a Circle class with a radius field.
//Use a default constructor to set the radius to 10.
//Add a method calculateCircumference() to calculate and display the circumference using the formula 2 * π * radius.
//Explanation: This question reinforces object-oriented principles and demonstrates mathematical operations with classes.

class Circle1{
    private int r;
    public Circle1(){
        r=10;
    }
    public void calculateCircumference(){
        System.out.println("Circumference of Circle is "+(2*3.14*r));
    }
}
public class CircleOperation {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.calculateCircumference();

    }
}
