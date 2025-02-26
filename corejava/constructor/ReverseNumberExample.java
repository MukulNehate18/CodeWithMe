package corejava.constructor;

import java.util.Scanner;


class Reverse{
    private int x;
    public Reverse(int a){
        x=a;
    }
    public void revNum(){
        int digit =0;
        int rev =0;
        while (x>0){
            digit =x%10;
            rev = rev*10 +digit;
            x /=10;
        }
        System.out.println("Reverse number "+rev);
    }
}
public class ReverseNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= sc.nextInt();
        Reverse r = new Reverse(a);
        r.revNum();

    }
}
