package staticSync;

public class MyThread2 extends Thread{
    BookTheaterSeat bookTheaterSeat;
    int seat;

    MyThread2(BookTheaterSeat bookTheaterSeat,int seat){
        this.bookTheaterSeat=bookTheaterSeat;
        this.seat=seat;
    }

    @Override
    public void run() {
        bookTheaterSeat.bookSeat(seat);
    }
}
