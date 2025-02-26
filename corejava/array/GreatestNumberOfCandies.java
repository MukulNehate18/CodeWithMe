package corejava.array;

import java.util.Arrays;
import java.util.Scanner;


//Problem statement: kids With the Greatest Number of Candies
public class GreatestNumberOfCandies {
    public static boolean[] greaterKid(int[] a, int l) {
        boolean[] ans= new boolean[a.length];
        for (int i=0;i<a.length;i++){
            int c=0;
            int sum =a[i]+l;
            for (int j = 0; j < a.length; j++) {
                if (sum<a[j]){
                    c++;
                }
            }
            if (c==0){
                ans[i]=true;
            }else{
                ans[i]=false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] candies={12, 1, 12};
        System.out.println("Enter Extra Candies: ");
        int l=sc.nextInt();
        boolean[] a=greaterKid(candies, l);
        System.out.println(Arrays.toString(a));
    }
}
