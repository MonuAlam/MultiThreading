package daemonThread;

public class Test extends Thread{
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }else {
            System.out.println("Child Thread of Main Thread");
        }
    }

    public static void main(String[] args) {

        System.out.println("This is main Thread");
        Test test=new Test();
        test.setDaemon(true);
        test.start();
    }
}
