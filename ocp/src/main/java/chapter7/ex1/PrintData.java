package chapter7.ex1;

public class PrintData implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("Thread i: %d; Printing record: %s", Thread.currentThread().getId(),i));
        }
    }

    public static void main(String[] args) {
        (new Thread(new PrintData())).start();
    }
}
