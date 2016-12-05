package chapter7.ex2;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i <= 500; i++) {
                System.out.println(CheckResults.counter++);
            }
        }).start();

        while (CheckResults.counter <500){
            System.out.println("Not finished yet: " + CheckResults.counter);
        }
        System.out.println("Reached!");
    }
}
