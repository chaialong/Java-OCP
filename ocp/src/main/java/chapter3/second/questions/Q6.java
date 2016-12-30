package chapter3.second.questions;

public class Q6<T> {
    T t;

    public Q6(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.print(new Q6<String>("hi"));
        System.out.print(new Q6("there"));
    }
}
