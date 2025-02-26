package corejava.patterns;

public class PalindromePyramidStarSpacing {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("*");
            }

            for (int j=1;j<=2*i-1;j++){
                if (j%2==0){
                    System.out.print("*");
                }else {
                    System.out.print(i);
                }
            }

            for (int j=1;j<=(2*n)-(n+i);j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
