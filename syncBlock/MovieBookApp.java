package syncBlock;


public class MovieBookApp extends Thread{
    static BookTheaterSeat bookTheaterSeat;
    int seat;
    @Override
    public void run() {
        bookTheaterSeat.bookSeat(seat);
    }

    public static void main(String[] args) {

        bookTheaterSeat=new BookTheaterSeat();//agr iske 2 bonject bana de to inconstancy ka problem aa jayega then vo solve hoga static sync jo lock class par check karta hai

        MovieBookApp amit=new MovieBookApp();
        amit.seat=5;
        amit.start();

        MovieBookApp rohan=new MovieBookApp();
        rohan.seat=8;
        rohan.start();


    }
}
