package corejava.array;

import java.util.Scanner;

public class SecondLargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter the Element:");

        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for (int i=0; i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>=arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println("Second Largest element is: "+arr[(arr.length)-2]);
    }
}
