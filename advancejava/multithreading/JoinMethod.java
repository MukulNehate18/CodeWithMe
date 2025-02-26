package advancejava.multithreading;

public class JoinMethod extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i+" Child Thread");
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        JoinMethod t= new JoinMethod();
        t.start();
        t.join();
        for (int i=0;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(i+" Main Thread");
        }
    }
}
