package corejava.inheritance;

import java.util.Scanner;
/// super keyword
class Number1{
    protected int a, b;
    public  Number1(int a, int b){
        this.a=a;
        this.b = b;
    }
}
class Add extends Number1{
    public Add(int p, int q){
        super(p, q);
    }
    public void addition(){
        int ans=a+b;
        System.out.println("Addition is "+ans);
    }
}
public class AddSingleLevel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two values: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        Add obj=new Add(a, b);
        obj.addition();
    }
}
