package corejava.array;

public class MinimumCostToMove {
    public static void main(String[] args) {
        int[] pos={1, 100000};
        System.out.println(minimumCost(pos));
    }

    private static int minimumCost(int[] pos) {
        int EvenCost=0, OddCost=0;
        for (int i:pos){
            if (i%2==0){
                EvenCost++;
            }else {
                OddCost++;
            }
        }
        return Math.min(EvenCost, OddCost);
    }
}
