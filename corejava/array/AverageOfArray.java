package corejava.array;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter the Element:");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Average is "+(sum/arr.length+1));
    }
}
