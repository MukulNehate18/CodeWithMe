package corejava.patterns;
//A
//ABA
//ABCBA
//ABCDCBA
//ABCDEDCBA
public class PyramidOfCharacterWithPalindrome {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            char ch='A';
            for (int j=1;j<=2*i-1;j++){
                if (j<i){
                    System.out.print(ch++);
                }else{
                    System.out.print(ch--);
                }
            }
            System.out.println();
        }
    }
}
