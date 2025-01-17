package corejava.classAndObject;

import java.util.Scanner;

class Number{
    private int x;
    private int y;
    public void setValue(int a, int b){
        x=a;
        y=b;
    }
    public void add(){
        int ans= x+y;
        System.out.println("The addition of "+x+" and "+y+" is "+ans);
    }
}

public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the value 2: ");
        int b= sc.nextInt();

        Number n = new Number();
        n.setValue(a, b);
        n.add();

    }
}
