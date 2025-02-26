package corejava.classandobject;
//3. Find the Largest and Smallest Elements in an Array Using Constructors:
//Problem:
//Create a class ArrayOperations that accepts an array of integers in the constructor. Then:
//Find the smallest and largest element in the array.
//Print these values.

import java.util.Scanner;

class ArrayOperations{
    private int[] a;
    public ArrayOperations(int[] c){
        a=c;
    }
    public void operation(){
        int min= a[0], max=0;
        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
            if (min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Largest value in array is "+max);
        System.out.println("Smallest value in array is "+min);
    }
}
public class Largest_Smallest_Element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] n= new int[5];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n.length;i++){
            n[i]= sc.nextInt();
        }
        ArrayOperations ap = new ArrayOperations(n);
        ap.operation();
    }
}
