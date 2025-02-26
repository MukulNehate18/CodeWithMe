package corejava.patterns;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        System.out.print("Enter Width: ");
        int w=sc.nextInt();

        for(int i=0; i<h;i++){
            for(int j=0; j<w;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
