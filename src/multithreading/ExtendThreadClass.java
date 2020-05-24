package multithreading;

public class ExtendThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Thread-first");
        MyThread t2 = new MyThread();
        t2.setName("Thread-second");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "\t i:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
