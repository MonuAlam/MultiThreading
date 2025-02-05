package join;


// thread want to wait for another thread to complete there work and join to them
public class Test extends  Thread{

    @Override
    public void run() {
        for (int i=0;i<5;i++){

            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Test test=new Test();
        test.start();
        test.join();

        for (int i=0;i<5;i++){
            Thread.sleep(1000);
            System.out.println("Main Thread");
        }

    }
}
