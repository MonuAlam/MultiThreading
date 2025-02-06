package executor.fixedThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunFixedThread {
    public static void main(String[] args) {
        System.out.println("Main Start****************************************");

        //at a time only three thread is running
        //if we execute more than three time it run only three at a time after any of three ended then other is started
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        //at a time only 3 runs
        for(int i=1;i<=6;i++){
            executorService.execute(new Task());
        }

        executorService.shutdown();

        System.out.println("Main end###########################################");
    }
}
