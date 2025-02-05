package staticSync;

public class MovieBookApp {
    public static void main(String[] args) {
//jab resource class(jiske method ko sync karna hai) ka multiple object bana de tab ye static sync use hota hai
        BookTheaterSeat bookTheaterSeat=new BookTheaterSeat();
        MyThread1 myThread1=new MyThread1(bookTheaterSeat,17);
        myThread1.start();

        MyThread2 myThread2=new MyThread2(bookTheaterSeat,10);
        myThread2.start();

        BookTheaterSeat bookTheaterSeat1=new BookTheaterSeat();
        MyThread1 myThread3=new MyThread1(bookTheaterSeat1,12);
        myThread3.start();

        MyThread2 myThread4=new MyThread2(bookTheaterSeat1,12);
        myThread4.start();
    }
}
