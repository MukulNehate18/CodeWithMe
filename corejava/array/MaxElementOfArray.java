package corejava.array;

import java.util.Scanner;

public class MaxElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[]= new int[5];
        System.out.println("Enter  element: " );
        for (int i=0; i<a.length;i++){
            a[i] =sc.nextInt();
        }

        int max =0;
        for (int i=1;i<a.length;i++){
            if (a[max]<=a[i]){
                max=i;
            }
        }
        System.out.println("Max element is "+a[max]);
    }
}
