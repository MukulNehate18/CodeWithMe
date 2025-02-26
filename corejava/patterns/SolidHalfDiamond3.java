package corejava.patterns;

public class SolidHalfDiamond3 {
    public static void main(String[] args) {
        int n=4, x=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (j==1){
                    System.out.print(x);
                }else{
                    System.out.print("*"+x);
                }
                x++;
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            if (i==0) {
                x = x - n;
            }else{
                x =x- 2*(n-i)-1;
            }
            for (int j=1;j<=n-i;j++){
                if (j==1){
                    System.out.print(x);
                }else{
                    System.out.print("*"+x);
                }
                x++;
            }
            System.out.println();
        }
    }
}