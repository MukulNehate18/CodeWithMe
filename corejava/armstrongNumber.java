package corejava;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int x =n;
        int count =0;
        while(n>0){
            count++;
            n = n/10;
        }
        n =x;
        int sum =0;
        while (n>0){

            int result=1;
            int digit=n%10;
            for(int i=0;i<count;i++){
                result *= digit;
            }
            sum += result;
            n /=10;
        }
        if (x == sum){
            System.out.println(x+" is Armstrong number.");
        }else{
            System.out.println(x+" is not Armstrong number.");
        }
    }
}
