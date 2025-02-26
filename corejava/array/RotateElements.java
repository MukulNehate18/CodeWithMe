package corejava.array;

import java.util.Arrays;

public class RotateElements {
    public static void main(String[] args) {
        int[] a=new int[]{-1, 100, 3, 99};
        int n=3,x=0;
        while(x<n) {
            int ac= a[a.length-1];
            for (int index = a.length-1; index >=0; index--) {
                if (index==0){
                    a[0]=ac;
                }else{
                    a[index]=a[index-1];
                }
            }
            x++;
        }
        System.out.println(Arrays.toString(a));
    }
}
