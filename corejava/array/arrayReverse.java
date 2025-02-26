package corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter the Element:");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length/2;i++){
            int temp =arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;
        }
        System.out.println("The reverse array is "+ Arrays.toString(arr));

    }
}
