package corejava.classAndObject;

import java.util.Scanner;

class GreatestAmongThree{
    private int x, y, z;
    public void setValue(int a, int b, int c){
        x=a;
        y=b;
        z=c;
    }
    public void greater(){
        if(x>y && y>z){
            System.out.println(x+" is Greatest Number");
        } else if (y>z && y>x) {
            System.out.println(y+" is Greatest Number");
        }else {
            System.out.println(z+" is Greatest Number");
        }
    }
}

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int i= sc.nextInt();
        System.out.print("Enter the number2: ");
        int j= sc.nextInt();
        System.out.print("Enter the number3: ");
        int k= sc.nextInt();

        GreatestAmongThree th =new GreatestAmongThree();
        th.setValue(i, j, k);
        th.greater();
    }
}
