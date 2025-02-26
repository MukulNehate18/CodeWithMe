package corejava.array;

import java.util.Scanner;

public class ShiftArrayElementsToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        System.out.println("Enter  element: " );
        for (int i=0; i<a.length;i++){
            a[i] =sc.nextInt();
        }
        for (int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
