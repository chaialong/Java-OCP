package chapter1.questions.q14;

import java.util.ArrayList;

/**
 * Created by chaialong on 8/20/2016.
 */
public class IsItFurry {
    static class Chipmunk{}

    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l = new ArrayList();
        Runnable r = new Thread();
//        System.out.println(l instanceof Chipmunk);
        System.out.println(r instanceof Chipmunk);
    }
}
