package advancejava.multithreading;

public class Mythread extends Thread{
    public void run(){
        System.out.println("Thread created by Thread Class.");
    }
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
    }
}
