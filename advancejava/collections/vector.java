package advancejava.collections;

import java.util.Enumeration;
import java.util.*;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        Vector ve = new Vector();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements: ");
            int ele = sc.nextInt();
            ve.add(ele);
        }
        Enumeration e = ve.elements();
        System.out.print("Elements in stack are: ");
        while (e.hasMoreElements()) {
            int val = (Integer) e.nextElement();
            System.out.println(val);
        }
        System.out.println(ve.isEmpty());
    }
}
