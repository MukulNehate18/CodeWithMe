package corejava.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] a= {4, 3, 2, 9};
        System.out.println(Arrays.toString(plusOne(a)));
    }

    private static int[] plusOne(int[] a) {
        a[a.length-1] +=1;
        if (a[a.length-1]%100>9){
            int[] b=Arrays.copyOf(a, a.length+1);
            b[b.length-1]=b[b.length-2]%10;
            b[b.length-2]/=10;
            return b;
        }
        return a;
    }
}
