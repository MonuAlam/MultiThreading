package multipleTastMultipleThread;

public class Task2 extends Thread{

    @Override
    public void run() {
        System.out.println("Task2...................");
        System.out.println(Thread.currentThread().getName());

    }
}
