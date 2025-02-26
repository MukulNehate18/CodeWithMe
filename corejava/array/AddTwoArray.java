package corejava.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        int[] b= new int[5];
        System.out.println("Enter a Elements of Array A: ");
        for (int i=0; i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int[] add= new int[a.length+b.length];
        System.out.println("Enter a Elements of Array B: ");
        for (int i=0; i<b.length;i++){
            b[i]= sc.nextInt();
        }
        for (int i=0;i<add.length;i++){
            if (i<=a.length-1){
                add[i]=a[i];
            }else{
                add[i]=a[i-a.length];
            }
        }
        System.out.println(Arrays.toString(add));
    }
}
