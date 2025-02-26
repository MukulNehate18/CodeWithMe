package corejava.inheritance;
//Q2. Write program to create class name Area with methods name as void setRadius(float radius)
// and void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle
// so you have to define float getCircleArea() method in Circle child class and calculate area
// of circle and return it and You have to define getRectArea() method in Rectangle class and
// calculate area of rectangle and return it.
class Area{
    protected int l, w;
    protected float r;
    public void setRadius(float radius){
        r=radius;
    }
    public void setLengthWidth(int len,int wid){
        l=len;
        w=wid;
    }
}
class Circle1 extends Area{
    public float getCircleArea(){
        return (float) (3.14*r*r);
    }
}
class Rectangle1 extends Area{
    public int getRectangleArea(){
        return (l*w);
    }
}
public class AreaOperation {
    public static void main(String[] args) {
        Circle1 c= new Circle1();
        c.setRadius(58);
        float area=c.getCircleArea();
        System.out.println("Area of Circle is "+area);

        Rectangle1 r= new Rectangle1();
        r.setLengthWidth(23, 54);
        int areaR=r.getRectangleArea();
        System.out.println("Area of Rectangle is "+areaR);
    }
}
