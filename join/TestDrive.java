package join;

public class TestDrive extends Thread {

    @Override
    public void run() {
        System.out.println("Test drive start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test Drive completed");
    }
}
