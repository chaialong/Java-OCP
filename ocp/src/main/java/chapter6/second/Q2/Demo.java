package chapter6.second.Q2;

import java.util.HashMap;

public class Demo implements AutoCloseable {

    @Override
    public void close() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        throw new Exception("Cage door does not close");
    }

    public static void main(String[] args){
        try (Demo d = new Demo()) {
            System.out.println("put turkeys in");
        } catch (Exception e) {

        }
    }
}
