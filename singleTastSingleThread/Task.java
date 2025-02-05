package singleTastSingleThread;

public class Task extends Thread{

    @Override
    public void run() {
        System.out.println("Running.................");
    }

    public static void main(String[] args) {
        Task task=new Task();

        task.start();
    }
}
