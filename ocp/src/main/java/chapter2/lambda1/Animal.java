package chapter2.lambda1;

public class Animal {
    private String name;
    private boolean fly;

    public boolean isFly() {
        return fly;
    }

    public Animal(String name, boolean canFly) {
        this.name = name;
        this.fly = canFly;
    }
}
