package advancejava.multithreading;
import java.lang.*;

public class ThreadExample extends Thread{
    public void run(){
        System.out.println("Thread task.");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Mukul");// set a name to Mukul
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
        ThreadExample th= new ThreadExample();
        System.out.println(th.isAlive());
        th.start();
    }
}
