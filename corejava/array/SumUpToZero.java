package corejava.array;
import java.util.Arrays;

public class SumUpToZero {
    public static void main(String[] args) {
        int n=5;
        int[] a=SumElementArray(n);
        System.out.println(Arrays.toString(a));
    }

    private static int[] SumElementArray(int n) {
        int[] a = new int[n];
        int num=n/2;
        for (int i=0;i<n/2;i++){
            a[i]=num;
            a[i+(n/2)]=-num;
            num--;
        }
        if (n%2==0){
            a[n-1]=0;
        }

        return a;
    }
}
