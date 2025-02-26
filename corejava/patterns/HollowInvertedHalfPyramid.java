package corejava.patterns;

public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i=0; i<n;i++){
            int num=i+1;
            for(int j=1; j<=n-i;j++){
                if (i==0||j==1||(j==n-i) ) {
                    System.out.print(num);
                    num++;
                }else {
                    System.out.print(" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
