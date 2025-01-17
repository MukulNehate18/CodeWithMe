package corejava;

import java.util.Scanner;

public class evenOddMenuWithFactNCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n =sc.nextInt();
        for(int i=1; i<=n;i++){
            if(i%2 == 0){
                System.out.println(i+" is Even");
                int fact=1;
                for(int j=2; j<=i; j++){
                    fact = fact*j;
                }
                System.out.println("Factorial of "+i+" is "+fact);
            }else{
                System.out.println(i+" is Odd");
                int cube =i*i*i;
                System.out.println("Cube of "+i+" is "+cube);

            }
        }
    }
}
