package corejava.inheritance;
class Side{
    protected int a, b;
    public Side(int x){
        a=x;
    }
    public Side(int x, int y){
        a=x;
        b=y;
    }
}
class AreaS extends Side{

    public AreaS(int x) {
        super(x);
    }
    public void area(){
        System.out.println("Area of Square is "+a*a);
    }
}

class AreaR extends Side{

    public AreaR(int x, int y) {
        super(x, y);
    }
    public void area(){
        System.out.println("Area of Square is "+a*b);
    }
}
public class AreaSqaure {
    public static void main(String[] args) {
        AreaS s= new AreaS(32);
        s.area();
        AreaR r= new AreaR(21, 43);
        r.area();
    }
}
