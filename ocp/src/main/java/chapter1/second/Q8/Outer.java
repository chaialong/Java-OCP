package chapter1.second.Q8;

public class Outer {
    private int x = 5;
    protected class Inner{
        public int x = 10;
        public void go(){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.go();
    }
}
