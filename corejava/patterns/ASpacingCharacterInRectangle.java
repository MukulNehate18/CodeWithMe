package corejava.patterns;

public class ASpacingCharacterInRectangle {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            char ch='A';
            for (int j=1;j<=2*n-1;j++){
                if (j>n-i&&j<=(n-i)+2*(i)-1){
                    System.out.print(" ");
                }else {
                    if (j<n){
                        System.out.print(ch++);
                    }else if(j==n) {
                        System.out.print(ch);
                    }else {
                        ch--;
                        System.out.print(ch);
                    }
                }
            }
            System.out.println();
        }
    }
}
