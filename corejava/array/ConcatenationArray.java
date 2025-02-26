package corejava.array;


import java.util.Arrays;

public class ConcatenationArray {
    public static void concat(int[] a){
        int[] x= new int[a.length*2];
        for (int i = 0; i < x.length; i++) {
            if (i<a.length){
                x[i]=a[i];
            }else{
                x[i]=a[i-a.length];
            }
        }
        System.out.println(Arrays.toString(x));
    }
    public static void main(String[] args) {
        int[] nums= {1, 2, 3, 5, 6, 5, 4, 2, 1};
        concat(nums);
    }
}
