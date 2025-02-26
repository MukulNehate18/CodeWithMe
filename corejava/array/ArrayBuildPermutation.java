package corejava.array;

import java.util.Arrays;

public class ArrayBuildPermutation {
    public static void permutation(int[] a){
        int[] ans= new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i]=a[a[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] a= {5, 0, 1, 2, 3, 4};
        permutation(a);
    }
}
