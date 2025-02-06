package CompletableFuture;

import java.util.concurrent.CompletableFuture;


//This method is used to transform the result of a CompletableFuture once it’s completed. It applies a function to the result of the future.
public class ThenApplyExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future=CompletableFuture.supplyAsync(()->20);
        CompletableFuture<Integer> result=future.thenApply(value->value*2);

        result.thenAccept(value-> System.out.println("Transfrom Result : "+value));
    }
}
