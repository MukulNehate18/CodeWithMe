package corejava;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Driven:");
        System.out.println("1.add");
        System.out.println("2.sub");
        System.out.println("3.mul");
        System.out.println("4.div");

        System.out.println("Enter the choice: ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter two values: ");
                int a= sc.nextInt();
                int b= sc.nextInt();
                int ans = a+b;
                System.out.println("The addition is "+ans);
                break;
            case 2:
                System.out.println("Enter two values: ");
                int c= sc.nextInt();
                int d= sc.nextInt();
                int sub = c-d;
                System.out.println("The substract is "+sub);
                break;

            case 3:
                System.out.println("Enter two values: ");
                int e= sc.nextInt();
                int f= sc.nextInt();
                int mul = e*f;
                System.out.println("The multiply is "+mul);
                break;

            case 4:
                System.out.println("Enter two values: ");
                int r= sc.nextInt();
                int t= sc.nextInt();
                int div = r/t;
                System.out.println("The division is "+div);
                break;

            default:
                System.out.println("Invalid choice!!");
                break;
        }
    }
}
