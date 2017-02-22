package chapter6.second.Q5;

import java.io.Closeable;
import java.io.IOException;

public class AutocloseableFlow {
    static class Door implements AutoCloseable {
        public void close(){
            System.out.println("D");
        }
    }

    static class Window implements Closeable {
        @Override
        public void close(){
            System.out.println("W");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try (Door d = new Door(); Window w = new Window()) {
            System.out.println("T");
        } catch (Exception e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
    }

}
