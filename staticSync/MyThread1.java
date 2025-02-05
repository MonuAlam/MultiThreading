package staticSync;

public class MyThread1 extends  Thread{

    BookTheaterSeat bookTheaterSeat;
    int seat;
    MyThread1(BookTheaterSeat bookTheaterSeat,int seat){
        this.bookTheaterSeat=bookTheaterSeat;
        this.seat=seat;
    }

    @Override
    public void run() {
        bookTheaterSeat.bookSeat(seat);
    }
}
