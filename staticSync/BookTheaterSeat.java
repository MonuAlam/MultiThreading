package staticSync;

public class BookTheaterSeat {

   static int totalSeat = 20;

    static synchronized void bookSeat(int seat) {
        if (totalSeat >= seat) {
            System.out.println("Seat Booked :");
            totalSeat -= seat;
            System.out.println("Left seates :" + totalSeat);
        } else {
            System.out.println("total Remaining seat is  " + totalSeat + "  less than requested seat " + seat);
            System.out.println("can't booked");
        }

    }

}
