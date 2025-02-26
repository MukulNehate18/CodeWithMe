package corejava.patterns;

public class palindromePatternPyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=0;
            for (int j=1;j<=i;j++){
                System.out.print(j);
                num++;
            }
            num--;
            for (int j=1;j<=i-1;j++){
                System.out.print(num--);
            }
            System.out.println();
        }
    }
}
