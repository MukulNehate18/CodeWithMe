package corejava.patterns;

public class PalindromePattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                    System.out.print(j);
                    count++;
            }
            count--;
            for (int j=1;j<=i-1;j++){
                System.out.print(count--);
            }
            System.out.println();
        }
    }
}
