package corejava.inheritance;

import java.util.Scanner;

class Number{
    protected int x, y;
    public void accept(int a, int b){
        x=a;
        y=b;
    }
}

class Addition extends Number{
    public void add(){
        int ans = x+y;
        System.out.println("Addition is "+ans);
    }
}

public class AddBySingleInheri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first value:");
        int a= sc.nextInt();
        System.out.println("Enter a first value:");
        int b= sc.nextInt();

        Addition ad = new Addition();
        ad.accept(a, b);
        ad.add();
    }
}
