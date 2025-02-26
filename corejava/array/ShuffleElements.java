package corejava.array;
import java.util.Arrays;

public class ShuffleElements {
    public static void shuffle(int[] ans){
        int[] a= new int[ans.length];
        int x=0;
        for (int i=0;i<a.length;i++){
            if (i%2==0){
                a[i]=ans[x];
                x++;
            }else{
                a[i]=ans[(ans.length/2)+x-1];
            }
            if (x==(a.length/2)){
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a= {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        shuffle(a);
    }
}
