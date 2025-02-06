package executor.fixedThreadPool;

public class Task extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started........#######");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tick - Tick : " + i + " : " + Thread.currentThread().getName());
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " ended........*****************");
    }
}
