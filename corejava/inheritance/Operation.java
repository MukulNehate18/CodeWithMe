package corejava.inheritance;
//Q1. Write a program to crate class name as Value with single function name as setValue(int,int)
// and we have to create three child classes name as Add with function int getAdd(),
// Mul with function getMul() and Div with function getDiv() and getAdd() function
// return addition of two value which is inherited from Value class , getMul() function
// return multiplication of two values which is inherited from Value class and gitDiv() function
// return division of two values which Is inherited from Value class.

class Value{
    protected int x, y;
    public Value(int a, int b){
        x=a;
        y=b;
    }
}
class Add1 extends Value{
    public Add1(int a, int b) {
        super(a, b);
    }

    public void getAdd(){
        System.out.println("Addition is "+(x+y));
    }
}
class Mul extends Value{
    public Mul(int a, int b) {
        super(a, b);
    }

    public void getMul(){
        System.out.println("Multiplication is "+(x*y));
    }
}
class Div extends Value{
    public Div(int a, int b){
        super(a,b);
    }
    public void getDiv(){
        if (x>y) {
            System.out.println("Division is " + (x / y));
        }else {
            System.out.println("Division is " + (y / x));
        }
    }
}
public class Operation {
    public static void main(String[] args) {
        Add1 a= new Add1(23, 67);
        a.getAdd();
        Mul m= new Mul(22, 65);
        m.getMul();
        Div d= new Div(22, 11);
        d.getDiv();
    }
}
