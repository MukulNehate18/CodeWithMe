package advancejava.collections;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        Stack s = new Stack();
        for(int i=0; i<n;i++){
            System.out.println("Enter elements: ");
            int ele = sc.nextInt();
            s.push(ele);
        }
        Enumeration itr = s.elements();
        System.out.print("Elements in stack are: ");
        while (itr.hasMoreElements()){
            int val= (Integer)itr.nextElement();
            System.out.println(val);
        }
        Stack s2= new Stack();
        s2.push(32);
        s2.push(12);
        s2.push(2);
        System.out.println("pop element is: "+s.pop());
        System.out.println("peek element is: "+s.peek());
        System.out.println("pop element is: "+s.pop());
        System.out.println(s.empty());
        //System.out.println(s.firstElement());
        System.out.println(s.contains(3));
        System.out.println(s2.capacity());
        s2.ensureCapacity(23);
        System.out.println(s2.capacity());

    }
}
