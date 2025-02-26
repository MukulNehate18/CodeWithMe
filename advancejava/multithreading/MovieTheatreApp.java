package advancejava.multithreading;

class BookSeat{
    int total_seats=10;
    synchronized void BookSeat( int seats){
        if (total_seats>=seats){
            System.out.println("Seats Booked");
            total_seats -=seats;
            System.out.println("Tickets left "+total_seats);
        }else{
            System.out.println("Book failed!!");
            System.out.println("Tickets left "+total_seats);
        }
    }
}
public class MovieTheatreApp extends Thread{
    static BookSeat b;
    int seats;
    @Override
    public void run() {
        b.BookSeat(seats);
    }

    public static void main(String[] args) {
        b= new BookSeat();
        MovieTheatreApp mt= new MovieTheatreApp();
        mt.seats=5;
        mt.start();
        MovieTheatreApp mt2= new MovieTheatreApp();
        mt2.seats=7;
        mt2.start();

    }
}
