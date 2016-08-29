package chapter3.review.questions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex7 {
    public static void main(String[] args) {
        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
