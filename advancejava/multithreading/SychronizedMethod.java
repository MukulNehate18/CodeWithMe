package advancejava.multithreading;

public class SychronizedMethod extends Thread{
    int x, y;
    static int ans;

    synchronized public void add(int x, int y){
        ans +=x+y;
    }
    @Override
    public void run() {
        add(x, y);
    }

    public static void main(String[] args) throws InterruptedException {
        SychronizedMethod t1=new SychronizedMethod();
        t1.x=45;
        t1.y=90;
        t1.start();
        t1.join();
        SychronizedMethod t2=new SychronizedMethod();
        t2.x=65;
        t2.y=33;
        t2.start();
        t2.join();
        System.out.println(ans);
    }
}
