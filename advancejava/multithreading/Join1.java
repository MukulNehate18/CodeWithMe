package advancejava.multithreading;

class Medical extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Medical Start");
            Thread.sleep(1000);
            System.out.println("Medical Completed");
        }catch (InterruptedException i){
            System.out.println(i.getMessage());
        }
    }
}

class TestDrive extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("TestDrive Start");
            Thread.sleep(1000);
            System.out.println("TestDrive Completed");
        }catch (InterruptedException i){
            System.out.println(i.getMessage());
        }
    }
}

class Officer extends Thread{
    @Override
    public void run() {
         try {
             System.out.println("Docs Start");
             Thread.sleep(1000);
             System.out.println("Docs Completed");
         }catch (InterruptedException i){
             System.out.println(i.getMessage());
         }
    }
}

public class Join1 {
    public static void main(String[] args) throws InterruptedException{
        Medical m = new Medical();
        m.start();
        m.join();
        TestDrive t = new TestDrive();
        t.start();
        t.join();
        Officer o= new Officer();
        o.start();
        o.join();
    }
}
