public class TestRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Running....................");
    }

    public static void main(String[] args) {
        TestRunnable runnable=new TestRunnable();

        //thread ka object iss liye banaya kyuki Runnable me only run() method hai
        // but thread start karne ke lite start() method required hai and start()
        // Thread class ka method hai issi liye hamne thread cld ka object bana kar usme current cls pass kar diya
        Thread thread=new Thread(runnable);

        thread.start();
    }
}
