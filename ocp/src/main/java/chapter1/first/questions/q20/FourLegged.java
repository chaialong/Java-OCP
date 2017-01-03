package chapter1.first.questions.q20;

/**
 * Created by chaialong on 8/20/2016.
 */
public class FourLegged {
    String walk = "walk, ";
    static class BabyRhino extends FourLegged {
        String walk = "toddle, ";
    }

    public static void main(String[] args) {
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        System.out.println(f.walk);
        System.out.println(b.walk);
    }
}
