package corejava.staticmember;

import java.util.Scanner;

class CheckPrime{
    private static int n;
    public static void accept(int a){
        n=a;
    }
    public static void check(){
        int flag =0;
        for (int i=2;i<=n;i++){
            if (n%i==0){
                flag++;
            }
        }
        if (flag==1){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a Prime number");
        }
    }
}
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int a= sc.nextInt();

        CheckPrime.accept(a);
        CheckPrime.check();
    }
}
