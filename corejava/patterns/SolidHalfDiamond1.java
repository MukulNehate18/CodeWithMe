package corejava.patterns;

public class SolidHalfDiamond1 {
    public static void main(String[] args) {
        int n=4, x=2;
        for (int i=1; i<=n;i++){
                x++;
                for (int j = 1; j <= i; j++) {
                    System.out.print(x);
                }
                System.out.println();
        }
        for (int i=1; i<=n;i++){
            x--;
            for (int j = 1; j <= n-i; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
