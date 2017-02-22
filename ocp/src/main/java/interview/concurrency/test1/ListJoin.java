package interview.concurrency.test1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListJoin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        String join = ListIntToString(list, ";");
        System.out.println("a".hashCode());
        System.out.println("aa".hashCode());
//        System.out.println(join);
    }

    private static String ListIntToString(List<Integer> list, String delimiter) {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(delimiter);
            }
        }

        return sb.toString();
    }
}
