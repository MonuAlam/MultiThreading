package interThreadComm;

public class TotalEarning extends  Thread{

    int total=0;
    @Override

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total += 100;
            }
            this.notify();
        }
    }
}
