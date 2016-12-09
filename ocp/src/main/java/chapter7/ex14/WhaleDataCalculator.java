package chapter7.ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class WhaleDataCalculator {
    public int processRecord(int input) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return input + 1;
    }

    public void processAllData(List<Integer> data) {
        data.parallelStream().map(x -> processRecord(x)).count();
    }

    public static void main(String[] args) {
            WhaleDataCalculator calculator = new WhaleDataCalculator();
            List<Integer> data = new ArrayList<Integer>();
            for(int i=0; i<400; i++) data.add(i);

            long start = System.currentTimeMillis();
            calculator.processAllData(data);

            System.out.println("Tasks completed in: " + (System.currentTimeMillis() - start)/1000.0);
    }
}
