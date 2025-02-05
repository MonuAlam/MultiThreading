package multipleTastMultipleThread;

public class MyThread {

    public static void main(String[] args) {

        Task1 task1=new Task1();
        task1.start();

        Task2 task2=new Task2();
        task2.start();

        Task3 task3=new Task3();
        task3.start();

        System.out.println(Thread.currentThread().getName());
    }
}
