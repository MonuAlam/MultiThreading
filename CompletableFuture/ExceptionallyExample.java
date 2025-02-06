package CompletableFuture;

import java.util.concurrent.CompletableFuture;


//This method handles exceptions in asynchronous tasks. If an exception occurs, the exceptionally() method allows you to handle it and provide a fallback value.
public class ExceptionallyExample {
    public static void main(String[] args) {

        CompletableFuture<Integer> future=CompletableFuture.supplyAsync(()->{
            if(true){
                throw new RuntimeException("Something went wrong!");
            }
            return 42;
        });

        future.exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0;
        }).thenAccept(result -> System.out.println("Result: " + result));
    }
}
