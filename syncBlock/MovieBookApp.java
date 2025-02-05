package syncBlock;


public class MovieBookApp extends Thread{
    static BookTheaterSeat bookTheaterSeat;
    int seat;
    @Override
    public void run() {
        bookTheaterSeat.bookSeat(seat);
    }

    public static void main(String[] args) {

        bookTheaterSeat=new BookTheaterSeat();

        MovieBookApp amit=new MovieBookApp();
        amit.seat=5;
        amit.start();

        MovieBookApp rohan=new MovieBookApp();
        rohan.seat=8;
        rohan.start();


    }
}
