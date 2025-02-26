package corejava.array;

import java.util.Arrays;

//Problem Statement: Count items matching a rule
public class HighestAltitude {
    public static int altitude(int[] a){
        int[] net=new int[a.length+1];
        net[1]=a[0];
        for (int j = 1; j < net.length-1; j++) {
            net[j+1] =net[j-1]+a[j-1]+a[j];
        }
        int max=0;
        for (int j : net) {
            if (j > max)
                max = j;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] gain={-5, 1, 5, 0, -7};
        System.out.println(altitude(gain));
    }
}
