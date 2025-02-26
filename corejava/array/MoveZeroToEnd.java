package corejava.array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] a= new int[]{0, 1, 2, 0, 4};
        for (int i=0;i<a.length;i++){
            if (a[i]==0){
                for (int j=i;j<a.length;j++){
                    if (j<a.length-1) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
        for (int j=0;j<a.length;j++){
            System.out.print(a[j]);
        }
    }
}
