package corejava.staticmember;

import java.util.Scanner;

class Addition{
    private static int x, y;
    public static void accept(int a, int b){
        x=a;
        y=b;
    }
    public static void add(){
        System.out.println("Addition is "+(x+y));
    }
}
public class StaticMembers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two values:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        Addition.accept(a, b);
        Addition.add();
    }
}
