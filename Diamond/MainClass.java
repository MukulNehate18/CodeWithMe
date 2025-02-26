package Diamond;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Number1 n = new Number1();
        System.out.println("Enter a number: ");
        n.setN(sc.nextInt());
        n.checkPrime(n.getN());
        n.checkEven(n.getN());
        n.displayNumber(n.getN());

    }
}