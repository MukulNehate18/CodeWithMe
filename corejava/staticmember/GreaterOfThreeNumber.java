package corejava.staticmember;

import java.util.Scanner;

class Greater{
    private static int x,y,z;
    public static void accept(int a, int b, int c){
        x=a;
        y=b;
        z=c;
    }
    public static void greater(){
        if (x>y&&y>z){
            System.out.println(x+" is greater.");
        }else if(y>z){
            System.out.println(y+" is greater.");
        }else{
            System.out.println(z+" is greater.");
        }
    }
}
public class GreaterOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value1:");
        int a= sc.nextInt();
        System.out.println("Enter a value2:");
        int b= sc.nextInt();
        System.out.println("Enter a value3:");
        int c= sc.nextInt();
        Greater.accept(a, b, c);
        Greater.greater();
    }
}
