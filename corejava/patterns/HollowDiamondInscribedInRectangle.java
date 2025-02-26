package corejava.patterns;

public class HollowDiamondInscribedInRectangle {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<=2*n;i++){
            if(i+1<=(2*n)/2) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2 * i; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < n - i ; j++) {
                    System.out.print("*");
                }
            }else {
                for (int j = 1; j <=i-n; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2*(n-(i-n)); j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i-n; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
