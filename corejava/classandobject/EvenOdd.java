package corejava.classandobject;

import java.util.Scanner;

class CheckNumber{
    private int x;
    public void setValue(int a){
        x =a;
    }
    public void checkEvenOdd(){
        if(x%2==0){
            System.out.println("Number is Even.");
        }else {
            System.out.println("Number is Odd.");
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check it is Even or Odd: ");
        int num =sc.nextInt();

        CheckNumber n = new CheckNumber();
        n.setValue(num);
        n.checkEvenOdd();
    }
}
