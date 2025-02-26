package corejava.constructor;
import java.util.*;

class Power{
    private int a;
    private int b;
    public Power (int x, int y){
        a= x;
        b=y;
    }

    public void powerNumber(){
        int n=1;
        for(int i=0; i<b;i++){
            n *=a;
        }
        System.out.println("Power is "+n);
    }
}
public class PowerOfIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base:");
        int base = sc.nextInt();
        System.out.print("Enter Index: ");
        int index = sc.nextInt();

        Power obj = new Power(base,index);
        obj.powerNumber();
    }
}
