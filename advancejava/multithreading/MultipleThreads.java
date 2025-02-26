package advancejava.multithreading;

class MyThread1 extends Thread {
    public void run(){
        System.out.println("Play video");
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Play audio");
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        mt.start();
        MyThread2 mn = new MyThread2();
        mn.start();
    }
}
