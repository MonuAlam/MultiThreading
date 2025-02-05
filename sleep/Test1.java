package sleep;

import daemonThread.Test;

public class Test1 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i+" :"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Test1 test1=new Test1();
        test1.start();

        Test1 test2=new Test1();
        test2.start();
    }
}
