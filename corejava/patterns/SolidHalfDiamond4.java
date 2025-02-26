package corejava.patterns;

public class SolidHalfDiamond4 {
    public static void main(String[] args) {
        int i, j, n=4;
        for (i = 1; i <= n; i++) {
            int x = 1;
            for (j = 1; j <= i; j++) {
                if(j==1){
                    System.out.print("*");
                }else{
                    System.out.print(x);
                    x++;
                }
            }
            x--;
            for (int k = 1; k <= i - 1; k++) {
                if(k==i-1){
                    System.out.print("*");
                }else {
                    x--;
                    System.out.print(x);
                }
            }
            System.out.println();
        }

// inverted half palindrome diamond
        for (i = 1; i < n; i++) {
            int x = 1;
            for (j = 1; j <=n-i; j++) {
                if(j==1){
                    System.out.print("*");
                }else{
                    System.out.print(x);
                    x++;
                }
            }
            x--;
            for (int k = 1; k <= n - i - 1; k++) {
                if(k==n-i-1){
                    System.out.print("*");
                }else {
                    x--;
                    System.out.print(x);
                }
            }
            System.out.println();
        }
    }
}
