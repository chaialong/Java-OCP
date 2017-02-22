package chapter6.second.Q16;

public class SnowStorm {
    static class Walk implements AutoCloseable {
        @Override
        public void close() throws Exception {
            throw new RuntimeException("snow");
        }
    }

    public static void main(String[] args) {
        try(Walk walk1 = new Walk(); Walk walk2 = new Walk()){
            throw new RuntimeException("rain");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + e.getSuppressed().length);
        }
    }
}
