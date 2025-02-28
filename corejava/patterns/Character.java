package corejava.patterns;

public class Character {
    public static void main(String[] args) {
        int n = 5;
        char start = 'A', end = 'Z';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((start) + "" + (end) + "." + java.lang.Character.toLowerCase(start) + java.lang.Character.toLowerCase(end) + "\t");
                start++;
                end--;
            }
            System.out.println();
            }
        }
}
