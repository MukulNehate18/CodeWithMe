package advancejava.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateItemsRemoveAL {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        a.add("abc");
        a.add("xyz");
        a.add("pqr");
        a.add("xyz");
        a.add("abc");
        a.add("abc");
        System.out.println("ArrayList before edit is "+a);

        HashSet<String> h= new HashSet<>(a);
        System.out.println(h);
    }
}
