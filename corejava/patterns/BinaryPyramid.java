package corejava.patterns;

public class BinaryPyramid {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=0;j<10;j++){
                if (j>(i)+(2*(5-(i+1))) || j<=i){
                    if(j<=5){
                        System.out.print(j % 2);
                    }else {
                        System.out.print((j+1) % 2);
                    }
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
