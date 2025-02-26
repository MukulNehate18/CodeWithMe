package corejava.array;

import java.util.Arrays;
//Problem Statement: Determine Whether matrix can be obtained by rotation.
public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat={
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] target={
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println(rotateMatrix(mat, target));
    }

    private static boolean rotateMatrix(int[][] mat, int[][] target) {
        int[][] result = new int[3][3];
        int x=4;
        while(x>1) {
            if (x==4||x==2){
                for (int i = 0; i < mat.length; i++) {
                     for (int j=0;j<mat[i].length;j++){
                        result[j][mat[i].length-1-i]=mat[i][j];
                    }
                }
                if (Arrays.deepEquals(result, target)) {
                    return true;
                }
            }else{
                for (int i = 0; i < mat.length; i++) {
                    for (int j=0;j<mat[i].length;j++){
                        mat[i][j]=result[j][i];
                    }
                }
                if (Arrays.deepEquals(mat, target)) {
                    return true;
                }
            }
            x--;
        }
        return false;
    }
}
