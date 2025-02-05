package multipleTastMultipleThread;

public class Task3 extends Thread{
    @Override
    public void run() {
        System.out.println("Task3.........");
        System.out.println(Thread.currentThread().getName());

    }
}
