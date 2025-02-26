package corejava.patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        System.out.print("Enter Width: ");
        int w = sc.nextInt();

        for (int i=1; i<=h;i++){
            for(int j=1; j<=w;j++){
                if((i ==1) || (i==h)||(j==1)||(j==w)){
                    System.out.print("*");
                } else {
                    for (int k =1; k<w-1;k++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
