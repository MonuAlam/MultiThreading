package priority;

public class Test extends Thread{
    @Override
    public void run() {
           System.out.println("Running........  "+Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());
        Test test=new Test();
        test.setPriority(1 );
        test.start();
    }
}
