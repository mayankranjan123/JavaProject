package multithreading;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
    private Queue<Integer> sharedQueue;
    private final int MAX_SIZE = 5;

    public Producer(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQueue) {
                while (sharedQueue.size() == MAX_SIZE) {
                try {
                        System.out.println("Producer is waiting for consumer to consume");
                        sharedQueue.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                // If queue is less than max size i.e space left, then add data into the queue
                Random random = new Random();
                int data = random.nextInt(MAX_SIZE);
                sharedQueue.add(data);
                System.out.println("Produced: " + data);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sharedQueue.notify();
            }
        }
    }
}
