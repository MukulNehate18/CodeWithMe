package corejava.array;
//Problem Statement: Diagonal sum of matrix.
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat={
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        int[] length= rowLength(mat);
        sumDiagonal(mat, length);
    }

    private static int[] rowLength(int[][] mat) {
        int[] length= new int[mat.length];
        for (int i=0;i<mat.length;i++){
            length[i]=mat[i].length;
        }
        return length;
    }

    private static void sumDiagonal(int[][] mat, int[] length) {
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (length[i] % 2 == 1) {
                    if (j == i || j == mat[i].length - 1 - i) {
                        sum += mat[i][j];
                    }
                } else {
                    if ((j == i || j == mat[i].length - 1 - i)&& i <mat.length/2) {
                        sum += mat[i][j];
                    }else if ((j == i + 1 || j == mat[i].length - 1 - (i + 1))&& i>=mat.length/2) {
                        sum += mat[i][j];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
