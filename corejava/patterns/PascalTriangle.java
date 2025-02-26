package corejava.patterns;

public class PascalTriangle {
    public static void main(String[] args) {
        int i, j, n=7;
        for (i=0;i<n;i++){
            int num=1;
            for (j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
