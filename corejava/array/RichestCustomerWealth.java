package corejava.array;

public class RichestCustomerWealth {
    public static void richCustomer(int[][] a) {
        int max=0;
        for (int i = 0; i < a.length; i++) {
            int ans =0;
            for (int j = 0; j <a[i].length; j++) {
                ans += a[i][j];
            }
            if (max<ans){
                max = ans;
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        int[][] ans= {{1, 5}, {3, 4, 1}, {2, 8, 7}};
        richCustomer(ans);
    }
}
