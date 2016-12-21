package chapter3.second;

public class ComparableDemo implements Comparable<ComparableDemo>{
    private int id;

    @Override
    public int compareTo(ComparableDemo o) {
        return id - o.id;
    }

    public static void main(String[] args) {
        ComparableDemo c1 = new ComparableDemo();
        ComparableDemo c2 = new ComparableDemo();
        c1.id = 5;
        c2.id = 7;

        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c1));
        System.out.println(c1.compareTo(c1));
    }
}
