package corejava.inheritance;

import java.util.Scanner;

class Number3{
    protected int x;
    public void getX(int a){
        x= a;
    }
}

class Factorial extends Number3{
    public void fact(){
        int a=1;
        for (int i=1;i<=x;i++){
            a *=i;
        }
        System.out.println("Factorial is "+a);
    }
}

class Table extends Number3{
    public void table(){

        for (int i=1;i<=10;i++){
            System.out.println(x+"*"+i+"="+(i*x));
        }
    }
}
public class Factorial_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        Factorial fa= new Factorial();
        fa.getX(n);
        fa.fact();

        Table ta = new Table();
        ta.getX(n);
        ta.table();
    }
}
