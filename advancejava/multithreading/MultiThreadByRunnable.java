package advancejava.multithreading;

class MyThread3 implements Runnable{
    public void run(){
        System.out.println("Play video");
    }
}

class MyThread4 implements Runnable{
    public void run(){
        System.out.println("Play audio");
    }
}
public class MultiThreadByRunnable {
    public static void main(String[] args) {
        MyThread3 mt = new MyThread3();
        MyThread4 mn = new MyThread4();
        Thread t = new Thread(mt);
        t.start();
        t = new Thread(mn);
        t.start();
    }
}
