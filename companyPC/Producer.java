package companyPC;

public class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c=c;
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            try {
                this.c.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
