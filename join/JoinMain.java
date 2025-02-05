package join;

public class JoinMain extends Thread {
    static Thread mainThread;

    @Override
    public void run() {

        try {
            mainThread.join();
            for (int i = 0; i < 5; i++) {

                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        mainThread = Thread.currentThread();
        Test test = new Test();
        test.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Main Thread");
        }

    }
}
