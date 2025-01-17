package corejava;

import java.util.Scanner;

public class strongNumberOneToTen {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 to which number check strong number or not:");
            int n =sc.nextInt();
            for(int i=1;i<=n;i++){
            int original_number = i;
            int x = original_number;

            int sum = 0;
            while (x > 0) {
                int fact = 1;
                int a = x % 10;
                for (int j = 2; j <= a; j++) {
                    fact *= j;
                }
                sum += fact;
                x = x / 10;
            }

            if (original_number == sum) {
                System.out.println("Strong number is: "+original_number);
            }
            }
        }
}