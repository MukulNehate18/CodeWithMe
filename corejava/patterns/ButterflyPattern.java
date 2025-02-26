package corejava.patterns;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=2*n;i++){
            if (i<=(2*n)/2){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else {
                for (int j = 1; j <= n-(i-n)+1; j++) {
                    System.out.print("*");
                }
                for (int j=1;j<=2*(i-n-1);j++){
                    System.out.print(" ");
                }
                for (int j=1;j<=n-(i-n)+1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
