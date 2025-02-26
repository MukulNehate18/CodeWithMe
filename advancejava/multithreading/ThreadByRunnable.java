package advancejava.multithreading;

public class ThreadByRunnable implements Runnable{
    public void run(){
        System.out.println("Thread created by Runnable Interface.");

    }

    public static void main(String[] args) {
        ThreadByRunnable th = new ThreadByRunnable();
        Thread t = new Thread(th);
        t.start();
    }

}
