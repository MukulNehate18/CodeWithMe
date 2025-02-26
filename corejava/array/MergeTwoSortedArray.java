package corejava.array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a={1, 3, 5, 7, 9};
        int[] b={2, 4, 6, 8, 10};
        int[] c= new int[a.length+b.length];
        for (int i = 0; i < c.length; i++) {
            if (i<a.length){
                c[i]=a[i];
            }else{
                c[i] =b[i-a.length];
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
                if (c[i]>c[j]){
                    int temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(c));
    }
}
