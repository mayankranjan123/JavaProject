package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue<Integer> sharedQueue = new LinkedList<>();
        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);
        Thread producedThread = new Thread(producer);
        Thread consumedThread = new Thread(consumer);
        producedThread.start();
        consumedThread.start();
    }
}
