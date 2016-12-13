package chapter7.ex21.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fox {
    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println("Got food!");
            move();
            synchronized (water) {
                System.out.println("Got water!");
            }
        }
    }

    public void drinkAndEat(Food food, Water water) {
        synchronized (water) {
            System.out.println("Got water!");
            move();
            synchronized (food) {
                System.out.println("Got food!");
            }
        }
    }

    private void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Fox foxy = new Fox();
        Fox tails = new Fox();
        Food food = new Food();
        Water water = new Water();

        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(10);
            service.submit(() -> foxy.drinkAndEat(food, water));
            service.submit(() -> tails.eatAndDrink(food, water));
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
