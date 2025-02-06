package CompletableFuture;


import java.util.concurrent.CompletableFuture;

//thenCompose is used when the next computation depends on the result of the previous future. It’s useful for chaining asynchronous tasks.
public class ThenComposeExample {
    public static void main(String[] args) {

        CompletableFuture<Integer> future=CompletableFuture.supplyAsync(()->10);

        CompletableFuture<Integer> compose=future.thenCompose(value->CompletableFuture.supplyAsync(()->value*2));

        compose.thenAccept(value-> System.out.println("Compose : "+value));
    }
}
