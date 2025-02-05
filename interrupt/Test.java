package interrupt;

//interrupt work only with wait() and sleep()
public class Test extends Thread{

    @Override
    public void run() {

        for (int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("sleep() encounter and it break the execution flow becoz we call interrup() method");
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.start();
        test.interrupt();
    }
}
