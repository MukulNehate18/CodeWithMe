package corejava.array;
//Problem Statement: Number of good pairs.y
public class GoodPairs {
    public static void goodPair(int[] a){
        int count =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]){
                    System.out.println("["+i+", "+j+"]");
                    count++;
                }
            }
        }
        System.out.println("Number of good pairs are "+count);
    }
    public static void main(String[] args) {
        int[] a={1, 2, 3, 1, 1, 3};
        goodPair(a);
    }
}
