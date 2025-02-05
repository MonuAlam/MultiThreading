package join;

public class Medical extends  Thread{
    @Override
    public void run() {
            System.out.println("Medical Start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mediacl Completed");

    }
}
