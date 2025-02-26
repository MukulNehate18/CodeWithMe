package corejava.patterns;

public class OppositeRightAngleTriangle {
    public static void main(String[] args) {
        int n=5;
        // loop of row
        for (int i =0;i<n; i++){
            //loop for space
            for (int k =0;k<n-i;k++){
                System.out.print(" ");
            }
            //loop for star
            for (int j=0;j<(i+1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
