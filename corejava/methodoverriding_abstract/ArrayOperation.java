package corejava.methodoverriding_abstract;
//1. Write Program to perform method overriding you have to create class name as ArrParent with
// method void setValue(int arr[]): this method can accept array as parameter void arrangeSeq():
// this method can display array as per user input sequence You have to create two child class name
// as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override arrangeSeq()
// method in ArrangeAscendingOrder and sort array and display in ascending order, and you have to create
// one more class name ReverseArray and override arrangeSeq() method from ArrParent and reverse array
// and display it.


class ArrParent{
    int[] a;
    public void setValue(int[] arr){
        a=arr;
    }
    void arrangeSeq(){
        for (int j : a) {
            System.out.print(j+" ");
        }
    }
}
class ReverseArray extends ArrParent{
    public void reverse(){
        for (int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
    }
    @Override
    void arrangeSeq() {
        System.out.println("\n Reverse Array is ");

        super.arrangeSeq();
    }
}
class ArrangeAscendingOrder extends ArrParent{
    public void sort(){
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>=a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    @Override
    void arrangeSeq() {
        System.out.println("Sorted Array is ");
        super.arrangeSeq();
    }
}
public class ArrayOperation {
    public static void main(String[] args) {
        int[] arr= new int[]{2,46,89,4,3,54,78,81};
        ArrangeAscendingOrder ar=new ArrangeAscendingOrder();
        ar.setValue(arr);
        ar.sort();
        ar.arrangeSeq();

        ReverseArray ra= new ReverseArray();
        ra.setValue(arr);
        ra.reverse();
        ra.arrangeSeq();
    }
}
