package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorTask {
    public static void main(String[] args) {
        // Uses blocking queue, therefore it is thread-safe
        // Depending on CPU core(4-core) only 4 threads execute at same time
        // i.e have same name of threads = no. of cores in CPU, so that no thread has to wait
        //so , rather than passing any value (10) to Executors.newFixedThreadPool(10), we get available Core Count
        //ExecutorService executorService = Executors.newFixedThreadPool(10);
        // But in case of IO Operations or DB Operations, many threads are in waiting queue, so we can have maximum threads in these cases
        //ExecutorService executorService = Executors.newFixedThreadPool(100); - For IO/DB operations.
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new ExecutorImpl());
        }
        //Schedule task
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        service.scheduleAtFixedRate(new ExecutorImpl(), 10, 10, TimeUnit.SECONDS);
    }
}
class ExecutorImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("Executing task: " + Thread.currentThread().getName());
    }
}
