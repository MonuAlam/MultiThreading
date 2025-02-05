package syncBlock;

public class BookTheaterSeat {

    int totalSeat = 10;

    void bookSeat(int seat) {
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        synchronized (this) {
            if (totalSeat >= seat) {
                System.out.println("Seat Booked :");
                totalSeat -= seat;
                System.out.println("Left seates :" + totalSeat);
            } else {
                System.out.println("total Remaining seat is  " + totalSeat + "  less than requested seat " + seat);
                System.out.println("can't booked");
            }
        }
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
    }

}
