package corejava.array;

import java.util.Scanner;

public class FindDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter the Element:");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]+" is duplicate element.");
                }
            }
        }
    }
}
