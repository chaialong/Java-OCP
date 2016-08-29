package chapter3.review.questions;

import java.util.TreeSet;

public class Ex8 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
    }
}
