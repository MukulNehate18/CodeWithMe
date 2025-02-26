package corejava.patterns;

public class PalindromeTriangleByAlphabet {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<=n;i++){
            char num='A';
            for (int j=1;j<=i;j++) {
                if (j == 1) {
                    System.out.print(num);
                } else {
                    num++;
                    System.out.print(num);
                }
            }

            for (int j=1;j<=i-1;j++){
                num--;
                System.out.print(num);
            }
            System.out.println();

        }
    }
}
