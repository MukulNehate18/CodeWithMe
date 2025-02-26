package corejava.patterns;

public class DiamondOfNumber {
    public static void main(String[] args) {
        int n=5;
        for (int i=0; i<n; i++){
            int num=5;
            for (int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(num);
                num--;
            }
            num++;
            for(int l =0; l<i; l++){
                num++;
                System.out.print(num);
            }
            System.out.println(" ");
        }
        // reverse
        for (int i=1; i<n; i++){
            System.out.print(" ");
            int num=5;
            for (int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n-i; k++){
                System.out.print(num);
                num--;
            }
            num++;
            for(int l=2; l<=n-i; l++){
                num++;
                System.out.print(num);
            }

            System.out.println(" ");
        }
    }
}
