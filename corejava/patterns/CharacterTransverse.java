package corejava.patterns;

public class CharacterTransverse {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            char ch='A';
            if (i>0){
                for (int j = 0; j < i; j++) {
                    ch++;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(ch++);
                for (int k = 0; k < n-1; k++) {
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
