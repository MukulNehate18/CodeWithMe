package advancejava.multithreading;

public class PreventThreadMethodbyThread extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            try{
                Thread.sleep(1000,9999999);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        PreventThreadMethodbyThread p= new PreventThreadMethodbyThread();
        p.start();
    }
}
