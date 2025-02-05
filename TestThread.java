public class TestThread extends Thread{

    @Override
    public void run() {
        System.out.println("Running..............");
    }

    public static void main(String[] args) {
        TestThread test=new TestThread();

        test.start();
    }
}
