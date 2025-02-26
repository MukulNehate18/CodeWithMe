package corejava.constructor;
//3. Prime Number Checker
//Create a Number class with a field num. Use a parameterized constructor to initialize it. Add a method to check if the number is prime.
//Explanation: Use efficient prime-checking logic with a clear object-based implementation.
class Prime{
    private int num;
    public Prime(int a){
        num=a;
    }
    public void primeCheck(){
        int flag=0;
        for (int i=2;i<=num;i++){
            if (num%i == 0){
                flag++;
            }
        }
        if (flag==1){
            System.out.println("Prime number");
        }else {
            System.out.println("Not a prime number.");
        }
    }
}

public class PrimeCheck {
    public static void main(String[] args) {
        Prime p= new Prime(8);
        p.primeCheck();
    }
}
