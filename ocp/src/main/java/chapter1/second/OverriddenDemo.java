package chapter1.second;

abstract class Animal{
    String name = "???";
    public void printName(){
        System.out.println(name);
    }
}

class Lion extends Animal {
    String name = "Leo";
}

public class OverriddenDemo {
    public static void main(String[] args) {
        Animal lion = new Lion();

        lion.printName();
    }
}
