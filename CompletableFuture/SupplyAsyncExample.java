package CompletableFuture;

import java.util.concurrent.CompletableFuture;


//This method is used to start a new asynchronous task that returns a value.
// It is often used for performing tasks in a background thread.
public class SupplyAsyncExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulating a time-consuming task like fetching data from a database
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        });

        // After 2 seconds, this will print 42
        future.thenAccept(result -> System.out.println("Result: " + result));
    }
}