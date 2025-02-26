package corejava.methodoverriding_abstract;
//2. Write Program to create abstract class name as Value with one abstract and one
//non abstract method void setValue(int ,int): this is non abstract method with two
//parameter abstract int getResult(): this is abstract method and you have two child
//class name as Power and you have to override getResult() method in Power class and
//calculate power of two values and return it as well as SearchDigit and you have to
//override getResult() consider first parameter of setValue() is number and second
//parameter is digit and you have to search digit in number and return it and if
//digit not found return -1.
abstract class Value{
    protected int x, y;
    abstract int getResult();

    public void setValue(int a,int b){
        x=a;
        y=b;
    }
}

class Power extends Value{
    int a=1;
    @Override
    int getResult() {
        for (int i=0;i<x;i++){
            a *=y;
        }
        return a;
    }
}

class SearchDigit extends Value{

    @Override
    int getResult() {
        int digit;
        while (x>0){
            digit=x%10;
            if (digit==y){
                return digit;
            }
            x /=10;
        }
        return -1;
    }
}
public class AbstractMethodExample {
    public static void main(String[] args) {
        SearchDigit s=new SearchDigit();
        s.setValue(12, 2);
        int a=s.getResult();
        System.out.println("Search digit is "+a);
        Power p=new Power();
        p.setValue(2, 5);
        int z=p.getResult();
        System.out.println("Power is "+z);
    }
}
