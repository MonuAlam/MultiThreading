package CompletableFuture;

import java.util.concurrent.CompletableFuture;

//This method combines the results of two independent CompletableFutures. It executes when both futures are complete.
public class ThenCombineExample {

    public static void main(String[] args) {
        CompletableFuture<Integer> future=CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> future1=CompletableFuture.supplyAsync(()->20);

        CompletableFuture <Integer>  combines=future.thenCombine(future1,(result1,result2)->result1+result2);

        combines.thenAccept(value-> System.out.println("combined result : "+value));
    }
}
