package corejava.patterns;

public class FullPyramidByNumber {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<=n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            int num=i;
            for (int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            num--;
            for(int j=1;j<=i-1;j++){
                num--;
                System.out.print(num);
            }
            System.out.println(" ");
        }
    }
}
