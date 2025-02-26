package corejava.array;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int[] arr= new int[size];

        for (int i=0; i<size;i++){
            System.out.print("Enter "+(i+1)+" element: " );
            arr[i] =sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int i=0; i<size;i++){
            System.out.println(arr[i]+" ");
        }

        for (int i=0;i<=size;i++){
            for (int j=i+1;j<=size-1;j++){
                if (arr[i] >= arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is: ");
        for (int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
