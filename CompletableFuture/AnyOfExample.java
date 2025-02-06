package CompletableFuture;

import java.util.concurrent.CompletableFuture;

//This method is used when you only care about the first CompletableFuture to complete out of multiple futures.
public class AnyOfExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
            return 10;
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            return 20;
        });

        CompletableFuture<Object> anyOf = CompletableFuture.anyOf(future1, future2);

        // Will print 20, because future2 completes first
        anyOf.thenAccept(result -> System.out.println("First completed: " + result));
    }
}