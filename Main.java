import java.util.Scanner;

public class Main //
{
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);
        int[][] a= new int[3][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        int sum=0;
        System.out.println("Display Matrix: ");
        for (int[] ints : a) {
            int max = 0;
            for (int j = 0; j < a.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
                System.out.print(ints[j]);
            }
            sum = sum + max;
            System.out.println();
        }
        System.out.println("Sum of max value in every row "+sum);
    }
}