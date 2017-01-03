package chapter1.second;

interface Mother {}

class HeavyAnimal{}

class Hippo extends HeavyAnimal{}

public class InstanceofDemo {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        System.out.println(hippo instanceof Mother);
    }
}
