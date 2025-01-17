package corejava;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to reverse: ");
        int num= sc.nextInt();
        int reverse=0;
        do {
            int digit = num %10;
            reverse = reverse *10 + digit;
            num = num/10;
        }while(num>0);

        System.out.println("reverse number is: "+reverse);
    }
}
