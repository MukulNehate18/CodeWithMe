package corejava.inheritance;
//3. Write Program create class name as ArrSum with method void setValue(int arr[])
// you have to create child class name as GetSum with method int getArrSum()
// you have to accept array values from ArrSum and calculate its sum and return it.

class ArrSum{
    protected int[] a;
    public void setValue(int[] arr){
        a=arr;
    }
}
class GetSum extends ArrSum{
    public int getArrSum(){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr= new int[]{5,89,56,23,49,9};
        GetSum gs=new GetSum();
        gs.setValue(arr);
        System.out.println("Sum of Array is "+gs.getArrSum());
    }
}
