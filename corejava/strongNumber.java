package corejava;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check is it strong number or not: ");
        int original_number = sc.nextInt();
        int x = original_number;

        int sum = 0;
        while (x > 0) {
            int fact =1;
            int a = x % 10;
            for (int i = 2; i <= a; i++) {
                fact *= i;
            }
            sum += fact;
            x = x / 10;
        }

        if (original_number == sum) {
            System.out.println("Strong number.");
        } else {
            System.out.println("Not a Strong number.");
        }

    }
}
