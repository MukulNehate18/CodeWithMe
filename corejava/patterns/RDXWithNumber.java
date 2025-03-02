package corejava.patterns;

public class RDXWithNumber {
    public static void main(String[] args) {
        int n = 4, a = 100;
        for (int i = 1; i <= n * 2; i++) {
            if (i <= n) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n || i == 1 || i == n) {
                        System.out.print(a);
                        a += 2;
                    } else {
                        System.out.print("   ");
                        a++;
                    }
                }
                System.out.print(" ");
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n || i == 1) {
                        System.out.print(a);
                        a += 2;

                    } else {
                        System.out.print("   ");
                        a++;
                    }
                }
                System.out.print(" ");
                for (int j = 1; j <= n; j++) {
                    if (j == i) {
                        System.out.print(a);
                        a += 2;
                    } else {
                        System.out.print("   ");
                    }
                }

                System.out.print(" ");
                for (int j = 1; j <= n; j++) {
                    if (j == n - i + 1) {
                        System.out.print(a);
                        a += 2;
                    } else {
                        System.out.print("   ");
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == (i - n)) {
                        System.out.print(a);
                        a += 2;
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.print(" ");
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n || i == n * 2) {
                        System.out.print(a);
                        a += 2;
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.print(" ");
                for (int j = 1; j <= n; j++) {
                    if (j == (n + 1 - (i - n))) {
                        System.out.print(a);
                        a += 2;
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.print(" ");
                for (int j = 1; j <= n; j++) {
                    if (j == (i - n)) {
                        System.out.print(a);
                        a += 2;
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
