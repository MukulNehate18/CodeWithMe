package corejava;

public class ClockWise {
    public static void main(String[] args) {
        int n=3, num=1;
        int[][] a= new int[n][n];
        int top=0, bottom=n-1;
        int left=0, right=n-1;
        while (top<=bottom&&left<=right){

            for (int i=left;i<=right;i++){
                a[top][i]=num++;
            }top++;

            for (int i=top;i<=bottom;i++){
                a[i][right]=num++;
            }right--;

            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    a[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <=right){
                for (int i=bottom;i>=top;i--){
                    a[i][left]=num++;
                }
                left++;
            }
        }

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
