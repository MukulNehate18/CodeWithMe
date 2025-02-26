package corejava.array;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int m=3, n=4;
        int[][] matrix= {
                {1, 2, 3, 7},
                {4, 5, 6, 9},
                {7, 8, 9, 0}
        };
        System.out.println(Arrays.toString(spiral(matrix, m, n)));
    }

    private static int[] spiral(int[][] a, int m, int n) {
        int[] x=new int[m*n];
        int left=0, right=n-1;
        int top=0, bottom=m-1;
        while (left<right && top<bottom){
            int l=0;
            for (int i = left; i <= right; i++) {
                x[l]=a[top][i];
                l++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                x[l]=a[i][right];
                l++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                x[l]=a[bottom][i];
                l++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                x[l]=a[i][left];
                l++;
            }
            left++;

            for (int i = left; i <= right; i++) {
                x[l]=a[bottom][i];
                l++;
            }
        }
        return x;
    }
}
