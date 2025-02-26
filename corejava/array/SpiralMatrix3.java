package corejava.array;

import java.util.Arrays;

public class SpiralMatrix3 {
    public static void main(String[] args) {
        int rows=5, cols=6, rStart=1, cStart=4;
        System.out.println(Arrays.deepToString(spiral3(rows, cols, rStart, cStart)));
    }

    private static int[][] spiral3(int rows, int cols, int rStart, int cStart) {
        int[][] x=new int[rows*cols][2];
        int[][] direction = { {0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int c=cStart, r=rStart;
        int z=0, step=1, d=0;
//            //right direction
//            for (int i = 0; i <= step+1; i++) {
//                x[z][0]=r;
//                x[z][1]=c;
//                if (r<rows&&c<cols){
//                    c++;
//                }else{
//                }
//                z++;
//            }
//            c--;
//            r++;
//            //down direction
//            for (int i = 0; i < step+1; i++) {
//                x[z][0]=r;
//                x[z][1]=c;
//                c--;
//                z++;
//            }
//            step +=2;
//            //left direction
//            for (int i = 1; i < step; i++) {
//                x[z][0]=r;
//                x[z][1]=c;
//                c--;
//                z++;
//            }
//            //top direction
//            for (int i = 0; i < step; i++) {
//                x[z][0]=r;
//                x[z][1]=c;
//                r--;
//                z++;
//            }
        while(z<cols*rows){
            //no of travelling
            for (int i = 0; i < 2; i++) {
                //steps to travel
                for (int j = 0; j < step; j++) {
                    // check whether given co-ordinates are not out of 2d matrix;
                    if (r>=0 &&r <rows && c>=0 &&c<cols){
                        x[z++]=new int []{r, c};
                    }
                    //for direction
                    r +=direction[d][0];
                    c +=direction[d][1];
                }
                // to reset d value to for direction index
                d =(d+1)%4;
            }
            // for steps increase
            step++;
        }
        return x;
    }
}
