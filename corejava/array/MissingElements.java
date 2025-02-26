package corejava.array;

public class MissingElements {
    public static void main(String[] args) {
        int[] a=new int[]{2, 5, 6, 8, 9};
        for (int i = 1; i <= a.length; i++) {
            boolean x= false;
            for (int k : a) {
                if (k == i) {
                    x = true;
                    break;
                }
            }
            if (!x){
                System.out.println(i);
            }
        }
    }
}
