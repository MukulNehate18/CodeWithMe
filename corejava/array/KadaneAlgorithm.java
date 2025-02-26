package corejava.array;

import java.util.Arrays;

public class KadaneAlgorithm {
    public static int kAlgo(int[] a, int start, int end){
        int sum = 0;
        for (int i = start ;i<=end;i++){
            sum +=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, -2, 5};
        int x=0, y=0;
        int currentSum, maxSum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j=i+1;j<a.length;j++){
                currentSum = kAlgo(a, i, j);
                if (currentSum>maxSum){
                    maxSum=currentSum;
                    x=i;
                    y=j;
                    System.out.println("Max sum is "+maxSum);
                }
            }
        }
        System.out.println("Max sum is "+maxSum);
        for (int i=x;i<=y;i++){
            System.out.print(a[i]+" ");
        }
    }
}