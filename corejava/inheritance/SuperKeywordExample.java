package corejava.inheritance;

class Shape1{
    protected int r;
    public Shape1(int a){
        r=a;
    }
}
class Circle extends Shape1{
    public Circle(int x){
        super(x);
    }
    public void area()
    {
        System.out.println("Area of circle is "+(3.14*r*r));
    }
}
public class SuperKeywordExample {
    public static void main(String[] args) {
        Circle c= new Circle(30);
        c.area();
    }
}
