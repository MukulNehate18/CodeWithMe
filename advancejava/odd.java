package advancejava;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Stack;

public class odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        ArrayList al = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements: ");
            int ele = sc.nextInt();
            al.add(ele);
        }
        Iterator itr = al.iterator();
        System.out.println("even elements are: ");
        while (itr.hasNext()) {
            int val = (Integer) itr.next();
            if (val % 2 == 1) {
                System.out.println(val);
            }
        }
        ArrayList s2= new ArrayList();
        s2.add(32);
        s2.add(12);
        s2.add(2);
//  addAll() function
        al.addAll(s2);
        System.out.println(al);
    }
}
