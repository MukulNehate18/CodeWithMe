package corejava.inheritance;

class Number2{
    protected int x, y;
    public Number2(int a, int b){
        x=a;
        y=b;
    }
}
class Greater1 extends Number2{
    public Greater1(int a, int b){
        super(a, b);
    }

    public void greaterVariable() {
        if (x>y){
            System.out.println(x+" is greater.");
        }else{
            System.out.println(y+" is greater.");
        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        Greater1 g= new Greater1(12, 78);
        g.greaterVariable();
    }
}
