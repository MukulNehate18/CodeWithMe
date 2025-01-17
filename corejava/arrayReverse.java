package corejava;

import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<size;i++){
            System.out.println("Enter the Element "+(i+1)+" :");
            arr[i]= sc.nextInt();
        }
        System.out.println("The array is");
        for(int i=0; i<size;i++){
            System.out.println("["+arr[i]+"]");
        }

        for(int i=0;i<size/2;i++){
            int temp =arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i]= temp;
        }
        System.out.println("The reverse array is");
        for(int i=0; i<size;i++){
            System.out.println("["+arr[i]+"]");
        }

    }
}
