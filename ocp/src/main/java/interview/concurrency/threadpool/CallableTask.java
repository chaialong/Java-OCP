package interview.concurrency.threadpool;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.currentThread().sleep(10000);
        return Thread.currentThread().getName() + " says hello world";
    }
}
