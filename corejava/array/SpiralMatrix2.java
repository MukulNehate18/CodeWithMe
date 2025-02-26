package corejava.array;
import java.util.Arrays;
public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.deepToString(spiral2(n)));
    }

    private static int[][] spiral2(int n) {
        int[][] a= new int[n][n];
        int left=0, right=n-1;
        int top=0, bottom=n-1;
        while (top<bottom && left<right){
            int l=1;
            for (int i = left; i <= right; i++) {
                a[top][i]=l++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                a[i][right]=l++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                a[bottom][i]=l++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                a[i][left]=l++;
            }
            left++;
            for (int i = left; i <= right; i++) {
                a[top][i]=l++;
            }
        }
        return a;
    }
}
