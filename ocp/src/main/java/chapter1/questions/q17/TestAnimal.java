package chapter1.questions.q17;

/**
 * Created by chaialong on 8/20/2016.
 */
public class TestAnimal {
    public static void main(String[] args) {
        System.out.println(AnimalClasses.MAMMAL.hasHair());
        AnimalClasses.MAMMAL.giveWig();
        System.out.println(AnimalClasses.MAMMAL.hasHair());

    }
}
