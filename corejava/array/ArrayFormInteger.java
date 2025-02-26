package corejava.array;

import java.util.Arrays;

//Problem Statement: Add to Array-Form of Integer.
public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] a= {2, 1, 5};
        int k=806;
        System.out.println(Arrays.toString(arrayForm(a, k)));
    }

    private static int[] arrayForm(int[] a, int k) {
        int sum=0, count=0, s;
        for (int i:a){
            sum =sum*10+i;
        }
        s=sum+=k;

        while(sum>0){
            count++;
            sum/=10;
        }
        if (count ==a.length) {
            for (int i = a.length - 1; i >= 0; i--) {
                a[i] = s % 10;
                s /= 10;
            }
        }else{
            a=new int[count];
            for (int i = a.length - 1; i >= 0; i--) {
                a[i] = s % 10;
                s /= 10;
            }
        }
        return a;
    }
}
