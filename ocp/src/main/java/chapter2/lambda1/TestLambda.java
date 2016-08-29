package chapter2.lambda1;

public class TestLambda {
    public static void main(String[] args) {
        test(new Animal("bird", true), x -> x.isFly());
        test(new Animal("cat", false), x -> x.isFly());
    }

    private static void test(Animal animal, Fly fly){
        System.out.println(fly.canFly(animal));
    }
}
