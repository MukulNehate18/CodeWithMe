package corejava.patterns;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n=5;
        for (int i =1; i<n+i;i++){
            for (int j=0; j<i;j++){
                System.out.print(" ");
            }

            for (int k=0; k<2*n-1;k++){
                System.out.print("*");
            }

            System.out.println(" ");
            n--;
        }
    }
}
