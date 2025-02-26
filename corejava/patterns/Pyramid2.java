package corejava.patterns;
//
//A
//BAB
//CBABC
//DCBABCD
//EDCBABCDE
public class Pyramid2 {
    public static void main(String[] args) {
        int n=5;
        char ch ='A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=2*i-1;j++){
                if (i==1){
                    System.out.print((ch++)+" ");
                }else if(j<2*i/2){
                    System.out.print((ch--)+" ");
                }else {
                    System.out.print((ch++)+" ");
                }
            }
            System.out.println();
        }
    }
}
