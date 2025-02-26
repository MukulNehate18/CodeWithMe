package corejava.array;

import java.util.Scanner;

public class CheckSortedORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        System.out.println("Enter a Elements: ");
        for (int i=0; i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int flag=0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length-1;j++){
                if (a[i]>=a[j]){
                    flag++;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
