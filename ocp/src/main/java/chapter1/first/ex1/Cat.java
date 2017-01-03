package chapter1.first.ex1;

public class Cat extends Animal{
    private String color;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
}
