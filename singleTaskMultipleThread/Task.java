package singleTaskMultipleThread;

public class Task extends Thread{

    @Override
    public void run() {
        System.out.println("single Task.......");
    }

    public static void main(String[] args) {
         Task task1=new Task();
         task1.start();

         Task task2=new Task();
         task2.start();

         Task task3=new Task();
         task3.start();
    }
}
