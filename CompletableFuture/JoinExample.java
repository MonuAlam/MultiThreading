package CompletableFuture;

import java.util.concurrent.CompletableFuture;

//The join() method waits for the completion of the CompletableFuture and returns the result. If an exception occurs, it wraps it in a CompletionException
public class JoinExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5);

        Integer result = future.join();  // Waits for the result and returns it
        System.out.println("Result: " + result);  // Will print 5
    }
}