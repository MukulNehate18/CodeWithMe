package corejava.patterns;

public class SolidHalfDiamond2 {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1; j<=i;j++){
                if (j%2==0) {
                    System.out.print("*"+i);
                }else if (j==1){
                    System.out.print(i);
                }else{
                    System.out.print("*"+i);
                }
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=1; j<=n-i;j++){
                if (j%2==0) {
                    System.out.print("*"+(n-i));
                }else if (j==1){
                    System.out.print(n-i);
                }else{
                    System.out.print("*"+(n-i));
                }
            }
            System.out.println();
        }

    }
}
