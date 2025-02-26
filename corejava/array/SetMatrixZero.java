package corejava.array;
import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int m=3, n=3;
        boolean firstEntry=true;
        int[][] matrix= {
                {0, 1, 0},
                {1, 1, 1},
                {1, 1, 1}
        };
        int index=1;
        int[][] a=new int[1][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j]==0){
                    //for increasing 2d array size
                    if (firstEntry &&(a[a.length-1][0]==0 && a[a.length-1][1]==0 )) {
                        int[][] a1 = new int[a.length + 1][2];
                        System.arraycopy(a, 0, a1, 0, a.length);
                        a = a1;
                        firstEntry=false;
                    }
                    //index storing
                    a[index-1] = new int[]{i, j};
                    index++;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            //for row
            matrix[a[i][0]]=new int[]{0, 0, 0};
            //for column
            for (int j = 0; j <m ; j++) {
                matrix[j][a[i][1]]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
