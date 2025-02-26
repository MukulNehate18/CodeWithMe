package corejava.patterns;

public class ReversePyramidWithNumber {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            int num=1;
            for (int j=0;j<=2*(n-i)-1;j++){
                if (j<n-i) {
                    System.out.print(num++);
                }else if (j==n-i){
                    num--;
                }else if (j>n-i){
                    num--;
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }
}
