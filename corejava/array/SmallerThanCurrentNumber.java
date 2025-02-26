package corejava.array;

import java.util.Arrays;

//Problem Statement: How Many Numbers Are Smaller Than Current Number.
public class SmallerThanCurrentNumber {
    public static void currentOfSmaller(int[] a){
        int[] ans= new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]>a[j]){
                    ans[i] +=1;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] a={8, 1, 2, 2, 3};
        currentOfSmaller(a);
    }
}
