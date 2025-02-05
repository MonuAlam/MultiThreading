package yield;


//yeild() method stop current execution to give chance to other thread to execute

public class Test extends  Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.start();
        for(int i=0;i<5;i++){
            Thread.yield();
            System.out.println("Main Thread");
        }
    }
}
