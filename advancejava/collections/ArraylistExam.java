package advancejava.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraylistExam {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        a.add("abc");
        a.add("xyz");
        a.add("pqr");
        a.add("xyz");
        a.add("abc");
        a.add("abc");
        System.out.println("ArrayList before edit is "+a);

        HashMap<String, Integer> hm = new HashMap<>();
        int count=1;

        for (String s: a){
            if (hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            }else {
                hm.put(s, count);
            }
        }
        System.out.println(hm);
    }
}
