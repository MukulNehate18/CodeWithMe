package corejava.patterns;

public class VPyramid {
    public static void main(String[] args) {
        int n=5, num=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<2*n;j++){
                if (j>=i+1&&j<(i+1)+(2*(n-(i+1)))){
                    System.out.print(" ");
                }else{
                    if (j<n) {
                        System.out.print(num++);
                    }else if (j==n) {
                        num--;
                        System.out.print(num);
                    }else {
                        num--;
                        System.out.print(num);
                    }
                }
            }
            System.out.println();
        }
    }
}
