package chapter1.first.innterClass1;

/**
 * Created by chaialong on 8/17/2016.
 */
public class Outer {
    private String greeting = "Hi";

    protected class Inner{
        public int repeat = 3;
        public void go(){
            for (int i = 0; i < 3; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner(){
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.go();
    }
}
