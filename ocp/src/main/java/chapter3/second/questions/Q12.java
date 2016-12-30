package chapter3.second.questions;

import java.io.FileNotFoundException;

public class Q12 {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Q12.printException(new FileNotFoundException("A"));
        Q12.printException(new Exception("B"));
        Q12.<NullPointerException>printException(new NullPointerException("D"));

//        Q12.printException(new Throwable("E"));
    }
}
