package chapter3.second.questions;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        List<String> list = new Vector<String>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
