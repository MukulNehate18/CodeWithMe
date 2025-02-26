package advancejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseSortingInAL {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(23);
        a.add(67);
        a.add(43);
        a.add(22);
        a.add(52);
        a.add(9);
        System.out.println("ArrayList before edit is "+a);

        a.sort(Comparator.reverseOrder());
        System.out.println(a);
    }
}
