package interThreadComm;

public class MyBookingApp {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning totalEarning=new TotalEarning();
        totalEarning.start();

        synchronized (totalEarning){
            totalEarning.wait();
        System.out.println("Total Earned Money : "+totalEarning.total);
        }
    }
}
