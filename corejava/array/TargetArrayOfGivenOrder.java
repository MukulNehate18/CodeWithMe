package corejava.array;

import java.util.Arrays;

//Problem Statement: Create target array in the given order
public class TargetArrayOfGivenOrder {
    public static int[] target(int[] num, int[] index) {
        int[] target= new int[num.length];
        for (int i=0;i<num.length;i++){
            if (target[index[i]] !=0){
                for (int j = 1; j<=i ;j++) {
                    target[target.length-j]=target[target.length-j-1];
                }
            }
            target[index[i]]=num[i];
        }
        return target;
    }
    public static void main(String[] args) {
        int[] num={4, 2, 1, 1};
        int[] index={0, 0, 2, 0};

        int[] target= target(num, index);
        System.out.println(Arrays.toString(target));

    }
}

//List<Integer> targetList = new ArrayList<>();
//
//        for (int i = 0; i < num.length; i++) {
//            targetList.add(index[i], num[i]);  // Efficiently inserts at the correct position
//        }
//
//        // Convert List to Array
//        int[] target = new int[num.length];
//        for (int i = 0; i < num.length; i++) {
//            target[i] = targetList.get(i);
//        }
//
//        return target;