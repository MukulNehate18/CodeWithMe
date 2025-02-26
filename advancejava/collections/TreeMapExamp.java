package advancejava.collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExamp {
    public static void main(String[] args) {
        TreeMap<Integer, String> t= new TreeMap<>();
        t.put(1000, "abc");
        t.put(2000, "abc");
        t.put(3000, "abc");
        t.put(8000, "abc");
        t.put(1800, "abc");
        t.put(1400, "abc");
        t.put(1200, "abc");
        System.out.println("Treemap before split is"+t);

        TreeMap<Integer, String> low= new TreeMap<>();
        TreeMap<Integer, String> high= new TreeMap<>();
        Set<Integer> sets= t.keySet();
        for (Integer i:sets){
            if (i<3000){
                low.put(i, t.get(i));
            }else{
                high.put(i, t.get(i));
            }
        }
        System.out.println("Low TreeMap is "+low);
        System.out.println("High TreeMap is "+high);

    }
}
