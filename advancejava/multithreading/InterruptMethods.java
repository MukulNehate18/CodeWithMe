package advancejava.multithreading;

public class InterruptMethods extends Thread{

    @Override
    public void run() {
        try {
            System.out.println(interrupted());
           for (int i=1;i<=5;i++){
               System.out.println(i);
               Thread.sleep(1000);
           }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        InterruptMethods im =new InterruptMethods();
        im.start();
        im.interrupt();
    }
}
