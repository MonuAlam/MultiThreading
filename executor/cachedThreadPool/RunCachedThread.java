package executor.cachedThreadPool;

import executor.fixedThreadPool.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunCachedThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");

        ExecutorService executorService= Executors.newCachedThreadPool();

        for(int i=1;i<=5;i++){
            executorService.execute(new Task());
        }

        executorService.shutdown();

        System.out.println("Main Thread ended");
    }
}
