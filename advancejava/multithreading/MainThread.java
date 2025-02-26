package advancejava.multithreading;
import java.lang.*;

public class MainThread extends Thread{

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName()); // by default name of PSVM is thread main
        Thread.currentThread().setName("sdfs");//here is change the name of main
        System.out.println(Thread.currentThread().getName());
        System.out.println(40/0);

    }
}
