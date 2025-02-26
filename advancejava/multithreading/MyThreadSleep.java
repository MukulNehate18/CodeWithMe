package advancejava.multithreading;

import java.nio.channels.ScatteringByteChannel;

public class MyThreadSleep extends Thread{
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println(i+" "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        MyThreadSleep m = new MyThreadSleep();
        m.start();
        MyThreadSleep n = new MyThreadSleep();
        n.start();
    }
}
