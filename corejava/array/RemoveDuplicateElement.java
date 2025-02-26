package corejava.array;

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] nums={1, 1, 2};
        System.out.println(removeElement(nums));
    }

    private static int removeElement(int[] nums) {
        int k=0;
            for (int j = 0; j < nums.length-1-k; j++) {
                if (nums[j]==nums[j+1]){
                    for (int l = j+1; l < nums.length-1; l++) {
                        nums[l]=nums[l+1];
                    }
                    nums[nums.length-1]=0;
                    k++;
                    if (nums[j]==nums[j+1]){
                        j--;
                    }
                }
            }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
