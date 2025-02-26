package advancejava.multithreading;

public class EvenOdd implements Runnable{
    public static void main(String[] args) {
        EvenOdd e= new EvenOdd();
        Thread t = new Thread(e);
        t.setName("Even");
        t.start();
        EvenOdd e2= new EvenOdd();
        Thread t1 = new Thread(e2);
        t1.setName("Odd");
        t1.start();
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            if (i%2==0 && Thread.currentThread().getName().equals("Even")){
                System.out.println(i+" is Even.");
            }else if (i%2==1 && Thread.currentThread().getName().equals("Odd")){
                System.out.println(i+" is Odd.");
            }
        }
    }
}
