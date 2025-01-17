package corejava.classAndObject;

import java.util.Scanner;

class Reverse{
    private int x;
    public void setValue(int a){
        x=a;
    }
    public void reverse(){
        int digit=0;
        int rev=0;
        while(x>0){
            digit =x%10;
            rev =rev*10 +  digit;
            x /=10;
        }
        System.out.println("Reverse number is "+rev);
    }

}

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to reverse: ");
        int i = sc.nextInt();

        Reverse fb = new Reverse();
        fb.setValue(i);
        fb.reverse();
    }
}
