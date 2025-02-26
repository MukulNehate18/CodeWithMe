package advancejava.multithreading;

public class DaemonMethods extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Child Task.");
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        System.out.println("Main Task.");
        DaemonMethods d= new DaemonMethods();
        d.setDaemon(true);
        d.setPriority(2);
        d.start();
    }
}
