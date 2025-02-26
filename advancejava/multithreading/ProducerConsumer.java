package advancejava.multithreading;

class SharedResource{
    int data;
    boolean available= false;

    public synchronized void put ( int d ){
        while (available) {
            try {
                System.out.println("Waiting producer.");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        data = d;
        available = true; // Moved before notify
        System.out.println("Added " + data);
        notify();
        System.out.println("Notifying to consumer");
    }

    public synchronized void get () {
        while (!available) {
            try {
                System.out.println("Consumer Waiting.");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Get " + data);
        available = false;
        notify();
        System.out.println("Notifying to producer.");
    }
}

class Producer extends Thread{
    SharedResource r;
    Producer(SharedResource s){
        this.r=s;
    }

    @Override
    public void run() {
        for (int i = 1; i <6; i++) {
            r.put(i);
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Consumer extends Thread{
    SharedResource r;
    Consumer(SharedResource s){
        this.r=s;
    }

    @Override
    public void run() {
        for (int i = 1; i <6; i++) {
            try{
                r.get();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource r= new SharedResource();
        Producer p= new Producer(r);
        Consumer c= new Consumer(r);

        p.start();
        c.start();
    }
}
