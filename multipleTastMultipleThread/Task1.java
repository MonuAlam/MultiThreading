package multipleTastMultipleThread;

public class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Task1..............");
        System.out.println(Thread.currentThread().getName());
    }
}
