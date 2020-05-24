package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableImpl {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future> futureList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Future<Integer> future = executorService.submit(new CallableTask());
            futureList.add(future);
        }

        // DO some unnecessary operations
        System.out.println("Doing unnecessary operations");

        for (int i = 0; i < futureList.size(); i++) {
            Future<Integer> future= futureList.get(i);
            System.out.println("Result for i: \t" + future.get());
        }
    }
}

class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt();
    }
}
