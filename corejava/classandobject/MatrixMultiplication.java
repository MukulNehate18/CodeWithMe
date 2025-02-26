package corejava.classandobject;
//1. Matrix Multiplication using Constructors
//Problem: Create a class Matrix with a constructor that takes two matrices as input (both matrices will have the same dimensions).
// Implement a matrix multiplication operation using a constructor, and return the result as a new matrix.

class Matrix{
    private int[][] a, b;
    public Matrix(int[][]x, int[][]y){
        a=x;
        b=y;
    }
    public int[][] mult() {
        int rowA = a.length;
        int colA = a[0].length;
        int colB = b[0].length;

        int[][] result = new int[rowA][colB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] i= new int[][]{
                { 1, 2, 3},
                { 4, 5, 6},
                { 7, 8, 9}
        };
        int[][] j= new int[][]{
                { 1, 2, 3},
                { 4, 5, 6},
                { 7, 8, 9}
        };

        Matrix m= new Matrix(i, j);
        int[][] result= m.mult();
        for (int a=0;a<result.length;a++){
            for (int b=0;b< result.length;b++){
                System.out.print(result[a][b]+"\t");
            }
            System.out.println();
        }
    }
}
