package CompletableFuture;


import java.util.concurrent.CompletableFuture;

//This method waits for all CompletableFuture instances to complete. It is used when you need to wait for multiple tasks to finish before proceeding.
public class AllOfExample {
    public static void main(String[] args) {

        CompletableFuture<Integer> future1=CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> future2=CompletableFuture.supplyAsync(()->20);

        CompletableFuture<Void> allOff=CompletableFuture.allOf(future1,future2);

        allOff.thenRun(()->{
            System.out.println("All tasks are complete.");
        });

    }
}
