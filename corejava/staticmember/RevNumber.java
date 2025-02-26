package corejava.staticmember;

import java.util.Scanner;

class Reverse{
    private static int n;
    public static void accept(int a){
        n=a;
    }
    public static void rev(){
        int a=0;
        while (n>0){
            a= (a*10)+(n%10);
            n /=10;
        }
        System.out.println("Reverse Number is "+a);
    }
}
public class RevNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int a= sc.nextInt();
        Reverse.accept(a);
        Reverse.rev();
    }
}
