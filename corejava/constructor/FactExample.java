package corejava.constructor;
import java.util.Scanner;

class Fact{
    private int x;
    public Fact(int a){
        x = a;
    }
    public void factorial(){
        int f = 1;
        for (int i =1; i<=x; i++){
            f *=i;
        }
        System.out.println("Factorial is " +f);
    }

}

public class FactExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a= sc.nextInt();

        Fact obj = new Fact( a);
        obj.factorial();
    }
}
