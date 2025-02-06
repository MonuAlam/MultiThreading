package executor.singleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunSingleThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Started.....");

        //it execute task one by one
        //where we use it there we need to sync the method we use this instead of sunc we using singlethreadpool it run task one by one
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        for(int i=1;i<=5;i++){
            executorService.execute(new Task());
        }
        executorService.shutdown();
        System.out.println("Main Thread ended.....");
    }
}
