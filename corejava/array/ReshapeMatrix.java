package corejava.array;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int r1=1, c1=9, r2=3, c2=3;
        int[][] a={
                {1, 2, 5},
                {3, 4, 6},
                {7, 8, 9}
        };
        int[] b={1, 2, 3, 4, 5, 6, 7, 8};
        reshape(r1, c1, r2, c2, a, b);
    }

    private static void reshape(int r, int c, int r1, int c1, int[][] a, int[] b) {
        int[] mat = new int[c];
        int[][] result= new int[r1][c1];
        /// for 2d to 1d array
        if (r==1) {
            for (int i = 0; i < a.length; i++) {
                int n = a[i].length;
                for (int j = 0; j < a[i].length; j++) {
                    mat[n * i + j] = a[i][j];
                }
            }
            System.out.println(Arrays.toString(mat));
        }
        /// for 1d array to 2d array
        {
            for (int i = 0; i < b.length; i++) {
               result[i/c1][i%c1]=b[i];
            }
            System.out.println(Arrays.deepToString(result));
        }
    }
}
