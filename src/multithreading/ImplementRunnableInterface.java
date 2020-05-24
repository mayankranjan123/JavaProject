package multithreading;

public class ImplementRunnableInterface {
    public static void main(String[] args) throws IllegalArgumentException {
    MyThreadInterface m1 =  new MyThreadInterface();
    Thread t1 = new Thread(m1);
    t1.setName("FirstThread");
    Thread t2 = new Thread(m1, "SecondThread");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
    System.out.println(t2);
    }
}

class MyThreadInterface implements Runnable {

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
