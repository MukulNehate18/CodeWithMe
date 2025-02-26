package corejava.array;

import java.util.Arrays;

//Problem statement: Transpose Matrix
public class Transpose {
    public static void main(String[] args) {
        int row=3, col=3;
        int[][] a= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(transposeMatrix(a, row, col)));
    }

    private static int[][] transposeMatrix(int[][] a, int row, int col) {
        int[][] result;
        if (row<col) {
            result = new int[col][row];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    result[j][i] = a[i][j];
                }
            }
        }else{
            result = new int[row][col];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    result[j][i] = a[i][j];
                }
            }
        }
        return result;
    }
}
