package corejava.array;

import java.lang.reflect.Array;
import java.util.Arrays;

//Problem Statement: Flipping an image.
public class Flip {
    public static void main(String[] args) {
        int[][] img={{1, 1, 0}, {1, 0, 1}, { 0, 0, 0}};
        System.out.println(Arrays.deepToString(img));
        flip(img);
    }

    private static void flip(int[][] img) {
        for (int i = 0 ; i < img.length;i++){
            for (int j = 0; j < img[i].length/2; j++) {
                int temp=img[i][img.length-1-j];
                img[i][img.length-1-j]=img[i][j];
                img[i][j]=temp;
            }
            for (int j = 0; j < img[i].length; j++) {
                if (img[i][j]==0){
                    img[i][j]=1;
                }else{
                    img[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(img));    }

}
