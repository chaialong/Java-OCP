package interview.concurrency.thread;

public class ThreadDemo implements Runnable{

    @Override
    public synchronized void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        (new Thread(new ThreadDemo())).run();
        (new Thread(new ThreadDemo())).start();
        System.out.println(System.currentTimeMillis() - start);
    }
}
