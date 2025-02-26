package corejava.inheritance;
import java.util.*;
class number{
    protected int n;
    public number(int a) {
        n = a;
    }
}
class Multiplication extends number {
    public Multiplication(int x) {
        super(x);
    }

    public void mult() {
        int multi, i;
        for (i = 1; i <= 10; i++) {
            multi = i * n;
            System.out.println(n + " * " + i + " = " + multi);
        }
    }
}
class Fact extends Multiplication{
        public Fact(int x){
            super(x);
        }
        public void factorial(){
            int i;
            int fact=1;
            for(i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("factorial is "+fact);
        }
}
public class Multilevel {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int a=sc.nextInt();
     Multiplication m=new Multiplication(a);
     m.mult();
     Fact f= new Fact(a);

     f.factorial();
    }
}
