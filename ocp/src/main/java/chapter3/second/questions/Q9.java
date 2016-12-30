package chapter3.second.questions;

import java.util.Arrays;
import java.util.Comparator;

public class Q9 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.toLowerCase().compareTo(o1.toLowerCase());
    }

    public static void main(String[] args) {
        String[] values = {"123", "Abb", "abb"};
        Arrays.sort(values, new Q9());
        for (String s : values) {
            System.out.println(s);
        }
    }
}
