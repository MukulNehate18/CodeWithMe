package corejava.array;
//Problem statement: Count number of element whose digit length are even.
public class EvenDigit {
    public static void main(String[] args) {
        int[] a={555, 901, 482, 1771};
        System.out.println(evenDigitElement(a));
    }

    private static int evenDigitElement(int[] a) {
        int count=0;
        for (int i:a){
            int countDigit=0;
            while(i>0){
                countDigit++;
                i /= 10;
            }
            if (countDigit%2==0){
                count++;
            }
        }
        return count;
    }
}
