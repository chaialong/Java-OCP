package chapter3.review.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Ex5 {
    public static void main(String[] args) {
        HashSet<? super ClassCastException> set = new HashSet<Exception>();

        List<String> list = new Vector<String>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
