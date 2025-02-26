package corejava.array;

public class LuckyNumbers {
    public static void main(String[] args) {
        int[][] a={
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        int x=luckyNumber(a);
        System.out.println(x);
    }

    private static int luckyNumber(int[][] a) {
        int luckyNumber=0, x = 0;
        for (int i = 0; i < a.length; i++) {
            int min=a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                if (min>a[i][j]){
                    min=a[i][j];
                    x=j;
                }
                if (j==a[i].length-1){
                    int max=min;
                    for (int k = 0; k < a.length; k++) {
                        if (max<a[k][x]){
                            max=a[k][x];
                        }
                    }
                    if (min==max){
                        luckyNumber=min;
                    }
                }
            }

        }
        return luckyNumber;
    }
}
