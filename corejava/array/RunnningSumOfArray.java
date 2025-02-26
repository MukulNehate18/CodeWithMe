package corejava.array;

import java.util.Arrays;

public class RunnningSumOfArray {
    public static void runningSum(int[] ans){
        for (int i = 1; i < ans.length; i++) {
            ans[i] +=ans[i-1];
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] a= {1, 1, 2, 1};
        runningSum(a);
    }
}
