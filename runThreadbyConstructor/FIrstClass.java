package runThreadbyConstructor;

public class FIrstClass implements Runnable{

    @Override
    public void run() {

        for (int i=1;i<=10;i++){
            System.out.println("Tick - Tick : "+i+" "+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    FIrstClass(){
        new Thread(this).start();
    }
}
