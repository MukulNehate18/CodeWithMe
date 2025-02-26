package corejava.array;

import java.util.Arrays;

//Problem Statement: Cells with odd values in matrix.
public class OddValueMatrix {
    public static void main(String[] args) {
        int m=2, n=3;
        int[][] indices={{0,1},{1,1}};
        oddMatrix(m, n, indices);
    }

    private static void oddMatrix(int m, int n, int[][] indices) {
        int[][] a= new int[m][n];
        for (int i=0;i< indices.length ;i++){
            for (int j=0;j<indices[i].length;j++){
                int p=indices[i][j];
                if (j==0){
                    for (int k = 0; k < n; k++) {
                        a[p][k] +=1;
                    }
                }else{
                    for (int s=0;s<m;s++) {
                        a[s][p] += 1;
                    }
                }
            }
        }
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]%2==1){
                    count++;
                }
            }
        }
        System.out.println(Arrays.deepToString(a)+"\nOdd element in array is "+count);
    }
}
