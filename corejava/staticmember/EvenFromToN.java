package corejava.staticmember;

import java.util.Scanner;

class Even{
    private static int n;
    public static void accept(int a){
        n=a;
    }

    public static void number(){
        int count=0,num=1;
        for (int j=0;j<num++;j++){
            if (j%2==0){
                System.out.println(j);
                count++;
            }
            if (count==n){
                break;
            }
        }
    }
}
public class EvenFromToN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int a= sc.nextInt();
        Even.accept(a);
        Even.number();
    }
}
