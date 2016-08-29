package chapter2.funcInterfaceDemo;

/**
 * Created by chaialong on 8/21/2016.
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), x -> x.canHop());
        print(new Animal("kangaroo", true, false), x -> x.canHop());
    }
}
