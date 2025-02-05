package join;

public class OfficerSign extends Thread{
    @Override
    public void run() {
        System.out.println("OfficerSign Start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("OfficerSign Completed");
    }
}
