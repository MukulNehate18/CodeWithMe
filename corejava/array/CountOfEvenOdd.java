package corejava.array;

import java.util.Scanner;

public class CountOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter the Element:");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int even=0, odd=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even values are "+even+" and Odd values are "+odd);
    }
}
