package corejava.patterns;

public class MyNameMUKUL {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < 2*n; i++) {
            if (i<n) {
                //M letter
                for (int j = 0; j < n; j++) {
                    if (j==0||j==i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < n; j++) {
                    if (j==n-1||j==n-i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
                //U Letter
                for (int j = 1; j <= 2*n; j++) {
                    if (j==1||j==2*n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
                //K letter
                for (int j = 0; j <n ; j++) {
                    if (j==0 || j==n-i-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.print(" ");
                //U Letter
                for (int j = 1; j <= 2*n; j++) {
                    if (j==1||j==2*n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
                //L letter
                for (int j = 0; j < n; j++) {
                    if (j==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }else{
                //M letter
                for (int j = 0; j < 2*n; j++) {
                    if (j==0 || j==(2*n)-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
                //U letter
                for (int j = 1; j <= 2*n; j++) {
                    if (j==1||j==2*n||i==(2*n)-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
                //K letter
                for (int j = 0; j <n ; j++) {
                    if (j==0 || j==(i-n)){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.print(" ");
                //U letter
                for (int j = 1; j <= 2*n; j++) {
                    if (j==1||j==2*n||i==(2*n)-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
                //L letter
                for (int j = 0; j < 2*n; j++) {
                    if (j==0||i==2*n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
